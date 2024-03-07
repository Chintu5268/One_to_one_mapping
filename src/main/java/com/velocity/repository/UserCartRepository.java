package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.User;

public interface UserCartRepository extends CrudRepository<User, Integer> {

}
