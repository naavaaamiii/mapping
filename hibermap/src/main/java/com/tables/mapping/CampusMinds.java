package com.tables.mapping;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
public class CampusMinds {
	@Id
	private int mid;
	private String name;
	private long phno;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="l_mid")
	private Leads l;
	
	
	public Leads getL() {
		return l;
	}
	public void setL(Leads l) {
		this.l = l;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "CampusMinds [mid=" + mid + ", name=" + name + ", phno=" + phno + ", l=" + l + "]";
	}
	
	
	

}
