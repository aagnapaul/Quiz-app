package quiz.app.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quiz.app.quiz.entity.Question;
import quiz.app.quiz.repository.QuestionRepository;

@Service
public class QuestionService {
	 @Autowired
	    private QuestionRepository questionRepository;

	    public List<Question> getAllQuestions() {
	        return questionRepository.findAll();
	    }
}
