package com.saothienhat.commons;

/**
 * @author binhtt
 * This Enum is created for (Create, Read, Update, Delete and Grant) Database operations/Access Right
 */
public enum CRUDGType {
    UNKNOWN("Unknown", "", -1),
	CREATE("Create", "C", 0),
	READ("Read", "R", 1), 
	UPDATE("Update", "U", 2), 
	DELETE("Delete", "D", 3), 
	GRANT("Grant", "G", 4);
	
	private String type;
	private String typeShort;
	private int bitOrder;
	
	/**
	 * Construct new instance of CRUDGType
	 * @param type
	 * @param typeShort
	 * @param bitOrder
	 */
	CRUDGType(String type, String typeShort, int bitOrder){
		this.type = type;
		this.typeShort = typeShort;
		this.bitOrder = bitOrder;
	}
	
	
	/**
	 * Method to getCRUDGTypeByBitOrder
	 *
	 * @param bitOrder
	 * @return
	 */
	public static CRUDGType getCRUDGTypeByBitOrder(int bitOrder){
		CRUDGType type = CRUDGType.UNKNOWN;
		CRUDGType[] crudgTypes = CRUDGType.values();
		for( CRUDGType crudgType : crudgTypes ){
            if(crudgType.getBitOrder() == bitOrder){
                type = crudgType;
                break;
            }
        }
		
		return type;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	
	/**
	 * @return the typeShort
	 */
	public String getTypeShort() {
		return typeShort;
	}

	
	/**
	 * @return the bitOrder
	 */
	public int getBitOrder() {
		return bitOrder;
	}
	
}
