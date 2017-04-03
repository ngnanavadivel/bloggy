package com.gnanavad.blog;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gnanavad.blog.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
