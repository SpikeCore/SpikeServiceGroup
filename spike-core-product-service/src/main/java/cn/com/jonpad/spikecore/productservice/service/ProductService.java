package cn.com.jonpad.spikecore.productservice.service;

import cn.com.jonpad.spikecore.productservice.entities.Product;
import cn.com.jonpad.spikecore.productservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Jon Chan
 * @date 2020/4/1 23:29
 */
@Service
@AllArgsConstructor
public class ProductService {

  private ProductRepository repository;

  public void createProduct(Product product){
    repository.save(product);
  }

  public Optional<Product> getById(String uuid) {
    return repository.findByUuid(uuid);
  }

  public List<Product> getAll() {

    return  repository.findAll();
  }
}
