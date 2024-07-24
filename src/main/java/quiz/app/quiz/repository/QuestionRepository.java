package quiz.app.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import quiz.app.quiz.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
