package com.qyc;

import cn.hutool.Hutool;
import com.qyc.serve.Hobby;
import com.qyc.serve.UserServes;
import com.qyc.springframeword.beans.factory.config.BeanDefinition;
import com.qyc.springframeword.beans.factory.config.BeanReference;
import com.qyc.springframeword.beans.factory.config.PropertyValue;
import com.qyc.springframeword.beans.factory.config.PropertyValues;
import com.qyc.springframeword.beans.factory.factory.BeanFactory;
import com.qyc.springframeword.beans.factory.support.DefaultListableBeanFactory;
import com.qyc.springframeword.beans.factory.support.DefaultSingletonBeanRegistry;
import org.junit.Test;

import javax.annotation.Resource;
import javax.xml.ws.Holder;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Stack;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 11:37 下午
 */
public class TestBeanDefinition {


    /**
     * 测试bean注入  采用沟槽函数注入
    */
    @Test
    public void test01(){
        BeanDefinition beanDefinition = new BeanDefinition(UserServes.class);
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerBeanDefinition("userServes1",beanDefinition);
        defaultListableBeanFactory.registerBeanDefinition("userServes2",beanDefinition);

        UserServes userServes1 = (UserServes) defaultListableBeanFactory.getBean("userServes1","qyc",new Hobby("123","1"));
        UserServes userServes2 = (UserServes) defaultListableBeanFactory.getBean("userServes2","ssg",new Hobby("456","2"));

        userServes1.show();
        userServes2.show();
        System.out.println(userServes1.hashCode());
        System.out.println(userServes2.hashCode());
    }

    /**
     * 测试属性注入  基本参数
    */

    @Test
    public void test02(){
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        Hobby hobby = new Hobby("玩游戏","4");
        PropertyValue propertyValue1 = new PropertyValue("hobby",hobby);
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.add(propertyValue1);
        PropertyValue propertyValue2 = new PropertyValue("name","qyc");
        propertyValues.add(propertyValue2);

        BeanDefinition beanDefinition = new BeanDefinition(UserServes.class,propertyValues);
        defaultListableBeanFactory.registerBeanDefinition("qiangyuecheng",beanDefinition);
        
        UserServes userServes = (UserServes) defaultListableBeanFactory.getBean("qiangyuecheng");
        userServes.show();
    }
    
    /**
     * 测试属性注入 bean  采用get注入
    */
    @Test
    public void test03(){
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        PropertyValue propertyValue1 = new PropertyValue("hobbyName","打游戏");
        PropertyValue propertyValue2 = new PropertyValue("hobbyYear","10");
        PropertyValues propertyValues1 = new PropertyValues();
        propertyValues1.add(propertyValue1);
        propertyValues1.add(propertyValue2);
        BeanDefinition beanDefinition1 = new BeanDefinition(Hobby.class,propertyValues1);
        defaultListableBeanFactory.registerBeanDefinition("hobbyBean",beanDefinition1);

        PropertyValue propertyValue3 = new PropertyValue("name","qiangyuecheng");
        PropertyValue propertyValue4 = new PropertyValue("hobby",new BeanReference("hobbyBean"));
        PropertyValues propertyValues2 = new PropertyValues();
        propertyValues2.add(propertyValue3);
        propertyValues2.add(propertyValue4);
        BeanDefinition beanDefinition2 = new BeanDefinition(UserServes.class,propertyValues2);
        defaultListableBeanFactory.registerBeanDefinition("userServer",beanDefinition2);

        UserServes userServes = (UserServes) defaultListableBeanFactory.getBean("userServer");
        userServes.show();

    }
}
