package runtime_analysis;

import java.util.Arrays;

//import sorting.MergeSort;
public class TargetSearch {
	public static int linearSearch(int[] arr, int target) {
		long startTime, endTime;
		startTime=System.nanoTime();
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				endTime=System.nanoTime();
				System.out.println("Linear Search Time: "+(endTime-startTime)+" ns");
				return i;
			}
		}
		endTime=System.nanoTime();
		System.out.println("Linear Search Time: "+(endTime-startTime)+" ns");
		return -1;
	}
	public static int binarySearch(int[] arr, int target) {
		long startTime, endTime;
		int left=0,right=arr.length-1;
		//MergeSort.mergeSort(arr,0,arr.length-1);
		Arrays.sort(arr);
		
		startTime=System.nanoTime();
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(target==arr[mid]) {
				endTime=System.nanoTime();
				System.out.println("Binary Search Time: "+(endTime-startTime)+" ns");
				return mid;
			}else if(target>arr[mid]) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		endTime=System.nanoTime();
		System.out.println("Binary Search Time: "+(endTime-startTime)+" ns");
		return -1;
	}
	/*
	public static void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid=left+(right-left)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	public static void merge(int[] arr, int left, int mid, int right) {
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
	*/
	public static void main(String[] args) {
		int[] oneThousand=new int[1000];
		int[] tenThousand=new int[10000];
		int[] oneMillion=new int[1000000];
		
		System.out.println("Time for 1000: ");
		linearSearch(oneThousand,2);
		binarySearch(oneThousand,2);
		
		System.out.println("Time for 10000: ");
		linearSearch(tenThousand,2);
		binarySearch(tenThousand,2);
		
		System.out.println("Time for 1,000,000: ");
		linearSearch(oneMillion,2);
		binarySearch(oneMillion,2);
	}
}
