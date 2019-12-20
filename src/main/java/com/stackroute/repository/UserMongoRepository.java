package com.stackroute.repository;

import com.stackroute.domain.Music;
import org.springframework.data.mongodb.repository.MongoRepository;

 public interface UserMongoRepository extends MongoRepository<Music, Integer> {
        Music findById(int x);
}