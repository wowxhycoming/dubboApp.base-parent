package me.xhy.dubboApp.web.communication.service;

import java.util.List;

import me.xhy.dubboApp.service.defn.bizA.BizAModel;
import me.xhy.dubboApp.service.defn.bizA.xmlTypeProvider.BizAXMLTypeProvider;

public class CommunicationServiceXMLTypeImpl implements CommunicationService {

	private BizAXMLTypeProvider xmlProvider;

	public List<BizAModel> query(BizAModel model) {

		return xmlProvider.provideXMLType(model);

	}

	public BizAXMLTypeProvider getXmlProvider() {
		return xmlProvider;
	}

	public void setXmlProvider(BizAXMLTypeProvider xmlProvider) {
		this.xmlProvider = xmlProvider;
	}

}
