class Queue1{
	int[] arr=new int[10];
	int n=0;

	void Enqueue(int num){
		if(n==9)
		 System.out.println("full");
	else
		arr[n++]=num;

	}
	int j=0;
	int Dequeue(){
		
		return arr[j++];
	}
}