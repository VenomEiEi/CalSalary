import java.util.Scanner;

public class Main {
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String id;
			String name;
			Double salary;
			Double sale;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("กรุณกรอกรหัสพนักงาน : ");
			id = sc.nextLine();
			System.out.print("กรุณกรอกชื่อพนักงาน : ");
			name = sc.nextLine();
			System.out.print("กรุณกรอกเงินเดือน : ");
			salary = sc.nextDouble();
			System.out.print("กรุณกรอกยอดขาย : ");
			sale=sc.nextDouble();
			ProjectC send= new ProjectC(id,name,salary,sale);
			send.output();

}
}