package nl.inholland.spring5webapp.repositories;

import nl.inholland.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long>{
}
