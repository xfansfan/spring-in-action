package com.alex.springinaction.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * 
 * @author alex
 *
 * sample of mixed injection
 */

@Configuration
@Profile("dev") //sample of using profile annotation.
//@Import({CDConfig.class,CDPlayerConfig.class})
@Import({CDPlayerConfig.class})
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {

}
