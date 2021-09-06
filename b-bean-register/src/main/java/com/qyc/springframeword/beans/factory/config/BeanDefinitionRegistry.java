package com.qyc.springframeword.beans.factory.config;

/**
 * bean定义注册不爱
 * @author: qiangyuecheng
 * @date: 2021/9/6
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanDefinitionName,BeanDefinition beanDefinition);
}
