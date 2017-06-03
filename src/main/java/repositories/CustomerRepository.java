package repositories;

import entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tuananh on 06/03/17.
 */
@Repository
public interface CustomerRepository extends CrudRepository<BookEntity, Integer>{

}
