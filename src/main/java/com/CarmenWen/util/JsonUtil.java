package com.CarmenWen.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.CarmenWen.pojo.QueryResult;
import com.CarmenWen.pojo.QueryResultList;

import java.text.SimpleDateFormat;
import java.util.List;

public class JsonUtil {
    //simple getJson
    public static String getJson(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }

    public static String getJson(Object obj,String dataFormat) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //define date formate
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dataFormat);
        mapper.setDateFormat(simpleDateFormat);
        return  mapper.writeValueAsString(obj);
    }


    /**
     * 对集合进行转json
     * */
    public static String getJson(List<Object> objList) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(objList);
        return json;
    }


    /**
     * convert character from fabric query to QueryResultList
     * 将fabric查询出来的字符串转为 QueryResultList
     * */
    public static QueryResultList jsonStrToQueryResultList(String jsonStr) {
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        QueryResultList resultList = JSON.toJavaObject(jsonObject, QueryResultList.class);
//        JsonUtil工具 把jsonStr转为QueryResultList对象
        System.out.println("JsonUtil-- convert jsonStr to QueryResultList object ==》 "+resultList);
        return resultList;
    }

    /**
     * convert character from fabric query to  List<QueryResult>
     * 将fabric查询出来的字符串转为 List<QueryResult>
     * */
    public static List<QueryResult> jsonStrToList(String jsonStr) {

        QueryResultList queryResultList = jsonStrToQueryResultList(jsonStr);
        List<QueryResult> resultList = queryResultList.getResultList();
        //JsonUtil工具 把jsonStr转为List数组
        System.out.println("JsonUtil--Convert jsonStr to List Array ==》 "+resultList);
        return resultList;
    }
}
