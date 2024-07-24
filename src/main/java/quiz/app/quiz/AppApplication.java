package quiz.app.quiz;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import quiz.app.quiz.entity.Question;
import quiz.app.quiz.repository.QuestionRepository;



@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	  @Bean
	    CommandLineRunner initData(QuestionRepository repository) {
	        return args -> {
	        	repository.save(new Question("What is Java?", "Programming language", "Coffee", "Animal", "Planet", "Programming language"));
	        	repository.save(new Question("What is Spring Boot?", "Framework", "Game", "Library", "IDE", "Framework"));
	        	repository.save(new Question("Who developed Java?", "James Gosling", "Guido van Rossum", "Bjarne Stroustrup", "Dennis Ritchie", "James Gosling"));
	        	repository.save(new Question("Which company first developed Java?", "Sun Microsystems", "Microsoft", "Apple", "Google", "Sun Microsystems"));
	        	repository.save(new Question("Which of the following is not a Java feature?", "Object-oriented", "Platform-independent", "Secure", "Pointer Arithmetic", "Pointer Arithmetic"));
	        	repository.save(new Question("What is JRE?", "Java Runtime Environment", "Java Development Kit", "Java Virtual Machine", "Java Standard Edition", "Java Runtime Environment"));
	        	repository.save(new Question("What does JVM stand for?", "Java Virtual Machine", "Java Version Manager", "Java Visual Modeler", "Java Virtual Method", "Java Virtual Machine"));
	        	repository.save(new Question("What is the extension of Java bytecode files?", ".class", ".java", ".byte", ".exe", ".class"));
	        	repository.save(new Question("Which of the following is a reserved keyword in Java?", "interface", "string", "Float", "unsigned", "interface"));
	        	repository.save(new Question("Which method is the entry point for a Java program?", "main", "start", "begin", "init", "main"));

	        };
	    }

}
