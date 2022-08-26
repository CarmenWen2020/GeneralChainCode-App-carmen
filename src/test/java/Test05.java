import com.CarmenWen.fabricgateway.FabricGateway;
import com.CarmenWen.pojo.GeneralChainCode;
import com.CarmenWen.pojo.GeneralPaperSystemClasses;
import com.CarmenWen.pojo.QueryResult;
import com.CarmenWen.pojo.QueryResultList;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.hyperledger.fabric.client.Contract;
import org.junit.Test;

import java.util.List;

public class Test05 {

    @Test
    public void test01() throws Exception {
        FabricGateway fabricGateway = new FabricGateway();
        Contract contract = fabricGateway.getContract();
        String str = "{\"selector\":{\"ai\":"+true+",\"ReviewState\":"+true+"}, \"use_index\":[]}";// 富查询字符串
        //String str1 = "{\"selector\":{\"ssy\":"+true+",\"ReviewState\":"+true+",\"PaperID\":\"none\"}, \"use_index\":[]}";

        byte[] richQueries = contract.submitTransaction("richQuery", str);
        String s = new String(richQueries);

        JSONObject jsonObject = JSONObject.parseObject(s);
        QueryResultList resultList = JSON.toJavaObject(jsonObject, QueryResultList.class);
        List<QueryResult> resultValueList = resultList.getResultList();
        for (QueryResult a : resultValueList) {
            //System.out.println("for loop printing:"); //循环打印
            String key = a.getKey();
            //System.out.println(key);
            String json = a.getJson();
            //System.out.println(json);

            JSONObject jsonObject2 = JSONObject.parseObject(json);
            GeneralPaperSystemClasses data = JSON.toJavaObject(jsonObject2, GeneralPaperSystemClasses.class);

            System.out.println(key+" : Review State -> "+data.getReviewState());
        }
    }
}
