package app.rests;

import app.entities.Question;
import app.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Component
@RestController
@RequestMapping("/question")
public class QuestionRest{
    @Autowired
    private QuestionService questionService;

@PostMapping("/all")
    public List<String> allQuestions(){
    List<Question> questionList = questionService.viewQuestions();
    List<String> questions = new ArrayList<>();
    for (Question question: questionList
         ) {
        questions.add(question.getQuestion());
    }
    return questions;
}

@PostMapping("/{id}")
    public Question oneQuestion(@PathVariable("id") Long id){
    Question question = questionService.oneQuestion(id);
    return question;
}

@PostMapping("/{id}")
    public void deleteQuestion(@PathVariable("id") Long id){
        questionService.deleteQuestion(id);
    }

    @PostMapping("/add")
    public void addQuestion(Question question){
        questionService.addQuestion(question);
    }

}
