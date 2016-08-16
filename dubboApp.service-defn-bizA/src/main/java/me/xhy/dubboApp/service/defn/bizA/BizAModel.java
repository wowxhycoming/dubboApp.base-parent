package me.xhy.dubboApp.service.defn.bizA;

import java.io.Serializable;

public class BizAModel implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6673634524658039230L;

	// field
	private String a;
	
	private String b;

	// properties
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "BizA [a=" + a + ", b=" + b + "]";
	}
	
}
