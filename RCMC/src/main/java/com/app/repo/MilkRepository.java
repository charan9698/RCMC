package com.app.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.app.model.Milk;

public interface MilkRepository extends JpaRepositoryImplementation<Milk, Integer> {

}
