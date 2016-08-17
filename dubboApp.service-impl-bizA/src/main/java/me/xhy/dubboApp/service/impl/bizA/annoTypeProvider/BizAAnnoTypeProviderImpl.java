package me.xhy.dubboApp.service.impl.bizA.annoTypeProvider;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;

import me.xhy.dubboApp.service.defn.bizA.BizAModel;
import me.xhy.dubboApp.service.defn.bizA.annoTypeProvider.BizAAnnoTypeProvider;

/**
 * 
 * @author xhy
 * 
 * annotation 方式的 provicer
 * 
 * 1.spring-context 配置
 * 
 * 只需要添加对注解的扫描即可：<dubbo:annotation package="me.xhy" />
 * 
 * 2.java
 * 
 * 需要对类进行注解 com.alibaba.dubbo.config.annotation.Service;
 * 
 */

@Service
public class BizAAnnoTypeProviderImpl implements BizAAnnoTypeProvider {

	@Override
	public List<BizAModel> provideAnnoType(BizAModel model) {

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
