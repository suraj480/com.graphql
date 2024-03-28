package com.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.entities.User;

@Repository
public interface UserRepo extends JpaRepository <User,Integer>{
//custom query method
	//custom finder methods
}
