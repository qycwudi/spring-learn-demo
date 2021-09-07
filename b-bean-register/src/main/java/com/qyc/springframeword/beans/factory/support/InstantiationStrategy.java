package com.qyc.springframeword.beans.factory.support;

import com.qyc.springframeword.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @description: 实例化策略
 * @author: qiangyuecheng
 * @date: 2021/9/7 11:27 下午
 */
public interface InstantiationStrategy {
    Object instantiation(BeanDefinition beanDefinition, String beanName, Constructor constructor,Object[] args);
}
