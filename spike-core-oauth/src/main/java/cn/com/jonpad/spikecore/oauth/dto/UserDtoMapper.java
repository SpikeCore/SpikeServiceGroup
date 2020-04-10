package cn.com.jonpad.spikecore.oauth.dto;

import cn.com.jonpad.spikecore.core.dto.UserDto;
import cn.com.jonpad.spikecore.core.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Jon Chan
 * @date 2020/4/11 02:03
 */
@Mapper()
public interface UserDtoMapper {
  UserDtoMapper INSTANCE = Mappers.getMapper(UserDtoMapper.class);

  UserDto toDto(UserEntity userEntity);
}
