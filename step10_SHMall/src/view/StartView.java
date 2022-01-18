package view;

import controller.SHMallController;
import model.dto.Buyer;
import model.dto.Item;
import model.dto.Seller;
import model.dto.Transaction;

public class StartView {

	public static void main(String[] args) {
		
		// �Ǹ���
		Seller seller1 = new Seller("0011", "010-0000-0001", "��ȭå");
		Seller seller2 = new Seller("0012", "010-0000-0001", "���");
		Seller seller3 = new Seller("0013", "010-0000-0001", "����� �ڼ�");
		Seller seller4 = new Seller("0014", "010-0000-0001", "����");
		Seller seller5 = new Seller("0015", "010-0000-0001", "Do it! Java");
		Seller seller6 = new Seller("0016", "010-0000-0001", "���ִ� �巹��");
		Seller seller7 = new Seller("0017", "010-0000-0001", "��ǻ��");
		Seller seller8 = new Seller("0018", "010-0000-0001", "���ⱸ");
		
		
		//������
		Buyer buyer1 = new Buyer("0021", "010-0000-0002", "����� �ڼ�");
		Buyer buyer2 = new Buyer("0022", "010-0000-0002", "���ⱸ");
		Buyer buyer3 = new Buyer("0023", "010-0000-0002", "������Ʈ");
		Buyer buyer4 = new Buyer("0024", "010-0000-0002", "������");
		Buyer buyer5 = new Buyer("0025", "010-0000-0002", "����");
		Buyer buyer6 = new Buyer("0026", "010-0000-0002", "Do it! Python");
		Buyer buyer7 = new Buyer("0027", "010-0000-0002", "���ִ� �巹��");
		
		
		//ǰ��
		Item item1 = new Item("����� �ڼ�", 1100, "�� �Ⱥ����� ������~~");
		Item item2 = new Item("���ⱸ", 9000000, "���ǰ� �ִ¸�ŭ ȯ���� �ȵ˴ϴ�.");
		Item item3 = new Item("���ִ� �巹��", 100, "��ǥȸ�� ���� �巹��!");
		
		
		//�ŷ�����
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
		controller.readMachingOne("���ⱸ");
		controller.readMatchingSeller("0013", "����� �ڼ�");
		
		
		System.out.println("---03. UPDATE ---");
		controller.updateMatching("���ִ� �巹��", 110);
		
		
		System.out.println("---04. DELETE ---");
		controller.deleteMatching("���ⱸ");
		
		
	}

}
