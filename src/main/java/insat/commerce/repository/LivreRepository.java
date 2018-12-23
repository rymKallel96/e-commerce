package insat.commerce.repository;

import org.springframework.data.repository.CrudRepository;
import insat.commerce.demo.*;

public interface LivreRepository extends CrudRepository<Livre, Long> {
}
