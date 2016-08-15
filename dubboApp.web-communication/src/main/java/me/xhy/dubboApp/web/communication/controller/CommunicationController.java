package me.xhy.dubboApp.web.communication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import me.xhy.dubboApp.service.defn.bizA.model.BizA;
import me.xhy.dubboApp.web.communication.service.CommunicationServiceImpl;

@Controller
@Component
@RequestMapping("/test")
public class CommunicationController {
	
	private BizA bizA;
	
	@Autowired
	private CommunicationServiceImpl communicationService;

	@RequestMapping(value="/{a}.{b}", method=RequestMethod.GET)
	@ResponseBody
	public String receive(@PathVariable String a, @PathVariable String b, Model model) {
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		bizA = new BizA();
		bizA.setA(a);
		bizA.setB(b);
		
		List<BizA> res = communicationService.query(bizA);
		
		return res.toString();
	}

	// properties
	public CommunicationServiceImpl getCommunicationService() {
		return communicationService;
	}

	public void setCommunicationService(CommunicationServiceImpl communicationService) {
		this.communicationService = communicationService;
	}


	
}
