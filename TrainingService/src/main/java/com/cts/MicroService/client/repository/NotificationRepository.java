package com.cts.MicroService.client.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.MicroService.client.model.Notification;

public interface NotificationRepository extends CrudRepository<Notification,Long>{
	@Modifying
	@Query(value="insert into notification_tb(userId,mentorId,skillName) values(?1,?2,?3)",nativeQuery=true)
	public void store(Long uid,Long mid,String skillName);
	public List<Notification> findBymentorId(Long id);
}
