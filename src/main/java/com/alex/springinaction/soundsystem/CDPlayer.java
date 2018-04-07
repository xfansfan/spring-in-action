package com.alex.springinaction.soundsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	
	private final static Logger logger = LoggerFactory.getLogger(CDPlayer.class);

	private CompactDisc cd;
	
	public CompactDisc getCd() {
		return cd;
	}
	@Autowired
	@Qualifier("lonelyHeartsClub")
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
	
	public CDPlayer() {
		
	}

	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd=cd;
		logger.debug(this.cd.getClass().getSimpleName()+" has been wired in method CDPlayer.");
	}
	
	@Autowired
	@Qualifier("lonelyHeartsClub")
	public void insertDisc(CompactDisc cd){
		this.cd=cd;
		logger.debug(this.cd.getClass().getSimpleName()+" has been wired in method insertDisc.");
	}
	
	public void play() {
		// TODO Auto-generated method stub
		cd.play();
	}

}
