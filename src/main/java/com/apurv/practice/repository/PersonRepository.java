package com.apurv.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apurv.practice.repository.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
