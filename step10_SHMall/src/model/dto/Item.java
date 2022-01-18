/**
PROJECT : �߰�ŷ����� �Ǹ��� ������ ��Ī ������Ʈ
NAME : Item.java
DESC : ǰ�� ����(Data)
*/

package model.dto;

public class Item {
	private String item;
	private int price;
	private String detail;
	
	
	public Item() {}
	
	
	public Item(String item, int price, String detail) {
		super();
		this.item = item;
		this.price = price;
		this.detail = detail;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Items [item=");
		builder.append(item);
		builder.append(", price=");
		builder.append(price);
		builder.append(", detail=");
		builder.append(detail);
		builder.append("]");
		return builder.toString();
	}
	
}
