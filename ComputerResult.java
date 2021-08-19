import java.util.Scanner;
class Computer{
	int modelno,price,ram,harddisk;
	void getData(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter modelno,price,ram,harddisk");
modelno=sc.nextInt();
price=sc.nextInt();
ram=sc.nextInt();
harddisk=sc.nextInt();
}
void showData(){
	System.out.println("modelno="+modelno);
	System.out.println("price="+price);
	System.out.println("ram="+ram);
	System.out.println("harddisk="+harddisk);
}
}
class ComputerResult{
	public static void main(String args[]){
	Computer c =new Computer();
	c.getData();
	c.showData();
	}
}