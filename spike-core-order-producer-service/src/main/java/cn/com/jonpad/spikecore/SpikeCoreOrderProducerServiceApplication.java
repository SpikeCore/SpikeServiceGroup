package cn.com.jonpad.spikecore;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class SpikeCoreOrderProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpikeCoreOrderProducerServiceApplication.class, args);
	}

}
