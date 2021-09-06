package com.qyc.springframeword.beans.factory.support;

import com.qyc.springframeword.beans.factory.BeanException;
import com.qyc.springframeword.beans.factory.config.BeanDefinition;
import com.qyc.springframeword.beans.factory.config.BeanDefinitionRegistry;
import com.qyc.springframeword.beans.factory.config.SingletonBeanRegistry;
import com.qyc.springframeword.beans.factory.factory.BeanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:默认bean列表工厂
 * @author: qiangyuecheng
 * @date: 2021/9/6 11:16 下午
 */
public class DefaultListableBeanFactory extends AbstractAutowrieCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public BeanDefinition getBeanDefinition(String name) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (beanDefinition == null) {
            throw new BeanException("No bean named '" + name + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }
}
