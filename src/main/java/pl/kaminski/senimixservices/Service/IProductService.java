package pl.kaminski.senimixservices.Service;

import pl.kaminski.senimixservices.Model.ProductEntity;

import java.util.List;

public interface IProductService {
    List<ProductEntity> getAllProducts();
    Boolean addProduct(ProductEntity productEntity);
    Boolean deleteProductById(long id);
    Boolean editProduct(ProductEntity productEntity);
}
