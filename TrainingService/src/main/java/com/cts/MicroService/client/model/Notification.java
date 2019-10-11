package com.cts.MicroService.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notification_tb")
public class Notification {
	@Id 	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private Long userId;

private Long mentorId;
private String skillName;
public Notification() {
	super();
	// TODO Auto-generated constructor stub
}
public Notification(Long id, Long userId, Long mentorId, String skillName) {
	super();
	this.id = id;
	this.userId = userId;
	this.mentorId = mentorId;
	this.skillName = skillName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public Long getMentorId() {
	return mentorId;
}
public void setMentorId(Long mentorId) {
	this.mentorId = mentorId;
}
public String getSkillName() {
	return skillName;
}
public void setSkillName(String skillName) {
	this.skillName = skillName;
}

}
