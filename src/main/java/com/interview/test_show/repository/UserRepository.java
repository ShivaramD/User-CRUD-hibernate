package com.interview.test_show.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interview.test_show.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

