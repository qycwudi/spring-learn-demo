package com.qyc;

import com.qyc.serve.UserServes;
import com.qyc.springframeword.beans.factory.config.BeanDefinition;
import com.qyc.springframeword.beans.factory.factory.BeanFactory;
import com.qyc.springframeword.beans.factory.support.DefaultListableBeanFactory;
import com.qyc.springframeword.beans.factory.support.DefaultSingletonBeanRegistry;
import org.junit.Test;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 11:37 下午
 */
public class TestBeanDefinition {

    @Test
    public void test01(){
        UserServes userServes = new UserServes();
        BeanDefinition beanDefinition = new BeanDefinition(userServes.getClass());
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerBeanDefinition("userServes",beanDefinition);


        UserServes userServes1 = (UserServes) defaultListableBeanFactory.getBean("userServes");
        UserServes userServes2 = (UserServes) defaultListableBeanFactory.getBean("userServes");

        System.out.println(userServes1.hashCode());
        System.out.println(userServes2.hashCode());

    }
}
