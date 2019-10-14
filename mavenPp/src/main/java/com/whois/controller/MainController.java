package com.whois.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class MainController {

	
	@RequestMapping("/TEST")
	public Map<String, Object> mainTest(@RequestParam Map<String, Object> params, Model model){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("AAAAAAAAAAAAA","BBBBBBBBBBBBB");
		
		return resultMap;
	}
	
}
