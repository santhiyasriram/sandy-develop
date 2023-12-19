
package com.example.AirlineBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.AirlineBooking.entity.User;


@Repository

@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User,Integer> {

	@Query(value =  "select * from User where userName =?" , nativeQuery = true)
	User findByUserName(String userName);

	
}