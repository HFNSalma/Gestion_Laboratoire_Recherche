package dcc.tp3.enseignantservice.repository;

import dcc.tp3.enseignantservice.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {

    Enseignant findEnseignantByEmail(String email);

}
