package com.alex.springinaction.soundsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
//@Component
public class SgtPeppers implements CompactDisc {

	private String title="Sgt. Pepper's Lonely Hearts Club Band";
	private String artist="The Beatles";
	private final static Logger logger = LoggerFactory.getLogger(SgtPeppers.class);
	
	
	
	public void play() {
		// TODO Auto-generated method stub
		logger.debug("Playing "+title+" by "+artist);
	}
}
