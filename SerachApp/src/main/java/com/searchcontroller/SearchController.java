package com.searchcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	
	@RequestMapping("/home")
	public String home()
	{
//		System.out.println("menka shah congratulation you got 10 LPA");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("qurr") String query)
	{
		String url = "https://www.google.com/search?q="+query;
		RedirectView redirectview = new RedirectView();
		redirectview.setUrl(url);
		
		return redirectview;
	}

}
