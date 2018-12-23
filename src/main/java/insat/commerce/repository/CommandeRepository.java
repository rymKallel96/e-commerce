package insat.commerce.repository;

import org.springframework.data.repository.CrudRepository;
import insat.commerce.demo.*;
public interface CommandeRepository extends CrudRepository<Commande,Long> {
}
