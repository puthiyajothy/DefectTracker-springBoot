package com.Defect.Tracker.entities;

import javax.persistence.*;



@Entity
@Table(name="add_defect")

public class AddDefect {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="defect_id")
	private Long defectId;
	
	@Column(name="module")
	private String module;
	
	@Column(name="description")
	private String description;
	
	@Column(name="defect_type")
	private String defectType;
	
	@Column(name="severity")
	private String severity;
	
	@Column(name="priority")
	private String priority;
	
	@Column(name="assign_person")
	private String assignPerson;
	
	@Column(name="status")
	private String status;
	
	@Column(name="entered_by")
	private String enteredBy;
	
	@Column(name="entered_date")
	private String enteredDate;
	
	@Column(name="fixed_By")
	private String fixedBy;
	
	@Column(name="fixed_date")
	private String fixedDate;
	
	@Column(name="available_in")
	private String availableIn;
	
	@Column(name="comments")
	private String comments;

	
	
	// created relationship with module 
//	@ManyToOne
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	@JoinColumn(name="module_id",nullable=false)
//	private AddModule addModule;
//	
	
	
	

	public Long getDefectId() {
		return defectId;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public void setDefectId(Long defectId) {
		this.defectId = defectId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefectType() {
		return defectType;
	}

	public void setDefectType(String defectType) {
		this.defectType = defectType;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getAssignPerson() {
		return assignPerson;
	}

	public void setAssignPerson(String assignPerson) {
		this.assignPerson = assignPerson;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}

	public String getEnteredDate() {
		return enteredDate;
	}

	public void setEnteredDate(String enteredDate) {
		this.enteredDate = enteredDate;
	}

	public String getFixedBy() {
		return fixedBy;
	}

	public void setFixedBy(String fixedBy) {
		this.fixedBy = fixedBy;
	}

	public String getFixedDate() {
		return fixedDate;
	}

	public void setFixedDate(String fixedDate) {
		this.fixedDate = fixedDate;
	}

	public String getAvailableIn() {
		return availableIn;
	}

	public void setAvailableIn(String availableIn) {
		this.availableIn = availableIn;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
	
}
