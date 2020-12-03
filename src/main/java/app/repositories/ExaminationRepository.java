package app.repositories;

import app.entities.Examine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ExaminationRepository extends JpaRepository<Examine, Long> {

    // Set<Examine> findAll();
}
