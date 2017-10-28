package org.fictio.jaxDemo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoResource {

	public List<String> hi(){
		List<String> result = new ArrayList<>();
		
		result.add("hello spring-boot");
		result.add("hello docker");
		
		return result;
	}
	
}
