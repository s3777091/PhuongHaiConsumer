package com.example.phuonghaiconsumer.Repository;

import com.example.phuonghaiconsumer.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByFullName(String name);
}
