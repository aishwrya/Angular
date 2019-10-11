package com.cts.MicroService.client.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.MicroService.client.model.User;



public interface UserRepository extends CrudRepository<User, Long>{
	@Modifying
	@Query(value="update user_tb set active=false where id=?1",nativeQuery=true)
void block(Long id);
}
