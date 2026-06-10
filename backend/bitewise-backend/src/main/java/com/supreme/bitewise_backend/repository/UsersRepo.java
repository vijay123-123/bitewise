package com.supreme.bitewise_backend.repository;

import com.supreme.bitewise_backend.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepo extends MongoRepository<Users,String> {
    Users findUserByuserName(String username);
}
