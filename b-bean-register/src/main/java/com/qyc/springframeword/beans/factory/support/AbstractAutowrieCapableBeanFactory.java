package com.qyc.springframeword.beans.factory.support;

import com.qyc.springframeword.beans.factory.BeanException;
import com.qyc.springframeword.beans.factory.config.BeanDefinition;

/**
 * @description: 抽象自动注入bean工厂
 * @author: qiangyuecheng
 * @date: 2021/9/6 11:06 下午
 */
public abstract class AbstractAutowrieCapableBeanFactory extends AbstractBeanFactory {

    /**
     * public BeanDefinition getBeanDefinition(String name)
     * 交由子类实现
    */


    @Override
    public Object createBean(String beanName,BeanDefinition beanDefinition) throws BeanException {
        Object beanObject = null;
        try {
            beanObject = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        addSingleton(beanName,beanObject);
        return beanObject;
    }
}
