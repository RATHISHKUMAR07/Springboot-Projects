package io.data.trading.forex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "forexs")
public class Forex {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "market")
	private String market;
	@Column(name = "pairs")
	private String pairs;
	@Column(name = "price")
	private int price;
	@Column(name = "orderOption")
	private String orderOption;
	
	Forex(){
		
	}
	Forex(String market,String pairs,int price,String orderOption){
		super();
		//this.id = id;
		this.market = market;
		this.pairs = pairs;
		this.price = price;
		this.orderOption = orderOption;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getPairs() {
		return pairs;
	}
	public void setPairs(String pairs) {
		this.pairs = pairs;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getorderOption() {
		return orderOption;
	}
	public void setorderOption(String orderOption) {
		this.orderOption = orderOption;
	}
	
}
