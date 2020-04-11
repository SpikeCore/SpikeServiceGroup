package cn.com.jonpad.spikecore.oauth.controller;

import cn.com.jonpad.spikecore.core.api.UserApi;
import cn.com.jonpad.spikecore.core.dto.UserDto;
import cn.com.jonpad.spikecore.oauth.businessService.UserBusiness;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jon Chan
 * @date 2020/4/11 01:49
 */
@RestController
@AllArgsConstructor
public class UserController implements UserApi {

  private UserBusiness business;

  @Override
  public ResponseEntity<UserDto> getUser(@PathVariable("userId") String uuid) {
    return ResponseEntity.ok(business.getByPhone(uuid));
  }
}
