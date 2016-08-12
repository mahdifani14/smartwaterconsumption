package com.wsm.model;
// Generated May 21, 2016 9:39:06 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ConsumerSegment generated by hbm2java
 */
@Entity
@Table(name = "consumer_segment", catalog = "watermeter")
public class ConsumerSegment implements java.io.Serializable {

	private int oid;
	private String name;
	private String description;

	public ConsumerSegment() {
	}

	public ConsumerSegment(int oid) {
		this.oid = oid;
	}

	public ConsumerSegment(int oid, String name, String description) {
		this.oid = oid;
		this.name = name;
		this.description = description;
	}

	@Id

	@Column(name = "oid", unique = true, nullable = false)
	public int getOid() {
		return this.oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
