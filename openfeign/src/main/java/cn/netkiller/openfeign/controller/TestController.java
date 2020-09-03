package cn.netkiller.openfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.netkiller.openfeign.TestOpenfeign;
import reactor.core.publisher.Mono;

@RestController
public class TestController {
	@Autowired
	private TestOpenfeign testOpenfeign;

	@GetMapping("/feign")
	public Mono<String> testFeign() {
		return this.testOpenfeign.name();
	}

//	@RequestMapping("/feign")
//	public String testFeign(@RequestParam(name = "name") String name) {
//		return testFeign.hi(name);
//	}
}
