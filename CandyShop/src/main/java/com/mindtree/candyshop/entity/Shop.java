package com.mindtree.candyshop.entity;

public class Shop {
	private int shopId;
	private String shopName;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(int shopId, String shopName) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shopId;
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		if (shopId != other.shopId)
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		return true;
	}
	

}
