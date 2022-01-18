/**
PROJECT : �߰�ŷ����� �Ǹ��� ������ ��Ī ������Ʈ
NAME : SHMallService.java
DESC : SHMall ������Ʈ �������� ����, ����, ����, �˻��ϴ� ���� ����
*/

package service;

import java.util.ArrayList;

import exception.TransactionItemDuplicationException;
import exception.TransactionNotFoundException;
import model.dto.Transaction;

public class SHMallService {
	
	private static SHMallService instance = new SHMallService();
	
	private SHMallService () {}
	
	public static SHMallService getInstance() {
		return instance;
	}

/*	
	
	//�Ǹ��� ������ �����ϴ� ArrayList
	private static ArrayList<Seller> SList = new ArrayList<Seller>();
	
	//������ ������ �����ϴ� ArrayList
	private static ArrayList<Buyer> BList = new ArrayList<Buyer>();
	
	//ǰ�� ������ �����ϴ� ArrayList
	private static ArrayList<Item> IList = new ArrayList<Item>();
	
	
*/	
	//�ŷ������� �����ϴ� ArrayList
	private static ArrayList<Transaction> TSList = new ArrayList<Transaction>();
	
/*	
	static ArrayList<Transaction> addTSList(){
		for(int i = 0; i < SList.size(); i++) {
			String sI = SList.get(i).getSellerItem();
			for(int j = 0; j < BList.size(); j++) {
				String bI = BList.get(j).getBuyerItem();
				for(int k = 0; k < TSList.size(); k++) {
					if(sI.equals(bI)) {
						TSList k = new TSList()
					}
				}
			}
		}
	}
	
*/	
	
	//1. Read - ��� �ŷ����� �˻�
	public ArrayList<Transaction> readMachingAll(){
		return TSList;
	}
	
	
	//1. Read - �ϳ��� �ŷ� ���� �˻� 
	public Transaction readMachingOne(String item) throws TransactionNotFoundException{
		int count = TSList.size();
		for(int i = 0; i < count; i++) {			
			if(TSList.get(i).getTsItem().getItem().equals(item)) {
				return TSList.get(i);
			}
		}throw new TransactionNotFoundException("�˻��Ͻ� ǰ���� �������� �ʽ��ϴ�.");
	}
		
		
	
	//1. Read - �ϳ��� �ŷ� ���� �˻� -> �Ǹ��ڿ� ��Ī�� ������ Ȯ��
	public String readMatchingSeller(String IDS, String item) throws TransactionNotFoundException{
		int count = TSList.size();
		for(int i = 0; i < count; i++) {			
			if(TSList.get(i).getTsSeller().getSellerId().equals(IDS) && TSList.get(i).getTsItem().getItem().equals(item)) {
				return TSList.get(i).getTsBuyer().getBuyerId();
			}
		}throw new TransactionNotFoundException("�˻��Ͻ� �Ǹ��� ID�� ǰ���� �������� �ʽ��ϴ�.");
	}
	
	
	//2. Create
	public void createMatching(Transaction transaction) throws TransactionItemDuplicationException{
		for(Transaction t : TSList) {
			if(t.getTsItem().equals(transaction.getTsItem())) {
				throw new TransactionItemDuplicationException("�̹� �����ϴ� ǰ���Դϴ�.");
			}
		}TSList.add(transaction);
	}
	
	
	//3.Update
	public boolean updateMatching(String tsItem, int newPrice) throws TransactionNotFoundException{
		for(Transaction t : TSList) {
			if(t.getTsItem().getItem().equals(tsItem)) {
				t.getTsItem().setPrice(newPrice);;
				return true;
			}
		}throw new TransactionNotFoundException("�˻��Ͻ� ǰ���� �������� �ʽ��ϴ�.");
	}

	
	
	//4. Delete
	public ArrayList<Transaction> deleteMatching(String tsItem) throws TransactionNotFoundException{
		int count = TSList.size();
		for(int i = 0; i < count; i++) {
			if(TSList.get(i).getTsItem().getItem().equals(tsItem)) {
				TSList.remove(i);
				return TSList;
			}
		}throw new TransactionNotFoundException("�˻��Ͻ� ǰ���� �������� �ʽ��ϴ�.");
	}
	
}
