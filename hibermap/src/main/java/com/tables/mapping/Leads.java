package com.tables.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
public class Leads {
	 
	@Id
	private int l_mid;
	private String l_name;
	//private String track;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="track_id")
	private Orchard o=new Orchard();
	
	public Orchard getO() {
		return o;
	}
	public void setO(Orchard o) {
		this.o = o;
	}
	public int getL_mid() {
		return l_mid;
	}
	public void setL_mid(int l_mid) {
		this.l_mid = l_mid;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	@Override
	public String toString() {
		return "Leads [l_mid=" + l_mid + ", l_name=" + l_name + ", o=" + o + "]";
	}
	
	
}
