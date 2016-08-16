package me.xhy.dubboApp.service.impl.bizA.xmlTypeProvider;

import java.util.ArrayList;
import java.util.List;

import me.xhy.dubboApp.service.defn.bizA.BizAModel;
import me.xhy.dubboApp.service.defn.bizA.xmlTypeProvider.BizAXMLTypeProvider;


/**
 * 
 * @author xhy
 * 
 * 1.spring-context配置
 * 
 * 在spring配置文件中注册该实现类
 * <bean id="bizAXMLTypeProviderImpl" class="me.xhy.dubboApp.service.impl.bizA.xmlTypeProvider.BizAXMLTypeProviderImpl" />
 * 提供dubbo服务，并关联实现类
 * <dubbo:service interface="me.xhy.dubboApp.service.defn.bizA.xmlTypeProvider.BizAXMLTypeProvider" ref="bizAXMLTypeProviderImpl" />
 *
 */
public class BizAXMLTypeProviderImpl implements BizAXMLTypeProvider {

	@Override
	public List<BizAModel> provideXMLType(BizAModel model) {

		System.out.println(model.toString());
		
		List<BizAModel> result = new ArrayList<BizAModel>();
		
		for (int i = 0; i < 10; i++) {
			model = new BizAModel();
			model.setA("a" + i);
			model.setB("b" + i);
			
			result.add(model);
		}
		
		return result;
	}

}
