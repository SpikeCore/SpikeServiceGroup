package cn.com.jonpad.spikecore.oauth.service;

import cn.com.jonpad.spikecore.core.entities.UserEntity;
import cn.com.jonpad.spikecore.oauth.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Jon Chan
 * @date 2020/4/11 01:54
 */
@Service
@AllArgsConstructor
public class UserService {
  private UserRepository repository;

  public Optional<UserEntity> getByUuid(String uuid) {
    return repository.findByUuid(uuid);
  }


  public Optional<UserEntity> getByPhone(String phone) {
    return repository.findByPhone(phone);
  }

  public void save(UserEntity userEntity) {
    repository.save(userEntity);
  }
}
