package com.qyc.serve;

import java.util.HashMap;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 11:38 下午
 */
public class UserServes {
    private String name;
    private Hobby hobby;
    public UserServes(){

    }
    public UserServes(String name,Hobby hobby){
        this.name = name;
        this.hobby = hobby;
    }
    public String getName(){
        return name;
    }

    public Hobby getHobby(){
        return hobby;
    }
    public void show(){
        System.out.println("姓名:"+name);
        System.out.println("爱好:"+hobby.getHobbyName()+"-时间:"+hobby.getHobbyYear()+"年");
    }
}
