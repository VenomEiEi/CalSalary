import java.util.Scanner;

public class Main {
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String id;
			String name;
			Double salary;
			Double sale;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("��س��͡���ʾ�ѡ�ҹ : ");
			id = sc.nextLine();
			System.out.print("��س��͡���;�ѡ�ҹ : ");
			name = sc.nextLine();
			System.out.print("��س��͡�Թ��͹ : ");
			salary = sc.nextDouble();
			System.out.print("��س��͡�ʹ��� : ");
			sale=sc.nextDouble();
			ProjectC send= new ProjectC(id,name,salary,sale);
			send.output();

}
}