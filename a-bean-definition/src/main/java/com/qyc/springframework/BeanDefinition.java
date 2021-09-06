package com.qyc.springframework;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 6:29 下午
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object object){
        this.bean = object;
    }
    public Object getBeanDefinition(){
        return this.bean;
    }
}
