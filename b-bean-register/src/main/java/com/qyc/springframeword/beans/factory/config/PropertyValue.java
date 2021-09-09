package com.qyc.springframeword.beans.factory.config;

import java.util.Properties;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/9 11:10 上午
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name,Object value){
        this.name = name;
        this.value = value;
    }

    public Object getValue(){
        return value;
    }

    public String getName(){
        return name;
    }

}
