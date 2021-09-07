package com.qyc.springframeword.beans.factory.support;

import com.qyc.springframeword.beans.factory.BeanException;
import com.qyc.springframeword.beans.factory.config.BeanDefinition;
import com.qyc.springframeword.beans.factory.factory.BeanFactory;

/**
 * @description:抽象bean工厂
 *
 * 使用模板方法设计模式，实现getbean方法
 *
 * @author: qiangyuecheng
 * @date: 2021/9/6 10:58 下午
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
   /**
    * 模板方法设计模式
   */
    @Override
    public Object getBean(String name) {
        return doGetBean(name,null);
    }

    @Override
    public Object getBean(String name, Object... args) {
        return doGetBean(name,args);
    }

    public <T> T doGetBean(String name,Object... args){
        Object beanObject =  getSingleton(name);
        if(beanObject!=null){
            return (T)beanObject;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T)createBean(name,beanDefinition,args);
    }

    /**
     * 获取bean定义方法
    */
    public abstract BeanDefinition getBeanDefinition(String name);
    
    /**
     * 初始化bean
    */
    public abstract Object createBean(String beanName,BeanDefinition beanDefinition,Object[] args)throws BeanException;
}
