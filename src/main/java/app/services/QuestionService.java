package app.services;


import app.entities.Question;

import java.util.List;

public interface QuestionService {

List<Question> viewQuestions();

Question oneQuestion (Long id);

void deleteQuestion (Long id);

void addQuestion(Question question);
}
