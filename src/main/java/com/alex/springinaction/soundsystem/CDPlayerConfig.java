package com.alex.springinaction.soundsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages={"com.alex.springinaction.soundsystem"})
//@ComponentScan(basePackageClasses={SgtPeppers.class})
//@ComponentScan
public class CDPlayerConfig {
	private final static Logger logger = LoggerFactory.getLogger(CDPlayerConfig.class);
	@Bean(name="lonelyHeartsClub")
	public CompactDisc setSgtPeppers(){
		logger.debug("Creating bean SgtPeppers in configuration.");
		return new SgtPeppers();
	}
	@Bean
	public MediaPlayer setCDPlayer(){
		logger.debug("Creating bean CDPlayer in configuration.");
		return new CDPlayer(setSgtPeppers());
	}
}
