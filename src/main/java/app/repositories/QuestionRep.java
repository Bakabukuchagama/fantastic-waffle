package app.repositories;

import app.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRep extends JpaRepository<Question, Long> {
}
