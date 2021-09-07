package com.qyc;

import com.qyc.serve.UserServes;
import com.qyc.springframeword.beans.factory.config.BeanDefinition;
import com.qyc.springframeword.beans.factory.factory.BeanFactory;
import com.qyc.springframeword.beans.factory.support.DefaultListableBeanFactory;
import com.qyc.springframeword.beans.factory.support.DefaultSingletonBeanRegistry;
import org.junit.Test;

import java.util.Stack;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 11:37 下午
 */
public class TestBeanDefinition {

    @Test
    public void test01(){

        BeanDefinition beanDefinition = new BeanDefinition(UserServes.class);
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerBeanDefinition("userServes",beanDefinition);
        defaultListableBeanFactory.registerBeanDefinition("userServes1",beanDefinition);

        UserServes userServes1 = (UserServes) defaultListableBeanFactory.getBean("userServes","qyc");
        UserServes userServes2 = (UserServes) defaultListableBeanFactory.getBean("userServes1","ssg");

        userServes1.show();
        userServes2.show();
        System.out.println(userServes1.hashCode());
        System.out.println(userServes2.hashCode());

    }
}
