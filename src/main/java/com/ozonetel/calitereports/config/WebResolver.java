/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozonetel.calitereports.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author sharma
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.ozonetel")
public class WebResolver 
	{
		@Bean
		public InternalResourceViewResolver getViewResolver()
		{
			InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
			viewResolver.setPrefix("/WEB-INF/jsp/");
			return viewResolver;
		}

	}