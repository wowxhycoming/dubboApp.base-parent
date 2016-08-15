package me.xhy.dubboApp.web.communication.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import me.xhy.dubboApp.service.defn.bizA.BizAService;

import me.xhy.dubboApp.service.defn.bizA.model.BizA;

@Component
public class CommunicationService {
	
	@Reference
	private BizAService bizAService;
	
	public List<BizA> query(BizA bizA) {
		
		return bizAService.query(bizA);
		
	}

	// properties
	public BizAService getBizAService() {
		return bizAService;
	}

	public void setBizAService(BizAService bizAService) {
		this.bizAService = bizAService;
	}

}
