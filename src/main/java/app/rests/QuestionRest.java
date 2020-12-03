package app.rests;

import app.dto.QuestionDto;
import app.entities.Question;
import app.services.QuestionService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Component
@RestController
@RequestMapping("/question")
public class QuestionRest{
    @Autowired
    private QuestionService questionService;

@GetMapping("/all")
    public List<String> allQuestions(){
    List<Question> questionList = questionService.viewQuestions();
    List<String> questions = new ArrayList<>();
    for (Question question: questionList
         ) {
        questions.add(question.getQuestion());
    }
    return questions;
}

@GetMapping("/{id}")
    public Question oneQuestion(@PathVariable("id") Long id) throws Exception {
    Question question = questionService.oneQuestion(id);
    return question;
}

@DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable("id") Long id) throws Exception {
        questionService.deleteQuestion(id);
    }

    @PostMapping
    public void addQuestion(Question question){
        questionService.addQuestion(question);
    }

    @PutMapping("/{id}")
    public  void updateQuestion(@PathVariable("id") Long id, @RequestBody QuestionDto questionDto){
    questionService.updateQuestion(id, questionDto);
    }

}
