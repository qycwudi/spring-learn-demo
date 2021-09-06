package com.qyc.springframeword.beans.factory.config;

import com.qyc.springframeword.beans.factory.factory.BeanFactory;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 7:03 下午
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass(){
        return this.beanClass;
    }
}
