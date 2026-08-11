import java.io.*;
import java.util.*;

public class QuickSort2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);   
    }
    
    private static void quickSort(int[] arr, int low, int high){
        if(low>=high) return;
        int pivot=partition(arr,low,high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
        printArray(arr,low,high);
        
    } 
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for(int i = low + 1; i <= high; i++) {
            if(arr[i] < pivot) {
                less.add(arr[i]);
            }else{
                greater.add(arr[i]);
            }
        }

        int idx=low;
        for (int v : less) arr[idx++] = v;
        int pivotIndex = idx;
        arr[idx++] = pivot;
        for (int v : greater) arr[idx++] = v;

        return pivotIndex;
    }
    private static void printArray(int[] arr, int low, int high) {
        StringBuilder sb = new StringBuilder();
        for (int i = low; i <= high; i++) {
            sb.append(arr[i]);
            if (i < high) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}