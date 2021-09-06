package com.qyc.springframeword.beans.factory.support;

import com.qyc.springframeword.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:默认单例bean注册表
 * @author: qiangyuecheng
 * @date: 2021/9/6 10:53 下午
 */
public abstract class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String,Object> singletonMap = new HashMap<>();
    @Override
    public Object getSingleton(String bean) {
        return singletonMap.get(bean);
    }

    /**
     * 存入单例实例
    */
    public void addSingleton(String beanName,Object bean){
        singletonMap.put(beanName,bean);
    }

}
