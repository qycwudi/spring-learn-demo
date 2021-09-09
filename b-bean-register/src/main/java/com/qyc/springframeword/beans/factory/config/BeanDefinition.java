package com.qyc.springframeword.beans.factory.config;

import com.qyc.springframeword.beans.factory.factory.BeanFactory;

import java.util.Properties;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 7:03 下午
 */
public class BeanDefinition {
    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass,PropertyValues propertyValues){
        this.beanClass = beanClass;
        this.propertyValues = propertyValues!=null?propertyValues:new PropertyValues();
    }

    public Class getBeanClass(){
        return this.beanClass;
    }
    public PropertyValues getPropertyValues(){
        return this.propertyValues;
    }
}
