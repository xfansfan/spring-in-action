package com.alex.springinaction;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alex.springinaction.soundsystem.CDPlayerConfig;
import com.alex.springinaction.soundsystem.SgtPeppers;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	private SgtPeppers cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull("Object is null!",cd);
	}
}
