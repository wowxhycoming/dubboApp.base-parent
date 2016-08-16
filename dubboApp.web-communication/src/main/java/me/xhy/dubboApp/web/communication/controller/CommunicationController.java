package me.xhy.dubboApp.web.communication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import me.xhy.dubboApp.service.defn.bizA.BizAModel;
import me.xhy.dubboApp.web.communication.service.CommunicationService;

@Controller
@RequestMapping("/test")
public class CommunicationController {
	
	private BizAModel bizA;
	
	@Autowired
	@Qualifier("communicationServiceXMLTypeImpl")
	private CommunicationService communicationServiceXMLType;
	
	@Autowired
	@Qualifier("communicationServiceAnnoTypeImpl")
	private CommunicationService communicationServiceAnnoType;
	
	

	@RequestMapping(value="/xml/{a}.{b}", method=RequestMethod.GET)
	@ResponseBody
	public String receiveXMLTypeProvide(@PathVariable String a, @PathVariable String b, Model model) {
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		bizA = new BizAModel();
		bizA.setA(a);
		bizA.setB(b);
		
		List<BizAModel> res = communicationServiceXMLType.query(bizA);
		
		return res.toString();
	}
	
	@RequestMapping(value="/anno/{a}.{b}", method=RequestMethod.GET)
	@ResponseBody
	public String receiveAnnoTypeProvide(@PathVariable String a, @PathVariable String b, Model model) {
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		bizA = new BizAModel();
		bizA.setA(a);
		bizA.setB(b);
		
		List<BizAModel> res = communicationServiceAnnoType.query(bizA);
		
		return res.toString();
	}



	
}
