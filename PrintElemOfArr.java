import java.lang.*;
import java.io.*;
import java.util.*;

class PrintElemOfArr{
    public static void Solution(int n, int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of an array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];


    System.out.println("Enter the elements of an array: ");
    for(int i = 0; i< n; i++){
        arr[i] = sc.nextInt();
     }

     Solution(n, arr);

    }

}



