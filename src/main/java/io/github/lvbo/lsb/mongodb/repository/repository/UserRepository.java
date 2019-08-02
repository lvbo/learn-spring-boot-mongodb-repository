package io.github.lvbo.lsb.mongodb.repository.repository;

import io.github.lvbo.lsb.mongodb.repository.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByUserName(String userName);
    Page<User> findAll(Pageable var1);
}