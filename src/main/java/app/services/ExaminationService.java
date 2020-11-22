package app.services;

import app.entities.Examine;


import java.util.Set;

public interface ExaminationService {

    Examine addExamine(Examine examine);

    Set<Examine> allExamine ();

    void deleteExamine(Long id);

    Examine oneExamine(Long id);

    Examine redExamine(Long id);
}
