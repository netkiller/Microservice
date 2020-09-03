package cn.netkiller.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Mono;

@FeignClient("webflux")
public interface TestOpenfeign {
	@GetMapping("/name")
	Mono<String> name();
}
