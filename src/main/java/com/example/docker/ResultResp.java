package com.example.docker;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.Serializable;

/**
 * @Description:
 * @ClassName: com.example.docker
 * @Author: yuyong
 * @CreateDate: 2019/3/6 15:50
 * @UpdateUser:
 * @UpdateDate: 2019/3/6 15:50
 * @UpdateRemark:
 * @Version: 1.0
 * @since JDK 1.8
 */
public class ResultResp<T> implements Serializable {

    private String message;

    private String code;

    private T data;

    public ResultResp(){

    }

    public static ResultBuild message(String message){
        ResultBuild resultBuild =new ResultBuild();
        return resultBuild.message(message);
    }

    public static ResultBuild code(String code){
        ResultBuild resultBuild =new ResultBuild();
        return resultBuild.code(code);
    }

    public static <T> ResultBuild<T> data(T t){
        ResultBuild resultBuild =new ResultBuild();
        return resultBuild.data(t);
    }

    public String json(){
        try {
          return  new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "{}";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        ResultResp resultResp = ResultResp.code("00000").message("success").build();
        System.out.println(resultResp.json());
    }
}
