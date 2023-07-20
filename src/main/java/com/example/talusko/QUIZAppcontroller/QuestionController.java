package com.example.talusko.QUIZAppcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.talusko.QUIZApp.Question;
import com.example.talusko.QUIZApp.dao.QuestionDAO;
import com.example.talusko.QUIZApp.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
	@GetMapping("allQuestions")
	public List<Question> getAllQuestions() {
		
		return questionService.getAllQuestions();
		
	}
}
