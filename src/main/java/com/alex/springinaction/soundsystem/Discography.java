package com.alex.springinaction.soundsystem;

import java.util.List;

public class Discography {
	private String artist;
	private List<CompactDisc> cds;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public List<CompactDisc> getCds() {
		return cds;
	}
	public void setCds(List<CompactDisc> cds) {
		this.cds = cds;
	}
	public Discography(String artist, List<CompactDisc> cds) {
		super();
		this.artist = artist;
		this.cds = cds;
	}
	
	
}
