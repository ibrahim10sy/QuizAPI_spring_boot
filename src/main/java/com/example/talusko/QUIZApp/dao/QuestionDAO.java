package com.example.talusko.QUIZApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.talusko.QUIZApp.Question;

@Repository 
public interface QuestionDAO extends JpaRepository<Question, Integer> {

}
