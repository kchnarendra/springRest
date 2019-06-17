package com.quadwave.controller;

/*import org.springframework.web.bind.annotation.PostMapping;*/
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quadwave.Student;

@RestController
public class ExariSOAPtoRestController {

	
//	@Autowired
//	DocgenHelper docgenHelper;
	
//	@Autowired
//	ContactSoap contactSoap;
	
	@RequestMapping(value = "/naget", method = RequestMethod.GET)
	public String getCountries()
	{
		
		return "narendra";
	}
	
	@RequestMapping(value="/napost", method = RequestMethod.POST)
	public Student narendraPost(@RequestBody Student student){
				
		System.out.println(student);
		return student;
	}
	
	


}
