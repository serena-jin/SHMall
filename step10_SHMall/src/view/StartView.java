package view;

import controller.SHMallController;
import model.dto.Buyer;
import model.dto.Item;
import model.dto.Seller;
import model.dto.Transaction;

public class StartView {

	public static void main(String[] args) {
		
		// 판매자
		Seller seller1 = new Seller("0011", "010-0000-0001", "동화책");
		Seller seller2 = new Seller("0012", "010-0000-0001", "당근");
		Seller seller3 = new Seller("0013", "010-0000-0001", "냉장고 자석");
		Seller seller4 = new Seller("0014", "010-0000-0001", "연필");
		Seller seller5 = new Seller("0015", "010-0000-0001", "Do it! Java");
		Seller seller6 = new Seller("0016", "010-0000-0001", "공주님 드레스");
		Seller seller7 = new Seller("0017", "010-0000-0001", "디퓨저");
		Seller seller8 = new Seller("0018", "010-0000-0001", "열기구");
		
		
		//구매자
		Buyer buyer1 = new Buyer("0021", "010-0000-0002", "냉장고 자석");
		Buyer buyer2 = new Buyer("0022", "010-0000-0002", "열기구");
		Buyer buyer3 = new Buyer("0023", "010-0000-0002", "레인코트");
		Buyer buyer4 = new Buyer("0024", "010-0000-0002", "눈오리");
		Buyer buyer5 = new Buyer("0025", "010-0000-0002", "오이");
		Buyer buyer6 = new Buyer("0026", "010-0000-0002", "Do it! Python");
		Buyer buyer7 = new Buyer("0027", "010-0000-0002", "공주님 드레스");
		
		
		//품목
		Item item1 = new Item("냉장고 자석", 1100, "잘 안붙지만 예뻐요~~");
		Item item2 = new Item("열기구", 9000000, "부피가 있는만큼 환불은 안됩니다.");
		Item item3 = new Item("공주님 드레스", 100, "발표회용 엘사 드레스!");
		
		
		//거래정보
		Transaction transaction1 = new Transaction(01, seller3, buyer1, item1, "2020-01-22");
		Transaction transaction2 = new Transaction(02, seller8, buyer2, item2, "2020-02-10");
		Transaction transaction3 = new Transaction(03, seller6, buyer7, item3, "2020-03-31");
		
		
		SHMallController controller = SHMallController.getInstance();
		
		System.out.println("---01. CREATE---");
		controller.createMatching(transaction1);
		controller.createMatching(transaction2);
		controller.createMatching(transaction3);
		
		
		System.out.println("---02. READ ALL---");
		controller.readMachingAll();
		
		
		System.out.println("---02. READ ONE ---");
		controller.readMachingOne("열기구");
		controller.readMatchingSeller("0013", "냉장고 자석");
		
		
		System.out.println("---03. UPDATE ---");
		controller.updateMatching("공주님 드레스", 110);
		
		
		System.out.println("---04. DELETE ---");
		controller.deleteMatching("열기구");
		
		
	}

}
