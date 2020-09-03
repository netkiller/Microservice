package cn.netkiller.openfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "restful")
public interface TestOpenfeign {
	@GetMapping("/config")
	String config();
}
