package cn.com.jonpad.spikecore.oauth.businessService;

import cn.com.jonpad.spikecore.core.dto.UserDto;
import cn.com.jonpad.spikecore.core.entities.UserEntity;
import cn.com.jonpad.spikecore.oauth.dto.UserDtoMapper;
import cn.com.jonpad.spikecore.oauth.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Jon Chan
 * @date 2020/4/11 01:53
 */
@Service
@AllArgsConstructor
public class UserBusiness {

  private UserService service;

  public UserDto getByUuid(String phone) {
    UserEntity userEntity = service.getByPhone(phone).orElse(new UserEntity(UUID.randomUUID().toString()));
    service.save(userEntity);
    return UserDtoMapper.INSTANCE.toDto(userEntity);
  }
}
