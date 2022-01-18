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
	
	
	//1. Read - 모든 거래정보 검색
	public void readMachingAll() {
		EndView.transactionListView(service.readMachingAll());
	}
	
	
	
	//1. Read - 하나의 거래 정보 검색 
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
	
	
	
	//1. Read - 하나의 거래 정보 검색 -> 판매자에 매칭된 구매자 확인
	public void readMatchingSeller(String IDS, String item) {
		if(IDS != null && item != null) {
			try {
				EndView.transactionSellerView(service.readMatchingSeller(IDS, item));
			}catch (TransactionNotFoundException e){
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}else {
			EndFailView.failView("검색어를 입력하세요.");
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
			EndFailView.failView("저장 정보를 입력하세요.");
		}
	}
	
	
	
	//3.Update
	public void updateMatching(String tsItem, int newPrice) {
		if(tsItem != null && newPrice != 0) {
			try {
				service.updateMatching(tsItem, newPrice);
				EndView.successView("가격 변경 성공");
			}catch (TransactionNotFoundException e){
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}else {
			EndFailView.failView("수정하려는 품목을 입력하세요.");
		}
	}
	
	
	
	//4.Delete
	public void deleteMatching(String tsItem) {
		if(tsItem != null) {
			try {
				service.deleteMatching(tsItem);
				EndView.successView("품목을 삭제했습니다.");
			}catch(TransactionNotFoundException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		}else {
			EndFailView.failView("삭제하려는 품목을 입력하세요.");
		}		
	}



	
}
