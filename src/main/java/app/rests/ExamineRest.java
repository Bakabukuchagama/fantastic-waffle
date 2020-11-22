package app.rests;

import app.services.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/Examine")
public class ExamineRest {
    @Autowired
    private ExaminationService ExService;


}
