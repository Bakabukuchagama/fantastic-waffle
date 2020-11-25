package app.services;

import app.dto.QuestionDto;
import app.entities.Answer;
import app.entities.Question;
import app.repositories.QuestionRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRep rep;

    @Override
    public List<Question> viewQuestions() {
        return rep.findAll();
    }

    @Override
    public Question oneQuestion(Long id) {
        Optional<Question> question = rep.findById(id);
        return question.get();
    }

    @Override
    public void deleteQuestion(Long id) {
rep.delete(oneQuestion(id));
    }

    @Override
    public void addQuestion(Question question) {
rep.save(question);
    }

    @Override
    public Question updateQuestion(Long id, QuestionDto questionDto) {
        Question question = rep.findById(id).get();
        question.setQuestion(questionDto.getQuestion());
        question.setDifficulty(questionDto.getDifficulty());
        question.setType(questionDto.getType());
        //      question.setQuestion(quest);
        return rep.save(question);

    }
}
