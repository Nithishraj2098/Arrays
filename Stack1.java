public class Stack1{
	int[] arr=new int[10];
	int tos;

	Stack1(){
		tos=-1;
	}

	void push(int a){
		if(tos==9)
			System.out.println("Satck full");
		else
		arr[++tos]=a;
	}
	int pop(){
		if (tos>=0)
			return arr[tos--];
		else{
			System.out.println("Stack Empty");
		    return -1;
		}
	}

}
