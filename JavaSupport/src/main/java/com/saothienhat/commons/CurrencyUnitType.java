package com.saothienhat.commons;

/**
 * @author Trinh Thanh Binh
 *
 */
public enum CurrencyUnitType {
    VIET_NAM_DONG("vnd", "vdn"),
	DOLLAR("dollar", "$");
	
	private String name;
	private String sign;
	
	CurrencyUnitType(String name, String sign){
		this.name = name;
		this.sign = sign;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}

}
