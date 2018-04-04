package com.alex.springinaction;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alex.springinaction.soundsystem.CDPlayerConfig;
import com.alex.springinaction.soundsystem.CompactDisc;
import com.alex.springinaction.soundsystem.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
//@ContextConfiguration(locations = { "classpath*:**/test-context.xml" })
public class CDPlayerTest {
	
	private final static Logger logger = LoggerFactory.getLogger(CDPlayerTest.class);

	@Autowired
	@Qualifier("lonelyHeartsClub")
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer player;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull("CD is null!",cd);
	}
	@Test
	public void playerShouldNotBeNull(){
		assertNotNull("Player is null!",cd);
	}
	@Test
	public void play(){
		player.play();
	}
}
