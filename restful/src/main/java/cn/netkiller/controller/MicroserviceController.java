package cn.netkiller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceController {
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/services")
	public List<String> services() {
		return this.discoveryClient.getServices();
	}
}
