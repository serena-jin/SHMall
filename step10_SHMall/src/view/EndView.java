package view;

import java.util.ArrayList;

import model.dto.Transaction;

public class EndView {
	
	public static void transactionView(Transaction transaction) {
		if(transaction != null) {
			System.out.println(transaction);
		}else {
			System.out.println("해당 거래정보는 존재하지 않습니다.");
		}
	}
	
	
	public static void transactionSellerView(String readMatchingSeller) {
		if(readMatchingSeller != null) {
			System.out.println("구매자 ID: "+readMatchingSeller);
		}else {
			System.out.println("해당 거래정보는 존재하지 않습니다.");
		}
	}
	
	
	public static void transactionListView(ArrayList<Transaction> readMachingAll) {
		if(readMachingAll != null) {
			int transactionSize = readMachingAll.size();
			for(int i = 0; i < transactionSize; i++) {
				if(readMachingAll.get(i) != null) {
					System.out.println("거래정보: " + (i+1) + readMachingAll.get(i));
				}
			}
		}else {
			System.out.println("저장된 거래정보가 없습니다.");
		}
		
	}
	
	
	public static void successView(String message) {
		System.out.println(message);
	}
}
