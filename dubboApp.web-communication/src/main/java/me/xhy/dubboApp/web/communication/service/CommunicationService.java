package me.xhy.dubboApp.web.communication.service;

import java.util.List;

import me.xhy.dubboApp.service.defn.bizA.model.BizA;

public interface CommunicationService {
	
	public List<BizA> query(BizA bizA);

}
