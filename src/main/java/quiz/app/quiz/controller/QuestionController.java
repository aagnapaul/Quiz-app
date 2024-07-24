package quiz.app.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quiz.app.quiz.entity.Question;
import quiz.app.quiz.service.QuestionService;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin(origins = "http://localhost:4200")
public class QuestionController {
	 @Autowired
	    private QuestionService questionService;

	    @GetMapping
	    public List<Question> getAllQuestions() {
	        return questionService.getAllQuestions();
	    }
}
