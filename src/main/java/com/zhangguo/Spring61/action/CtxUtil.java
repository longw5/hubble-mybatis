package com.zhangguo.Spring61.action;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CtxUtil implements ApplicationContextAware {

	public static ApplicationContext springCtx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		springCtx=applicationContext;
	}
	
	//根据名称获得容器中的bean
	public static Object getBean(String name){
		return springCtx.getBean(name);
	}
	
	//根据类型获得容器中的bean
	public static <T> T getBean(Class<T> clazz){
		return springCtx.getBean(clazz);
	}

}
