package com.Defect.Tracker.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name="add_modules")
public class AddModule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="module_id")
	private Long moduleId;
	
	@Column(name="module_name")
	private String modulename;
	
	//creating relationship class with add_project
	@ManyToOne
	@JoinColumn(name="project_id", nullable=false)
	private AddProject addProject;
	
	
	
	@ManyToOne
	@JoinColumn(name="developerId", nullable=false)
	private AddDeveloper adddeveloper;
	
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy="addModule",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<AddDefect> addDefect;
	
	
	
	
	public List<AddDefect> getAddDefect() {
		return addDefect;
	}

	public void setAddDefect(List<AddDefect> addDefect) {
		this.addDefect = addDefect;
	}

	public AddDeveloper getAdddeveloper() {
		return adddeveloper;
	}

	public void setAdddeveloper(AddDeveloper adddeveloper) {
		this.adddeveloper = adddeveloper;
	}

	public AddProject getAddProject() {
		return addProject;
	}
	
	public void setAddProject(AddProject addProject) {
		this.addProject = addProject;
	}
	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
	this.moduleId = moduleId;
	}

	public String getModulename() {
		return modulename;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public void setModulename(String modulename) {
		this.modulename = modulename;
	}


}
