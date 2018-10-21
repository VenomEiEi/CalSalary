import java.util.Scanner;
public class ProjectC {
	String id;
	String name;
	Double salary;
	Double sale;
	int bonut;

	public ProjectC(String insert, String name , Double salary ,Double sale ) {
		// TODO Auto-generated constructor stub
		
		this.id=insert;
		this.name=name;
		this.salary=salary;
		this.sale=sale;
		this.bonut=0;
		
		
		if(this.salary < 15000 && this.sale > 100000) {
			 this.bonut = 3000;
		}
		
		 if(sale<=50000) { 
			 
			 this.sale=sale*(0.01);
			 this.salary =  this.salary + this.sale;
		        
		 }else if(sale>=50001 && sale<=100000) {

			 this.sale=sale*(0.02);
			 this.salary =  this.salary+this.sale;		        
		 }else {
			 
			 this.sale=sale*(0.03);
			 this.salary =  (this.salary+ this.sale)+this.bonut;	        
		 }
		}
		
		public void output(){
			System.out.println("ชื่อพนักงาน : "+this.name);	
			System.out.println("ค่าตอบแทนสุทธิ : " + this.salary);
		
		}
}
