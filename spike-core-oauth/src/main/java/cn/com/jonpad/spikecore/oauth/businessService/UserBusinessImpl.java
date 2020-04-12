package cn.com.jonpad.spikecore.oauth.businessService;

import cn.com.jonpad.spikecore.core.dto.UserDto;
import cn.com.jonpad.spikecore.core.dto.UserDtoSerializable;
import cn.com.jonpad.spikecore.core.entities.UserEntity;
import cn.com.jonpad.spikecore.oauth.dto.UserDtoMapper;
import cn.com.jonpad.spikecore.oauth.exception.ResourceNotFoundException;
import cn.com.jonpad.spikecore.oauth.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author Jon Chan
 * @date 2020/4/11 01:53
 */
@Service
@Component
@AllArgsConstructor
public class UserBusinessImpl implements UserBusiness {

  private UserService service;

  @Transactional(readOnly = true)
  @Override
  public UserDtoSerializable getByUuid(String uuid) {
    UserEntity userEntity = service.getByUuid(uuid).orElseThrow(ResourceNotFoundException::new);
    return UserDtoMapper.INSTANCE.toDto(userEntity);
  }

  @Transactional()
  @Override
  public UserDtoSerializable getByPhone(String phone) {
    UserEntity userEntity = service.getByPhone(phone).orElse(new UserEntity(UUID.randomUUID().toString(), phone));
    service.save(userEntity);
    return UserDtoMapper.INSTANCE.toDto(userEntity);
  }
}
