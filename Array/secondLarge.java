package Array;
import java.util.*;
public class secondLarge {
    static int secondlargest(int n, int arr[]){
        int largest= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            } else if (arr[i]>second && arr[i]!=largest) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for(int i=0 ; i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(secondlargest(n,a));
        sc.close();
    }
}

