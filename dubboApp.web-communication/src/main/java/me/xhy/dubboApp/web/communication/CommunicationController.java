package me.xhy.dubboApp.web.communication;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import me.xhy.dubboApp.service.defn.bizA.BizAService;
import me.xhy.dubboApp.service.defn.bizA.model.BizA;

@Controller
@Component
@RequestMapping("/test")
public class CommunicationController {
	
	private BizA bizA;
	
	@Reference
	private BizAService bizAService;

	@RequestMapping(value="/{a}.{b}", method=RequestMethod.GET)
	@ResponseBody
	public String receive(@PathVariable String a, @PathVariable String b, Model model) {
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		bizA = new BizA();
		bizA.setA(a);
		bizA.setB(b);
		
		List<BizA> res = bizAService.query(bizA);
		
		return res.toString();
	}

	// properties
	public BizAService getBizAService() {
		return bizAService;
	}

	public void setBizAService(BizAService bizAService) {
		this.bizAService = bizAService;
	}
	
}
