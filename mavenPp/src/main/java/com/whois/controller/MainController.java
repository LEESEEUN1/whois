package com.whois.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/TEST")
	public Map<String, Object> mainTest(@RequestParam Map<String, Object> params, Model model){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("AAAAAAAAAAAAA","BBBBBBBBBBBBB");
		
		return resultMap;
	}
	
	
	/**
	 * <PRE>
	 * - Main Page를 호출한다.
	 *
	 * History
	 * - 2019. 10. 21., 이세은, 최초 생성
	 * <PRE>
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public Map<String, Object> main(@RequestParam Map<String, Object> params, Model model){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("AAAAAAAAAAAAA","BBBBBBBBBBBBB");
		
		return resultMap;
	}
	
}
