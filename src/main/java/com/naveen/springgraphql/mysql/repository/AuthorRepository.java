package com.naveen.springgraphql.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.springgraphql.mysql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}