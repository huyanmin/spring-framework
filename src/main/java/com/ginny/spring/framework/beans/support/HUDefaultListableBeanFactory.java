package com.ginny.spring.framework.beans.support;

import com.ginny.spring.framework.beans.config.HUBeanDefinition;
import com.ginny.spring.framework.context.support.GPAbstractApplicationContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Ginny
 * @Desc: //TODO
 * @Date:Create 2019/4/28 18:24
 */
public class HUDefaultListableBeanFactory extends GPAbstractApplicationContext {

    private final Map<String, HUBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, HUBeanDefinition>();

}
