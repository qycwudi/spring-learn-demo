package com.qyc.serve;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/9 12:09 下午
 */
public class Hobby {
    private String hobbyName;
    private String hobbyYear;

    public Hobby(){
    }
    public Hobby(String hobbyName,String hobbyYear){
        this.hobbyName = hobbyName;
        this.hobbyYear = hobbyYear;
    }

    public String getHobbyName(){
        return hobbyName;
    }

    public String getHobbyYear(){
        return hobbyYear;
    }


}
