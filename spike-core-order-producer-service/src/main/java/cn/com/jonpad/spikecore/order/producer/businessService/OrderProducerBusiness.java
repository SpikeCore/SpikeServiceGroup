package cn.com.jonpad.spikecore.order.producer.businessService;

import cn.com.jonpad.spikecore.core.dto.OrderDto;
import cn.com.jonpad.spikecore.core.dto.UserDto;
import cn.com.jonpad.spikecore.oauth.businessService.UserBusiness;
import com.alibaba.dubbo.config.annotation.Reference;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Jon Chan
 * @date 2020/4/1 23:36
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class OrderProducerBusiness {

  @Reference
  private UserBusiness userBusiness;

  @Transactional
  public void createOrder(OrderDto dto) {
    UserDto userDto = userBusiness.getByUuid(dto.getUserUuid());

    log.info("userDto:{}", userDto);

  }
}
