package com.jspiders.JavaConfigurations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jspiders.JavaConfigurations.dto.Base;
import com.jspiders.JavaConfigurations.dto.Practice;

@Configuration
@ComponentScan(basePackages = "com.jspiders.JavaConfigurations")
@PropertySource(value = "META-INF/config.properties")
public class JavaConfiguration {
	
	@Bean
	public Base getBaseBean() {
		return new Base();
	}
	
	@Bean
	public Practice getPracticeBean() {
		Practice object = new Practice();
		object.setBase(getBaseBean());
		return object;
	}

}
