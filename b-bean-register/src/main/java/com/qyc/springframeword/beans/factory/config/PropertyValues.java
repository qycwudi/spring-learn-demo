package com.qyc.springframeword.beans.factory.config;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: bean成员
 * @author: qiangyuecheng
 * @date: 2021/9/9 11:11 上午
 */
public class PropertyValues {
    private List<PropertyValue> list;

    public PropertyValues(){
        list = new ArrayList<>();
    }
    public List<PropertyValue> getList() {
        return list;
    }
    public Object getValue(String name){
        for (PropertyValue pro:list) {
            if(pro.getName().equals(name)){
                return pro.getValue();
            }
        }
        return null;
    }

    public void add(PropertyValue propertyValue){
        list.add(propertyValue);
    }
}
