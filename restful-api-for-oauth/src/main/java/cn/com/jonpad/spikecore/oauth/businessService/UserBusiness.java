package cn.com.jonpad.spikecore.oauth.businessService;

import cn.com.jonpad.spikecore.core.dto.UserDtoSerializable;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author Jon Chan
 * @date 2020/4/11 13:53
 */
public interface UserBusiness {
  @Cacheable(cacheNames = {"UserEntity_uuid"}, key = "#uuid"/*keyGenerator = "cacheConfigKeyGenerator"*//*,condition = "#a0>0"*//*,unless = "#a0==2"*/,sync = true)
  UserDtoSerializable getByUuid(String uuid);

  @Cacheable(cacheNames = {"UserEntity_phone"}, key = "#phone"/*keyGenerator = "cacheConfigKeyGenerator"*//*,condition = "#a0>0"*//*,unless = "#a0==2"*/,sync = true)
  UserDtoSerializable getByPhone(String phone);
}
