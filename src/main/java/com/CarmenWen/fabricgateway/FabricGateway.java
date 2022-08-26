package com.CarmenWen.fabricgateway;


import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import org.hyperledger.fabric.client.*;
import org.hyperledger.fabric.client.identity.Identities;
import org.hyperledger.fabric.client.identity.Signers;
import org.hyperledger.fabric.client.identity.X509Identity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;


public class FabricGateway {
    String networkConnectionConfigPath = "/usr/software/fabric-samples/test-network/organizations/peerOrganizations/org1.example.com/connection-org1.json";
    String networkConnectionConfigPathRemote = "src/main/resources/peerOrganizations/org1.example.com/connection-org1.json";

    //String tlsCertPath = "/Users/carmenw/github.com/CarmenWen2020/fabric-samples/test-network/organizations/peerOrganizations/org1.example.com/peers/peer0.org1.example.com/tls/ca.crt";
    //String privateKeyPath="/Users/carmenw/github.com/CarmenWen2020/fabric-samples/test-network/organizations/peerOrganizations/org1.example.com/users/User1@org1.example.com/msp/keystore/4ad33e4cd07bf3b43cc0e2c863fb0be2d70bf1d332ce9ec0cb5bf34605d72d89_sk";
    //String certificatePath="/usr/software/fabric-samples/test-network/organizations/peerOrganizations/org1.example.com/users/User1@org1.example.com/msp/signcerts/User1@org1.example.com-cert.pem";


    String tlsCertPath = "/Users/carmenw/Desktop/CarmenNetwork-3org/crypto-config/peerOrganizations/org1.carmenw.com/peers/peer0.org1.carmenw.com/tls/ca.crt";
    String certificatePath="/Users/carmenw/Desktop/CarmenNetwork-3org/crypto-config/peerOrganizations/org1.carmenw.com/users/User1@org1.carmenw.com/msp/signcerts/User1@org1.carmenw.com-cert.pem";
    String privateKeyPath="/Users/carmenw/Desktop/CarmenNetwork-3org/crypto-config/peerOrganizations/org1.carmenw.com/users/User1@org1.carmenw.com/msp/keystore/priv_sk";



 /*   String tlsCertPath = "/Users/carmenw/Desktop/CarmenNetwork-3org/crypto-config/peerOrganizations/org2.carmenw.com/peers/peer0.org2.carmenw.com/tls/ca.crt";
    String certificatePath="/Users/carmenw/Desktop/CarmenNetwork-3org/crypto-config/peerOrganizations/org2.carmenw.com/users/User1@org2.carmenw.com/msp/signcerts/User1@org2.carmenw.com-cert.pem";
    String privateKeyPath="/Users/carmenw/Desktop/CarmenNetwork-3org/crypto-config/peerOrganizations/org2.carmenw.com/users/User1@org2.carmenw.com/msp/keystore/priv_sk";*/


/*

    String tlsCertPath = "/Users/carmenw/Desktop/CarmenNetwork-3org/crypto-config/peerOrganizations/org3.carmenw.com/peers/peer0.org3.carmenw.com/tls/ca.crt";
    String certificatePath="/Users/carmenw/Desktop/CarmenNetwork-3org/crypto-config/peerOrganizations/org3.carmenw.com/users/User1@org3.carmenw.com/msp/signcerts/User1@org3.carmenw.com-cert.pem";
    String privateKeyPath="/Users/carmenw/Desktop/CarmenNetwork-3org/crypto-config/peerOrganizations/org3.carmenw.com/users/User1@org3.carmenw.com/msp/keystore/priv_sk";
*/

/*    String tlsCertPath_1 = "/Users/carmenw/Desktop/GeneralChainCode-App-carmen/src/main/resources/ca_1.crt";
    String certificatePath_1 = "/Users/carmenw/Desktop/GeneralChainCode-App-carmen/src/main/resources/User1@org1.example.com-cert.pem";
    String privateKeyPath_1 = "/Users/carmenw/Desktop/GeneralChainCode-App-carmen/src/main/resources/priv_sk_1";*/

    String mspId_1="Org1MSP";
    String mspId_2="Org2MSP";
    String mspId_3="Org3MSP";

    String channel="carmenchannel-3org";
    String chaincode="PaperSystem";

    public Gateway gateway() throws Exception {


        BufferedReader certificateReader = Files.newBufferedReader(Paths.get(certificatePath), StandardCharsets.UTF_8);

        X509Certificate certificate = Identities.readX509Certificate(certificateReader);

        BufferedReader privateKeyReader = Files.newBufferedReader(Paths.get(privateKeyPath), StandardCharsets.UTF_8);

        PrivateKey privateKey = Identities.readPrivateKey(privateKeyReader);

        Gateway gateway = Gateway.newInstance()
                .identity(new X509Identity(mspId_3 , certificate))
                .signer(Signers.newPrivateKeySigner(privateKey))
                .connection(newGrpcConnection())
                .evaluateOptions(CallOption.deadlineAfter(5, TimeUnit.SECONDS))
                .endorseOptions(CallOption.deadlineAfter(15, TimeUnit.SECONDS))
                .submitOptions(CallOption.deadlineAfter(5, TimeUnit.SECONDS))
                .commitStatusOptions(CallOption.deadlineAfter(1, TimeUnit.MINUTES))
                .connect();
        return gateway;
    }

    private ManagedChannel newGrpcConnection() throws IOException, CertificateException {
        Reader tlsCertReader = Files.newBufferedReader(Paths.get(tlsCertPath));
        System.out.println("===========================================reader========");
        X509Certificate tlsCert = Identities.readX509Certificate(tlsCertReader);
        return NettyChannelBuilder.forTarget("172.23.94.28:11051")
                .sslContext(GrpcSslContexts.forClient().trustManager(tlsCert).build())
                .overrideAuthority("peer0.org3.carmenw.com")
                .build();
    }

    public Network network(Gateway gateway) {
        return gateway.getNetwork(channel);
    }

   /* public Contract catContract(Network network) {
        return network.getContract("PaperSystem");
    }*/

/*    public ChaincodeEventListener chaincodeEventListener(Network network) {
        return new ChaincodeEventListener(network);
    }*/

    public Contract getContract() throws Exception {
        Gateway gateway = gateway();
        Network network = network(gateway);
        Contract contract = network.getContract(chaincode);
        return contract;
    }
}
