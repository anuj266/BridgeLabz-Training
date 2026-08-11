public class FirstAndLastOccurance{
    public static void main(String[] args){
        int[] arr={1,2,2,2,2,3,4,4,4,5,6,7,7};
        int target=7;
        int firstOccuranceIdx=firstOccurance(arr,target);
        int lastOccuranceIdx=lastOccurance(arr,target);
        System.out.println("first occurance idx : "+firstOccuranceIdx);
        System.out.println("last occurance idx :"+lastOccuranceIdx);
    }

    private static int firstOccurance(int[] arr, int target){
        int low=0,high=arr.length-1;
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                idx=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return idx;
    }

    private static int lastOccurance(int[] arr, int target){
        int low=0,high=arr.length-1;
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                idx=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return idx;
    }
}