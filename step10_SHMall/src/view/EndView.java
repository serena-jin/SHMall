package view;

import java.util.ArrayList;

import model.dto.Transaction;

public class EndView {
	
	public static void transactionView(Transaction transaction) {
		if(transaction != null) {
			System.out.println(transaction);
		}else {
			System.out.println("�ش� �ŷ������� �������� �ʽ��ϴ�.");
		}
	}
	
	
	public static void transactionSellerView(String readMatchingSeller) {
		if(readMatchingSeller != null) {
			System.out.println("������ ID: "+readMatchingSeller);
		}else {
			System.out.println("�ش� �ŷ������� �������� �ʽ��ϴ�.");
		}
	}
	
	
	public static void transactionListView(ArrayList<Transaction> readMachingAll) {
		if(readMachingAll != null) {
			int transactionSize = readMachingAll.size();
			for(int i = 0; i < transactionSize; i++) {
				if(readMachingAll.get(i) != null) {
					System.out.println("�ŷ�����: " + (i+1) + readMachingAll.get(i));
				}
			}
		}else {
			System.out.println("����� �ŷ������� �����ϴ�.");
		}
		
	}
	
	
	public static void successView(String message) {
		System.out.println(message);
	}
}
