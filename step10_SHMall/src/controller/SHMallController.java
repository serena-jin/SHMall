package controller;

import exception.TransactionItemDuplicationException;
import exception.TransactionNotFoundException;
import model.dto.Transaction;
import service.SHMallService;
import view.EndFailView;
import view.EndView;

public class SHMallController {
	
	private static SHMallController instance = new SHMallController();
	
	private SHMallController() {}
	
	public static SHMallController getInstance() {
		return instance;
	}
	
	
	private SHMallService service = SHMallService.getInstance();
	
	
	//1. Read - ��� �ŷ����� �˻�
	public void readMachingAll() {
		EndView.transactionListView(service.readMachingAll());
	}
	
	
	
	//1. Read - �ϳ��� �ŷ� ���� �˻� 
	public void readMachingOne(String item) {
		if(item != null) {
			try {
				EndView.transactionView(service.readMachingOne(item));
			}catch (TransactionNotFoundException e){
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}
	}
	
	
	
	//1. Read - �ϳ��� �ŷ� ���� �˻� -> �Ǹ��ڿ� ��Ī�� ������ Ȯ��
	public void readMatchingSeller(String IDS, String item) {
		if(IDS != null && item != null) {
			try {
				EndView.transactionSellerView(service.readMatchingSeller(IDS, item));
			}catch (TransactionNotFoundException e){
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}else {
			EndFailView.failView("�˻�� �Է��ϼ���.");
		}
	}
	
	
	
	//2. Create
	public void createMatching(Transaction transaction) {
		if(transaction != null) {
			try {
				service.createMatching(transaction);
			}catch(TransactionItemDuplicationException e){
				e.printStackTrace(); 
				EndFailView.failView(e.getMessage());
			}
		}else {
			EndFailView.failView("���� ������ �Է��ϼ���.");
		}
	}
	
	
	
	//3.Update
	public void updateMatching(String tsItem, int newPrice) {
		if(tsItem != null && newPrice != 0) {
			try {
				service.updateMatching(tsItem, newPrice);
				EndView.successView("���� ���� ����");
			}catch (TransactionNotFoundException e){
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}else {
			EndFailView.failView("�����Ϸ��� ǰ���� �Է��ϼ���.");
		}
	}
	
	
	
	//4.Delete
	public void deleteMatching(String tsItem) {
		if(tsItem != null) {
			try {
				service.deleteMatching(tsItem);
				EndView.successView("ǰ���� �����߽��ϴ�.");
			}catch(TransactionNotFoundException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}else {
			EndFailView.failView("�����Ϸ��� ǰ���� �Է��ϼ���.");
		}		
	}



	
}
