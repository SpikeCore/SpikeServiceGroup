package cn.com.jonpad.spikecore.oauth.repository;

import cn.com.jonpad.spikecore.core.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Jon Chan
 * @date 2020/3/31 23:38
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

  Optional<Product> findByUuid(String uuid);
}
