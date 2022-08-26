import com.CarmenWen.fabricgateway.FabricGateway;
import com.CarmenWen.pojo.GeneralPaperSystemClasses;
import org.hyperledger.fabric.client.Contract;
import org.hyperledger.fabric.client.Status;
import org.hyperledger.fabric.client.SubmittedTransaction;
import org.junit.Test;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.CarmenWen.fabricgateway.FabricGateway;
import com.CarmenWen.pojo.GeneralChainCode;
import com.CarmenWen.pojo.QueryResult;
import com.CarmenWen.pojo.QueryResultList;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class TestConnToNetworkByFabricGateway {

    @Test
    public void test01() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        SubmittedTransaction submittedTransaction = contract.newProposal("queryData")
                .addArguments("user7")//参数
                .build()
                .endorse()
                .submitAsync();
        System.out.println("contract=======> " + contract);
        System.out.println();

        byte[] result1 = submittedTransaction.getResult();
        String s = new String(result1);
        System.out.println("Initial Data =======> " + s);
        System.out.println();

        Status status = submittedTransaction.getStatus();
        byte[] result = submittedTransaction.getResult();
        System.out.println("Block Number =======> " + status.getBlockNumber());
        System.out.println();
        System.out.println("Transaction Id=======> " + status.getTransactionId());
        System.out.println();
        System.out.println("code =======> " + status.getCode());
        System.out.println();
        System.out.println("Testing Successful =======> " + status.isSuccessful());
        System.out.println();
        System.out.println("初始数据=======>" + new String(result));
        System.out.println();
    }
    @Test
    public void test011() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        SubmittedTransaction submittedTransaction = contract.newProposal("createData")
                .addArguments("user14")//参数
                .addArguments("{\"Credit\":1,\"PaperID\":\"none\",\"ReviewState\":\"true\",\"ai\":\"false\",\"arch\":\"false\",\"dm\":\"false\",\"edu\":\"false\",\"inter\":\"false\",\"net\":\"false\",\"par\":\"false\",\"secu\":\"false\",\"ssy\":\"false\",\"theo\":\"false\",\"vr\":\"true\"}")
                .build()
                .endorse()
                .submitAsync();
        System.out.println("submittedTransaction" + submittedTransaction);
        System.out.println();
        System.out.println("contract=======> " + contract);
        System.out.println();

        byte[] result1 = submittedTransaction.getResult();
        System.out.println("result1 = submittedTransaction.getResult()=======> " + result1);
        System.out.println();
        String s = new String(result1);
        System.out.println("Initial Data =======> " + s);
        System.out.println();

        Status status = submittedTransaction.getStatus();
        byte[] result = submittedTransaction.getResult();
        System.out.println("status = submittedTransaction.getStatus() =======> " + status);
        System.out.println();
        System.out.println("result = submittedTransaction.getResult() =======> " + result);
        System.out.println();
        System.out.println("Block Number =======> " + status.getBlockNumber());
        System.out.println();
        System.out.println("Transaction Id=======> " + status.getTransactionId());
        System.out.println();
        System.out.println("code =======> " + status.getCode());
        System.out.println();
        System.out.println("Testing Successful =======> " + status.isSuccessful());
        System.out.println();
        System.out.println("初始数据=======>" + new String(result));
        System.out.println();
    }

    @Test
    public void test02() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        byte[] bytes = contract.evaluateTransaction("queryAllByKey", "user0");
        System.out.println("Initial Data =======> " + new String(bytes));
        System.out.println();
    }

    @Test
    public void test021() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        //String str = "{\"selector\":{\"ai\":\"true\",\"ReviewState\":\"true\"}, \"use_index\":[]}";// 富查询字符串
        byte[] normalQueries = contract.submitTransaction("queryData", "user05");
        String s = new String(normalQueries);
        System.out.println("s" + s);

        String YourMessage = "";
        JSONObject jsonObject = JSONObject.parseObject(s);
        System.out.println("s1" + jsonObject);
        YourMessage += "Credit: " + jsonObject.get("Credit") + "\n"
                + "Paper ID: " + jsonObject.get("PaperID") + "\n"
                + "Review State: " + jsonObject.get("ReviewState") + "\n"
                + "Your Selected Category are: " + "\n";


        String[] keys = new String[]{"ai", "arch", "dm", "edu", "inter", "net", "par", "secu", "ssy", "theo", "vr"};
        String[] cat = new String[]{"Artificial Intelligence", "Architecture", "Data Mining", "Educational Technology",
                "Human Computer Interaction", "Computer Networks & Wireless Communication", "Parallel Distributed System",
                "Computer Security & Cryptography", "Software Systems", "Theoretical Computer Science", "Computer Vision & Graphic"};
        for (int i = 0; i < 11; i++) {
            if ((Boolean) jsonObject.get(keys[i])) {
                YourMessage += cat[i] + "\n";
            }
        }
        System.out.println(YourMessage);
    }




        /*QueryResultList resultList = JSON.toJavaObject(jsonObject, QueryResultList.class);
        System.out.println("s2"+resultList);
        List<QueryResult> resultValueList = resultList.getResultList();
        System.out.println("s3"+resultValueList);



        for (QueryResult a : resultValueList) {
            System.out.println("for loop printing:"); //循环打印
            String key = a.getKey();
            //System.out.println(key);
            String json = a.getJson();
            //System.out.println(json);

            JSONObject jsonObject2 = JSONObject.parseObject(json);
            GeneralPaperSystemClasses data = JSON.toJavaObject(jsonObject2, GeneralPaperSystemClasses.class);

            System.out.println(key+" : Review State -> "+data.getReviewState());
            System.out.println(key+" : AI -> "+data.getAi());
        }*/

    // test03 和 test02 虽然都是查询初始数据，但是你会发现一个在你部署的 Hyperledger Explorer 中
    // 你执行test03 会形成交易，并且会打包成区块，而你test02中的调用不会

    @Test
    public void test03() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        SubmittedTransaction submittedTransaction = contract.newProposal("queryData")
                .addArguments("paper000")//参数
                .build()
                .endorse()
                .submitAsync();
        byte[] result = submittedTransaction.getResult();
        System.out.println(new String(result));

        JSONObject jsonObject = JSONObject.parseObject(new String(result));
        System.out.println(jsonObject);
        System.out.println( jsonObject.get("MarkedBy"));
        System.out.println( jsonObject.get("report"));
    }

    @Test
    public void test03_2() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        byte[] bytes = contract.evaluateTransaction("queryData", "test00");
        System.out.println("Initial Data =======> " + new String(bytes));
        String s = new String(bytes);
        JSONObject jsonObject = JSONObject.parseObject(s);
        System.out.println( jsonObject.get("MarkedBy"));
        System.out.println( jsonObject.get("report"));
    }




    /*富查询邮箱为miu.won@gmail.com*/
    @Test
    public void test04() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        String str = "{\"selector\":{\"email\":\"miu.won@gmail.com\"}, \"use_index\":[]}";// 富查询字符串
        byte[] richQueries = contract.submitTransaction("richQuery", str);
        String s = new String(richQueries);
        System.out.println(new String(richQueries));
    }


    /*富查询邮箱为miu.won@gmail.com 的作者*/
    @Test
    public void test05() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        String str = "{\"selector\":{\"email\":\"miu.won@gmail.com\"}, \"use_index\":[]}";// 富查询字符串
        byte[] richQueries = contract.submitTransaction("richQuery", str);

        String s = new String(richQueries);
        JSONObject jsonObject = JSONObject.parseObject(s);
        QueryResultList resultList = JSON.toJavaObject(jsonObject, QueryResultList.class);
        List<QueryResult> resultValueList = resultList.getResultList();

        for (QueryResult a : resultValueList) {
//            System.out.println(a); //循环打印

            String json = a.getJson();
            System.out.println(json);


            JSONObject jsonObject2 = JSONObject.parseObject(json);
            GeneralChainCode data = JSON.toJavaObject(jsonObject2, GeneralChainCode.class);

            System.out.println(data.getUrl());
            System.out.println(data.getEmail());
            System.out.println(data.getAuthor());
        }
    }

    @Test
    public void test051() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        String str = "{\"selector\":{\"ai\":true,\"ReviewState\":true}, \"use_index\":[]}";// 富查询字符串
        String str1 = "{\"selector\":{\"ai\":true,\"ReviewState\":true}, \"use_index\":[]}";
        byte[] richQueries = contract.submitTransaction("richQuery", str1);
        String s = new String(richQueries);
        System.out.println("s"+s);

        JSONObject jsonObject = JSONObject.parseObject(s);
        QueryResultList resultList = JSON.toJavaObject(jsonObject, QueryResultList.class);
        List<QueryResult> resultValueList = resultList.getResultList();

        for (QueryResult a : resultValueList) {
            System.out.println("for loop printing:"+a); //循环打印
            String key = a.getKey();
            System.out.println("k"+key);
            String json = a.getJson();
            System.out.println("j"+json);

            JSONObject jsonObject2 = JSONObject.parseObject(json);
            GeneralPaperSystemClasses data = JSON.toJavaObject(jsonObject2, GeneralPaperSystemClasses.class);

            System.out.println(key+" : Review State -> "+data.getReviewState());
            System.out.println(key+" : Credit -> "+jsonObject2.get("Credit"));
        }
    }
}
