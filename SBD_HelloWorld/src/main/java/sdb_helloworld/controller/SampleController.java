package sdb_helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping(value="/hello")
	public String helloWorld() {
		return "HelloWorld From SBD_HelloWorld Application";
	}
	

}
