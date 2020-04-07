package cn.com.jonpad.spikecore.productservice.controller;

import cn.com.jonpad.spikecore.core.api.ProductApi;
import cn.com.jonpad.spikecore.core.dto.ProductDto;
import cn.com.jonpad.spikecore.productservice.businessService.ProductBusiness;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Jon Chan
 * @date 2020/4/1 23:32
 */
@RestController
@AllArgsConstructor
public class ProductCtrl implements ProductApi {

  private ProductBusiness business;

  @Override
  public ResponseEntity<Void> createProduct(@RequestBody @Valid ProductDto dto) {
    business.create(dto);
    return ResponseEntity.status(HttpStatus.OK).build();
  }

  @Override
  public ResponseEntity<ProductDto> getProduct(@PathVariable("productId") String productId) {
    ProductDto dto = business.getOne(productId);
    return ResponseEntity.ok(dto);
  }

  @Override
  public ResponseEntity<List<ProductDto>> getproducts() {
    List<ProductDto> products = business.getProducts();
    return ResponseEntity.ok(products);
  }
}
