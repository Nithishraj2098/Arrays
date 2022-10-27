public class Stackc1{
	char[] arr=new char[10];
	int tos;

	Stackc1(){
		tos=-1;
	}
	void push(char iteam){
		if(tos==9)
			System.out.println("Stack Full");
		else
			arr[++tos]=iteam;
	}
	 int pop(){
		if(tos>=0){
			return arr[tos--];
		}
		else{
			System.out.println("Stack Empty");
			return -1;
		}
			
		
	}
}