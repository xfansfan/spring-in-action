package com.alex.springinaction.soundsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.alex.springinaction.soundsystem.annotation.RockNRoll;

@Component("lonelyHeartsClub")
@Primary
//@Component
//@Qualifier("lonelyHeartsClub")
@RockNRoll  //customized annotation with @Qualifier
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SgtPeppers implements CompactDisc {

	private String title="Sgt. Pepper's Lonely Hearts Club Band";
	private String artist="The Beatles";
	private final static Logger logger = LoggerFactory.getLogger(SgtPeppers.class);
	
	
	
	public void play() {
		// TODO Auto-generated method stub
		logger.debug("Playing "+title+" by "+artist);
	}
}
