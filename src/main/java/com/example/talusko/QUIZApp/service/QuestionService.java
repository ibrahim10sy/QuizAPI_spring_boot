package com.example.talusko.QUIZApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.talusko.QUIZApp.Question;
import com.example.talusko.QUIZApp.dao.QuestionDAO;

@Service
public class QuestionService {
	@Autowired
	QuestionDAO questionDao ;
	public List<Question> getAllQuestions() {

		return questionDao.findAll();
	}
	
	
}
