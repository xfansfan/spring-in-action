package com.alex.springinaction.soundsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * 
 * @author alex
 *
 * sample class of spring configuration with property file.
 */
@Configuration
@PropertySource("classpath:/com/soundsystem/app.properties")
public class ExpressiveConfig {

	private final static Logger logger = LoggerFactory.getLogger(ExpressiveConfig.class);
	
	@Autowired
	Environment env;
	
	@Bean
	public BlankDisc disc() {
		Boolean isTitleExisting=env.containsProperty("disc.title");
		if(isTitleExisting)
			logger.debug("disc.title is exsiting...");
		return new BlankDisc(env.getProperty("disc.title"),env.getProperty("disc.artist"));
	}
}
