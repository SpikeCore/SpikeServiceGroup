package cn.com.jonpad.spikecore.oauth.repository;

import cn.com.jonpad.spikecore.core.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Jon Chan
 * @date 2020/4/11 01:54
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  Optional<UserEntity> findByUuid(String uuid);
  Optional<UserEntity> findByPhone(String phone);
}
