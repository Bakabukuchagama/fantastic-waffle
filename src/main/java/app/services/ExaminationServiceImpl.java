package app.services;

import app.entities.Examine;
import app.repositories.ExaminationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@Component
public class ExaminationServiceImpl implements ExaminationService {

    @Autowired
    private ExaminationRepository rep;

    @Override
    public Examine addExamine(Examine examine) {
        rep.save(examine);
        return examine;
    }

    @Override
    public Set<Examine> allExamine() {
        List<Examine> examList= rep.findAll();
        Set<Examine> examSet = new HashSet<>(examList);
        return examSet;
       // return rep.findAllExamine();
    }

    @Override
    public void deleteExamine(Long id) {
        rep.delete(oneExamine(id));
    }

    @Override
    public Examine oneExamine(Long id) {
        Optional<Examine> examine = rep.findById(id);
        return examine.get();
    }

    @Override
    public Examine redExamine(Long id) {
        Optional<Examine> examineOptional = rep.findById(id);
        Examine examine = examineOptional.get();

        return examine;
    }
}
