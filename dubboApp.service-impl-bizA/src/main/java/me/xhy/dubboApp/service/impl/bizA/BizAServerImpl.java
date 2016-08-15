package me.xhy.dubboApp.service.impl.bizA;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;

import me.xhy.dubboApp.service.defn.bizA.BizAService;
import me.xhy.dubboApp.service.defn.bizA.model.BizA;

@Service
public class BizAServerImpl implements BizAService {

	@Override
	public List<BizA> query(BizA bizA) {

		System.out.println(bizA.toString());
		
		List<BizA> result = new ArrayList<BizA>();
		
		for (int i = 0; i < 10; i++) {
			bizA = new BizA();
			bizA.setA("a" + i);
			bizA.setB("b" + i);
			
			result.add(bizA);
		}
		
		return result;
	}

}
