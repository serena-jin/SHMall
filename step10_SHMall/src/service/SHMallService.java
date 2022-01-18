/**
PROJECT : 중고거래장터 판매자 구매자 매칭 프로젝트
NAME : SHMallService.java
DESC : SHMall 프로젝트 데이터의 저장, 수정, 삭제, 검색하는 서비스 로직
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
	
	//판매자 정보를 저장하는 ArrayList
	private static ArrayList<Seller> SList = new ArrayList<Seller>();
	
	//구매자 정보를 저장하는 ArrayList
	private static ArrayList<Buyer> BList = new ArrayList<Buyer>();
	
	//품목 정보를 저장하는 ArrayList
	private static ArrayList<Item> IList = new ArrayList<Item>();
	
	
*/	
	//거래정보를 저장하는 ArrayList
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
	
	//1. Read - 모든 거래정보 검색
	public ArrayList<Transaction> readMachingAll(){
		return TSList;
	}
	
	
	//1. Read - 하나의 거래 정보 검색 
	public Transaction readMachingOne(String item) throws TransactionNotFoundException{
		int count = TSList.size();
		for(int i = 0; i < count; i++) {			
			if(TSList.get(i).getTsItem().getItem().equals(item)) {
				return TSList.get(i);
			}
		}throw new TransactionNotFoundException("검색하신 품목은 존재하지 않습니다.");
	}
		
		
	
	//1. Read - 하나의 거래 정보 검색 -> 판매자에 매칭된 구매자 확인
	public String readMatchingSeller(String IDS, String item) throws TransactionNotFoundException{
		int count = TSList.size();
		for(int i = 0; i < count; i++) {			
			if(TSList.get(i).getTsSeller().getSellerId().equals(IDS) && TSList.get(i).getTsItem().getItem().equals(item)) {
				return TSList.get(i).getTsBuyer().getBuyerId();
			}
		}throw new TransactionNotFoundException("검색하신 판매자 ID와 품목은 존재하지 않습니다.");
	}
	
	
	//2. Create
	public void createMatching(Transaction transaction) throws TransactionItemDuplicationException{
		for(Transaction t : TSList) {
			if(t.getTsItem().equals(transaction.getTsItem())) {
				throw new TransactionItemDuplicationException("이미 존재하는 품목입니다.");
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
		}throw new TransactionNotFoundException("검색하신 품목은 존재하지 않습니다.");
	}

	
	
	//4. Delete
	public ArrayList<Transaction> deleteMatching(String tsItem) throws TransactionNotFoundException{
		int count = TSList.size();
		for(int i = 0; i < count; i++) {
			if(TSList.get(i).getTsItem().getItem().equals(tsItem)) {
				TSList.remove(i);
				return TSList;
			}
		}throw new TransactionNotFoundException("검색하신 품목은 존재하지 않습니다.");
	}
	
}
