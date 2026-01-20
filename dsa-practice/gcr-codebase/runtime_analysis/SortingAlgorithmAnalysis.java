package runtime_analysis;

import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithmAnalysis {
	static void bubbleSort(int[] arr) {
		int n=arr.length;
		boolean swapped;
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
			if(!swapped) break;
		}
	}
	static void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid=left+(right-left)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	static void merge(int[] arr, int left, int mid, int right) {
		int n1=mid-left+1;
		int n2=right-mid;
		
		int[] leftArray=new int[n1];
		int[] rightArray=new int[n2];
		
		System.arraycopy(arr, left, leftArray, 0, n1);
		System.arraycopy(arr, mid+1, rightArray, 0, n2);
		
		int i=0,j=0,k=left;
		
		while(i<n1 && j<n2) {
			if(leftArray[i]<rightArray[j]) {
				arr[k++]=leftArray[i++];
			}else {
				arr[k++]=rightArray[j++];
			}
		}
		while(i<n1) arr[k++]=leftArray[i++];
		while(j<n2) arr[k++]=rightArray[j++];	
	}
	
	static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long startTime, endTime;
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=generateArray(n);
		int[] copy1 = arr.clone();
		startTime=System.nanoTime();
		bubbleSort(copy1);
		endTime=System.nanoTime();
		System.out.println("Bubble Sort Time: "+(endTime-startTime)+" ns");
        
		int[] copy2 = arr.clone();
		startTime=System.nanoTime();
		mergeSort(copy2,0,n-1);
		endTime=System.nanoTime();
		System.out.println("Merge Sort Time: "+(endTime-startTime)+" ns");
		
		int[] copy3 = arr.clone();
		startTime=System.nanoTime();
		quickSort(copy3,0,n-1);
		endTime=System.nanoTime();
		System.out.println("Quick Sort Time: "+(endTime-startTime)+" ns");
	}
}
