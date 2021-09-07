package com.qyc.serve;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 11:38 下午
 */
public class UserServes {
    private String name;
    public UserServes(){

    }
    public UserServes(String name){
        this.name = name;
    }
    public void show(){
        System.out.println("show some things"+name);
    }
}
