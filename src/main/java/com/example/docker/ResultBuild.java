package com.example.docker;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Description:
 * @ClassName: com.example.docker
 * @Author: yuyong
 * @CreateDate: 2019/3/6 15:51
 * @UpdateUser:
 * @UpdateDate: 2019/3/6 15:51
 * @UpdateRemark:
 * @Version: 1.0
 * @since JDK 1.8
 */
public class ResultBuild<T> implements Serializable {

    private String message;

    private String code;

    private T t;

    public  ResultBuild(){

    }

    public ResultResp<T> build(){
        ResultResp<T> resultResp = new ResultResp<>();
        resultResp.setCode(code);
        resultResp.setMessage(null != message ? message : "");
        resultResp.setData(t);
        return resultResp;
    }

    public ResultBuild code(String code){
        this.code=code;
        return this;
    }

    public ResultBuild message(String message){
        this.message =message;
        return this;
    }

    public ResultBuild data(T t){
        this.t=t;
        return this;
    }
}
