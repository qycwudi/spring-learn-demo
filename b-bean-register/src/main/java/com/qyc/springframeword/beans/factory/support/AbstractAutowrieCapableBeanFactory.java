package com.qyc.springframeword.beans.factory.support;

import com.qyc.springframeword.beans.factory.BeanException;
import com.qyc.springframeword.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.time.Instant;

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

    private InstantiationStrategy instantiationStrategy = new CglibSubClassInstantiationStrategy();

    @Override
    public Object createBean(String beanName,BeanDefinition beanDefinition,Object[] args) throws BeanException {
        Object beanObject = null;
        beanObject = getCreateBean(beanName,beanDefinition,args);
        addSingleton(beanName,beanObject);
        return beanObject;
    }

    protected Object getCreateBean(String beanName, BeanDefinition beanDefinition,Object[] args){
        Constructor constructor = null;
        Constructor<?>[] constructorList = beanDefinition.getBeanClass().getDeclaredConstructors();
        for (Constructor c :
                constructorList) {
            if(null!=args&&c.getParameterTypes().length==args.length){
                constructor = c;
                break;
            }
        }
        return instantiationStrategy.instantiation(beanDefinition,beanName,constructor,args);
    }
    public InstantiationStrategy getInstantiationStrategy(){
        return this.instantiationStrategy;
    }
}
