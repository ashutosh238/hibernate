/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozonetel.calitereports.config;

import com.ozonetel.calitereports.hibernateConfig.RepositoryConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author sharma
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer

	{

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return new Class[] {WebResolver.class,RepositoryConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		 
		return new String[] {"/"};
	}
		
	
	}
