package springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 5 MVC");
		return "welcome";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello World Again, from Spring 5 MVC");
		return "welcome";
	}
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String getHelloMessage(ModelMap model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/demo/example/Beans.xml");
	    demo.example.HelloWorld obj = (demo.example.HelloWorld) context.getBean("helloWorld");
        obj.setMessage("HelloWorld Bean Message");
		model.addAttribute("greeting", obj.getMessage());
		return "welcome";
	}
} 

