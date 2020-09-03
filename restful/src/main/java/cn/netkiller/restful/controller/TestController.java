package cn.netkiller.restful.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${sms.gateway.username}")
	private String username;

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Hello world!";
	}

	@GetMapping("/config")
	public String config() {
		return this.username;
	}

	@GetMapping("/add")
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		Integer r = a + b;
		return r;
	}
}
