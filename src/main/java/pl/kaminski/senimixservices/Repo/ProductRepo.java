package pl.kaminski.senimixservices.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.kaminski.senimixservices.Model.ProductEntity;

@Repository
public interface ProductRepo extends MongoRepository<ProductEntity, Long> {
}
