package br.com.blz.testjava.product;

import javax.validation.constraints.NotNull;

import br.com.blz.testjava.inventory.Inventory;

public class Product {

	@NotNull
	private Long sku;
	
	@NotNull
	private String name;
	
	@NotNull
	private Inventory inventory;
	
	private Boolean isMarketable;

	public Long getSku() {
		return sku;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Boolean getIsMarketable() {
		return isMarketable;
	}

	public void setIsMarketable(Boolean isMarketable) {
		this.isMarketable = isMarketable;
	}

}