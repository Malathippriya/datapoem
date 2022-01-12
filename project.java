package com.assessment2.datapoem;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class project 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String projectname;
	private int duration;

	public Long getId() {
	return id;
	}

	public void setId(Long id) {
	this.id = id;
	}

	public String getprojectename() {
	return projectname;
	}

	public void setprojectname(String projectname) {
	this.projectname = projectname;
	}

	public int getDuration() {
	return duration;
	}

	public void setDuration(int duration) {
	this.duration = duration;
	}
}