package com.Rajas.QuizApp.Quiz.Repo;



import com.Rajas.QuizApp.Quiz.Entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<QuizQuestion,Long> {
}