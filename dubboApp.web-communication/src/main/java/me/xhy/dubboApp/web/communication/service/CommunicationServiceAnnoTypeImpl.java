package me.xhy.dubboApp.web.communication.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import me.xhy.dubboApp.service.defn.bizA.BizAModel;
import me.xhy.dubboApp.service.defn.bizA.annoTypeProvider.BizAAnnoTypeProvider;

@Component
public class CommunicationServiceAnnoTypeImpl implements CommunicationService {

	@Reference
	private BizAAnnoTypeProvider annoProvider;

	@Override
	public List<BizAModel> query(BizAModel model) {

		return annoProvider.provideAnnoType(model);
		
	}

	public BizAAnnoTypeProvider getAnnoProvider() {
		return annoProvider;
	}

	public void setAnnoProvider(BizAAnnoTypeProvider annoProvider) {
		this.annoProvider = annoProvider;
	}
	
}
