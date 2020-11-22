package app.rests;

import app.entities.Examine;
import app.entities.Question;
import app.services.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
@RestController
@RequestMapping("/Examine")
public class ExamineRest {
    @Autowired
    private ExaminationService ExService;

    @PostMapping("/all")
    public List<String> allQuestions(){
        Set<Examine> examineList = ExService.allExamine();
        List<String> exams = new ArrayList<>();
        for (Examine examine: examineList
        ) {
            exams.add(examine.getName());
        }
        return exams;
    }

    @PostMapping("/add")
    public void addExam(Examine examine){
        ExService.addExamine(examine);
    }

}
