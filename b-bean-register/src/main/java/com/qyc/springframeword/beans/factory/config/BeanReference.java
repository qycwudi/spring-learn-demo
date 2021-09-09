package com.qyc.springframeword.beans.factory.config;

/**
 * @description: bean引用
 * @author: qiangyuecheng
 * @date: 2021/9/9 11:08 上午
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName){
        this.beanName = beanName;
    }

    public String getBeanName(){
        return beanName;
    }

}
