package com.qyc.springframework;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: qiangyuecheng
 * @date: 2021/9/6 6:30 下午
 */
public class BeanFactory {
    private Map<String,BeanDefinition> map = new HashMap<>();

    public Object getBean(String beanName){
        return map.get(beanName);
    }

    public void registerBeanDefinition(String beanName,BeanDefinition beanDefinition){
        if(map.get(beanName)==null){
            map.put(beanName,beanDefinition);
        }
    }

}
