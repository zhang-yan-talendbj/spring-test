package com.stone.spring.beanfactory;

import org.springframework.beans.factory.InitializingBean;

public class InitializingBeanImpl implements InitializingBean {

	private boolean init = false;

	public boolean isInit() {
		return init;
	}

	public void afterPropertiesSet() throws Exception {
		init = true;
	}
}
