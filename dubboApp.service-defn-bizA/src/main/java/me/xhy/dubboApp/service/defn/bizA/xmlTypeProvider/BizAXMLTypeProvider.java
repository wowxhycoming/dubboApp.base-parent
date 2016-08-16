package me.xhy.dubboApp.service.defn.bizA.xmlTypeProvider;

import java.util.List;

import me.xhy.dubboApp.service.defn.bizA.BizAModel;

public interface BizAXMLTypeProvider {
	
	public List<BizAModel> provideXMLType(BizAModel model);

}
