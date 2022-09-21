package com.naveen.springgraphql.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.springgraphql.mysql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
