package com.springboot.mongoDbNoSQL.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mongoDbNoSQL.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
