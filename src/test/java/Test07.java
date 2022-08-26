
import com.CarmenWen.fabricgateway.FabricGateway;
//import com.CarmenWen.util.FabricUtil;
import com.CarmenWen.pojo.GeneralPaperSystemClasses;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.EndorseException;
import org.hyperledger.fabric.client.Status;
import org.hyperledger.fabric.client.SubmittedTransaction;
import org.junit.Test;
import io.grpc.*;


import java.util.Scanner;

public class Test07 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entry key：");
        String key = sc.nextLine();
        System.out.println("Entry value777：");
        String value = sc.nextLine();

        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();

        contract.submitTransaction("createData", key,value);

    }
    Boolean t;
    Boolean f;
    String id;
    @Test
    public void test0001() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        t = true;
        id = "paper000";
        GeneralPaperSystemClasses result = new GeneralPaperSystemClasses();
        result.setPaperID(id);
        String values = "{\"Credit\":1,\"PaperID\":"+t+",\"ReviewState\":"+t+",\"ai\":\"false\",\"arch\":\"false\",\"dm\":\"false\",\"edu\":\"false\",\"inter\":\"false\",\"net\":\"false\",\"par\":\"false\",\"secu\":\"false\",\"ssy\":\"false\",\"theo\":\"false\",\"vr\":\"true\"}";
//        String values = "{PaperID:none,ReviewState:true,ai:false,arch:false,dm:false,edu:false,inter:false,net:false,par:false,secu:false,ssy:false,theo:false,vr:true}";
//        contract.submitTransaction("updateData","user11",values);

        System.out.println(values);
        String values2 = "{\"Credit\":"+1+",\"PaperID\":\"none\",\"PW\":\"03d5a36ca36a863e73f721cf86a1ee2e\",\"ReviewState\":"+true+",\"ai\":"+false+",\"arch\":"+false+",\"dm\":"+false+",\"edu\":"+false+",\"inter\":"+true+",\"net\":"+true+",\"par\":"+true+",\"secu\":"+false+",\"ssy\":"+false+",\"theo\":"+false+",\"vr\":"+false+"}";

        try {
            //String values = "{\"author\":\"CarmenWen003\",\"email\":\"miu.won@gmail.com\",\"degree\":\"MsD\",\"url\":\"www.github.com/CarmenWen2020\"}";
            //{"PaperID":"none","ReviewState":"true","ai":"false","arch":"false","dm":"false","edu":"false","inter":"false","net":"false","par":"false","secu":"false","ssy":"false","theo":"false","vr":"true"}
            //{\"PaperID\":\"none\",\"ReviewState\":\"true\",\"ai\":\"false\",\"arch\":\"false\",\"dm\":\"false\",\"edu\":\"false\",\"inter\":\"false\",\"net\":\"false\",\"par\":\"false\",\"secu\":\"false\",\"ssy\":\"false\",\"theo\":\"false\",\"vr\":\"true\"}
            //{"author":"CarmenWen","email":"jwen758@auckland.ac.nz","degree":"MsD"}
            contract.submitTransaction("createData","user05",values2);

            System.out.println(values);
        }
        catch (EndorseException e){
            System.out.println("User is not Exist, please check the valid name");
        }
    }
}

