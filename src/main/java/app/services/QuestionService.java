package app.services;


import app.dto.QuestionDto;
import app.entities.Question;

import java.util.List;

public interface QuestionService {

List<Question> viewQuestions();

Question oneQuestion (Long id) throws Exception;

void deleteQuestion (Long id) throws Exception;

void addQuestion(Question question);

Question updateQuestion(Long id, QuestionDto questionDto);
}
