package com.qyc.springframeword.beans.factory;

import com.qyc.springframeword.beans.factory.config.BeanDefinition;

/**
 * @description: Bean异常
 * @author: qiangyuecheng
 * @date: 2021/9/6 7:05 下午
 */
public class BeanException extends RuntimeException{
    public BeanException(String msg){
        super(msg);
    }
    public BeanException(String msg,Throwable throwable){
        super(msg,throwable);
    }
}
