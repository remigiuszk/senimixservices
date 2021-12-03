package pl.kaminski.senimixservices.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kaminski.senimixservices.Model.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Long> {
}
