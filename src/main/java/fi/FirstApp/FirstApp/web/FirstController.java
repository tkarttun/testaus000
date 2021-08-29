package fi.FirstApp.FirstApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	@RequestMapping("hello")
	@ResponseBody
	public String returnGreetingForName(@RequestParam(name ="firstname", required=false, defaultValue="Käyttäjä")String name) {
		return "Hello again " + name + "!";
	}
}
