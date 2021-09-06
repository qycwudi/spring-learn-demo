package com.qyc;

import com.qyc.bean.UserBean;
import com.qyc.springframework.BeanDefinition;
import com.qyc.springframework.BeanFactory;
import org.junit.Test;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 6:40 下午
 */
public class TestBeanDefinition {

    @Test
    public void testBeanDefinition(){
        UserBean userBean = new UserBean();
        BeanDefinition beanDefinition = new BeanDefinition(userBean);
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDefinition("beanDefinition",beanDefinition);

        UserBean userBean1 = (UserBean) ((BeanDefinition) beanFactory.getBean("beanDefinition")).getBeanDefinition();
        userBean1.todo();
    }

}
