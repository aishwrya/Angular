package com.cts.MicroService.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.MicroService.client.model.Notification;
import com.cts.MicroService.client.model.Training;
import com.cts.MicroService.client.repository.NotificationRepository;
import com.cts.MicroService.client.repository.TrainingRepository;

@Service
@Transactional
public class TrainingService {
	@Autowired
	TrainingRepository trainingrepository;
	@Autowired
	NotificationRepository notificationrepository;
		public List<Training> display(){
			return (List<Training>) trainingrepository.findAll();
		}
		public void add(Training training)
		{
			trainingrepository.save(training);
			
		}
		public void delete(Long id)
		{
			trainingrepository.deleteById(id);
			
		}
		public Optional<Training> getBymentorId(Long id) {
			return trainingrepository.findById(id);
		}
		public void update(Training training)
		{
			trainingrepository.save(training);
			
		}
		public List<Training> trainingdetails(List<Long> list)
		{System.out.print(list);
			return trainingrepository.findBymentorIdIn(list);
		}
		public List<Training> showprogress(Long id)
		{
			return trainingrepository.showprogress(id);
		}
		public List<Training> showcompleted(Long id)
		{
			return trainingrepository.showcompleted(id);
		}
		
		public void propose(@PathVariable Long uid,@PathVariable Long mid,@PathVariable String skillName)
		{
			 notificationrepository.store(uid,mid,skillName);
		}
		public List<Notification> proposal(Long id)
		{
			return (List<Notification>) notificationrepository.findBymentorId(id);
		}
		@RequestMapping(value="/add/{uid}/{mid}/{skillName}/{status}",method=RequestMethod.GET)
		public void addtraining(@PathVariable Long uid,@PathVariable Long mid,@PathVariable String skillName,@PathVariable String status)
		{Training newUser = new Training();
			//trainingrepository.addtraining(uid,mid,skillName,status);
		newUser.setUserId(uid);
		newUser.setMentorId(mid);
		newUser.setSkillName(skillName);
		newUser.setStatus(status);
		
			trainingrepository.save(newUser);
		}
}
