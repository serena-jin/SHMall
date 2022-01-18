/**
PROJECT : 중고거래장터 판매자 구매자 매칭 프로젝트
NAME : Seller.java
DESC : 판매자 정보(Data)
*/

package model.dto;

public class Seller {
	private String sellerId;
	private String sellerPhone;
	private String sellerItem;
	
	
	public Seller() {}


	public Seller(String sellerId, String sellerPhone, String sellerItem) {
		super();
		this.sellerId = sellerId;
		this.sellerPhone = sellerPhone;
		this.sellerItem = sellerItem;
	}


	public String getSellerId() {
		return sellerId;
	}


	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}


	public String getSellerPhone() {
		return sellerPhone;
	}


	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}


	public String getSellerItem() {
		return sellerItem;
	}


	public void setSellerItem(String sellerItem) {
		this.sellerItem = sellerItem;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Seller [sellerId=");
		builder.append(sellerId);
		builder.append(", sellerPhone=");
		builder.append(sellerPhone);
		builder.append(", sellerItem=");
		builder.append(sellerItem);
		builder.append("]");
		return builder.toString();
	}
	
}
