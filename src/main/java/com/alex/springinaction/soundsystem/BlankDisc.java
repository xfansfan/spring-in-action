package com.alex.springinaction.soundsystem;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author alex
 *
 * Test class for bean autowire with xml configuration.
 */
public class BlankDisc implements CompactDisc {
	private final static Logger logger = LoggerFactory.getLogger(BlankDisc.class);
	private String title;
	private String artist;
	private List<String> tracks;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	
	public BlankDisc() {
	}

	public BlankDisc(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public BlankDisc(String title, String artist, List<String> tracks) {
		super();
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public void play() {
		// TODO Auto-generated method stub
		logger.debug("Playing "+title+" by "+artist);
		if(this.tracks!=null) {
			tracks.stream().forEach(t -> System.out.println("-Track: " + t));
		}
	}

	//method for getting values from property file, using Environment, @value annotation is resolve PropertySourcesPlaceholderConfigurer,
	//which is defined in ExpressiveConfig
	public BlankDisc(@Value("${disc.title}") String title) {
		super();
		this.title = title;
	}
}
