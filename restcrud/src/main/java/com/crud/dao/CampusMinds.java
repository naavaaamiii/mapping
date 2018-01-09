package com.crud.dao;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CampusMinds {
	
	private String mid;
	private String name;
	private String track;
	
	
	
	public CampusMinds()
	{
		
	}
	public CampusMinds(String mid,String name,String track)
	{
		super();
		this.mid=mid;
		this.name=name;
		this.track=track;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	
}
