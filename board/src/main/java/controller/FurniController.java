package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/furni")
public class FurniController { 
	
	@GetMapping("/shop")
	public void shop() throws Exception {
	}
	
}
