import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of an array: ");

        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Array after sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
