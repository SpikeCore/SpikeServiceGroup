package cn.com.jonpad.spikecore.oauth.mapper;

import cn.com.jonpad.spikecore.core.dto.ProductDto;
import cn.com.jonpad.spikecore.core.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Jon Chan
 * @date 2020/4/1 23:44
 */
@Mapper()
public interface ProductMapper {
  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

  @Mappings({})
  Product getEntity(ProductDto dto);

  @Mappings({})
  ProductDto toDto(Product product);

  List<ProductDto> toDto(List<Product> products);
}
