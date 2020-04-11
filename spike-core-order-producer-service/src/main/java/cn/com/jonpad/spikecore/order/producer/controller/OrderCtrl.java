package cn.com.jonpad.spikecore.order.producer.controller;

import cn.com.jonpad.spikecore.core.api.OrderApi;
import cn.com.jonpad.spikecore.core.dto.OrderDto;
import cn.com.jonpad.spikecore.order.producer.businessService.OrderProducerBusiness;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Jon Chan
 * @date 2020/4/8 23:09
 */
@RestController
@AllArgsConstructor
public class OrderCtrl implements OrderApi {

  private OrderProducerBusiness business;

  @Override
  public ResponseEntity<Void> createOrder(@RequestBody @Valid OrderDto dto) {
    business.createOrder(dto);
    return ResponseEntity.status(HttpStatus.OK).build();
  }
}
