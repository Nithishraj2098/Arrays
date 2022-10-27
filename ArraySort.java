// sorting using Arrays.sort() method

import java.util.Scanner;
import java.util.Arrays;

public class ArraySort{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("The the number of Array sir");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("*********************After sort**************************");
        for(int x:arr)
            System.out.println(x);

    }
}