package com.tables.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Orchard {

	@Id
	private int track_id;
	private String track_name;
	
	/*@OneToMany
	private List<Leads> lead=new ArrayList();
	
	
	public List<Leads> getLead() {
		return lead;
	}
	public void setLead(List<Leads> lead) {
		this.lead = lead;
	}*/
	public int getTrack_id() {
		return track_id;
	}
	public void setTrack_id(int track_id) {
		this.track_id = track_id;
	}
	public String getTrack_name() {
		return track_name;
	}
	public void setTrack_name(String track_name) {
		this.track_name = track_name;
	}
	@Override
	public String toString() {
		return "Orchard [track_id=" + track_id + ", track_name=" + track_name + "]";
	}
	
	
}
