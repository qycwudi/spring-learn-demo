package com.qyc.springframeword.beans.factory.factory;

/**
 * @description: Bean工厂
 * @author: qiangyuecheng
 * @date: 2021/9/6 10:50 下午
 */
public interface BeanFactory {
    /**
     * 获取bean方法
    */
    Object getBean(String bean);

    Object getBean(String bean,Object... args);
}
