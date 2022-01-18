/**
PROJECT : �߰�ŷ����� �Ǹ��� ������ ��Ī ������Ʈ
NAME : Buyer.java
DESC : ������ ����(Data)
*/

package model.dto;

public class Buyer {
	private String buyerId;
	private String buyerPhone;
	private String buyerItem;
	
	
	public Buyer() {}


	public Buyer(String buyerId, String buyerPhone, String buyerItem) {
		super();
		this.buyerId = buyerId;
		this.buyerPhone = buyerPhone;
		this.buyerItem = buyerItem;
	}


	public String getBuyerId() {
		return buyerId;
	}


	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}


	public String getBuyerPhone() {
		return buyerPhone;
	}


	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}


	public String getBuyerItem() {
		return buyerItem;
	}


	public void setBuyerItem(String buyerItem) {
		this.buyerItem = buyerItem;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Buyer [buyerId=");
		builder.append(buyerId);
		builder.append(", buyerPhone=");
		builder.append(buyerPhone);
		builder.append(", buyerItem=");
		builder.append(buyerItem);
		builder.append("]");
		return builder.toString();
	}


}
