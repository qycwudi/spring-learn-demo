package com.qyc.springframeword.beans.factory.config;

/** 
 *  单例注册表接口
 * @author: qiangyuecheng
 * @date: 2021/9/6 
 */
public interface SingletonBeanRegistry {
    /**
     * 根据bean信息获取单例的实例
    */
    Object getSingleton(String bean);
}
