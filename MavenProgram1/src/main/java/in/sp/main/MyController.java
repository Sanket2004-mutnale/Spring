package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	//@RequestMapping(value="/hellopage", method= RequestMethod.GET)     or
	@GetMapping("/hellopage")
	public ModelAndView openHelloPage() {
		
		System.out.println("openHelloPage() method execute");
		ModelAndView mv =new ModelAndView();
		mv.setViewName("hello");
		
		return mv;
	}

}

