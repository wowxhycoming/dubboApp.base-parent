package me.xhy.dubboApp.web.communication.service;

import java.util.List;

import me.xhy.dubboApp.service.defn.bizA.BizAModel;

public interface CommunicationService {
	
	public List<BizAModel> query(BizAModel bizA);

}
