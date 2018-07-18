package com.exilant.collections;

import java.util.Set;

public class AddressSet {
	
	private Set<String> addressset;

	public Set<String> getAddressset() {
		return addressset;
	}

	public void setAddressset(Set<String> addressset) {
		this.addressset = addressset;
	}

	@Override
	public String toString() {
		return "AddressSet [addressset=" + addressset + "]";
	}
	
	

}
