package cn.netkiller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	public TestController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/test")
	public String test() {
		ClassPathResource resource = new ClassPathResource("test.ttf");
		File file = null;
		try {
			file = resource.getFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// InputStream inStream = new FileInputStream(file.getPath());
		// BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
		return file.getPath();
	}
	@GetMapping("/test1")
	public String test1() {
		URL url = Thread.currentThread().getContextClassLoader().getResource("test.ttf");
		return url.getPath();
	}
	
}
