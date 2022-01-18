/**
PROJECT : 중고거래장터 판매자 구매자 매칭 프로젝트
NAME : Item.java
DESC : 거래 정보(Data)
*/

package model.dto;

public class Transaction{
	private int tsID;
	private Seller tsSeller;
	private Buyer tsBuyer;
	private Item tsItem;
	private String date;
	
	
	public Transaction() {}


	public Transaction(int tsID, Seller tsSeller, Buyer tsBuyer, Item tsItem, String date) {
		super();
		this.tsID = tsID;
		this.tsSeller = tsSeller;
		this.tsBuyer = tsBuyer;
		this.tsItem = tsItem;
		this.date = date;
	}


	public int getTsID() {
		return tsID;
	}


	public void setTsID(int tsID) {
		this.tsID = tsID;
	}


	public Seller getTsSeller() {
		return tsSeller;
	}


	public void setTsSeller(Seller tsSeller) {
		this.tsSeller = tsSeller;
	}


	public Buyer getTsBuyer() {
		return tsBuyer;
	}


	public void setTsBuyer(Buyer tsBuyer) {
		this.tsBuyer = tsBuyer;
	}


	public Item getTsItem() {
		return tsItem;
	}


	public void setTsItem(Item tsItem) {
		this.tsItem = tsItem;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transaction [tsID=");
		builder.append(tsID);
		builder.append(", tsSeller=");
		builder.append(tsSeller);
		builder.append(", tsBuyer=");
		builder.append(tsBuyer);
		builder.append(", tsItem=");
		builder.append(tsItem);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}


}
