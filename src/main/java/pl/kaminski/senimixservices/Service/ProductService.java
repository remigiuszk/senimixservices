package pl.kaminski.senimixservices.Service;

import org.springframework.stereotype.Service;
import pl.kaminski.senimixservices.Model.ProductEntity;
import pl.kaminski.senimixservices.Repo.ProductRepo;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Boolean saveProduct(ProductEntity productEntity) {
        try {
            productRepo.save(productEntity);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public Boolean deleteProductById(long id) {
        try {
            productRepo.deleteById(id);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}
