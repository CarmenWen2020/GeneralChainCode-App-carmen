
import com.CarmenWen.fabricgateway.FabricGateway;
//import com.CarmenWen.util.FabricUtil;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.Status;
import org.hyperledger.fabric.client.SubmittedTransaction;
import org.junit.Test;


import java.util.Scanner;

public class Test08 {
    @Test
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter key：");
        String key = sc.nextLine();
        System.out.println("Please enter value888：");
        String value = sc.nextLine();

        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();

        contract.submitTransaction("updateData", key,value);
        //{"author":"CarmenWen","email":"jwen758@auckland.ac.nz","degree":"MsD"}
    }
}

