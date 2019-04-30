package com.Defect.Tracker.entities;

import java.util.List;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="add_project")
public class AddProject { 

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
    @Column(name="project_id")
	private Long projectId;
	
	@Column(name="project_name")
	private String projectName;
	
	//creating relationship class with module
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy="addProject",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<AddModule> addModule;
	
	public List<AddModule> getAddModule() {
		return addModule;
	}
	public void setAddModule(List<AddModule> addModule) {
		this.addModule = addModule;
	}
	
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	

	

}
