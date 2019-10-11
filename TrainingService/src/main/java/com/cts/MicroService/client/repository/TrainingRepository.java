package com.cts.MicroService.client.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.MicroService.client.model.Notification;
import com.cts.MicroService.client.model.Training;

public interface TrainingRepository extends CrudRepository<Training,Long> {

	@Query(value="select * from training_tb where userId=?1 and status='not completed'",nativeQuery=true)

	public List<Training> showprogress(Long id);

	@Query(value="select * from training_tb where userId=?1 and status='completed'",nativeQuery=true)

	public List<Training> showcompleted(Long id);
	  List<Training> findBymentorIdIn(List<Long> list); 
	  Training findByuserId(Long id); 
	  Optional<Training> findById(Long id);
	 


	  @Modifying
		@Query(value="insert into training_tb(userId,mentorId,skillName,status) values(?1,?2,?3,?4)",nativeQuery=true)
		public void addtraining(Long uid,Long mid,String skillName,String status);
}
