package com.stone.spring.beanfactory;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;

public class InitializingBeanTest {
	@Test
	public void initBeanWithInitializingBean() throws Exception {
		// new classpathxml
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource(
				"com/stone/spring/beanfactory/bean.xml"));
		InitializingBeanImpl bean = (InitializingBeanImpl) xmlBeanFactory.getBean("initializingBeanTest");
		assertTrue(bean.isInit());
		//Debug org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(String, Object, RootBeanDefinition)
	}
}
