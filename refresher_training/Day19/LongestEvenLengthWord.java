public class LongestEvenLengthWord
{
	public static void main(String[] args) {
		//longest even length word
		String sentence="My name is ryuga";
		String[] arr=sentence.split(" ");
		int ans=0;
		int idx=0;
		for(int i=0;i<arr.length;i++){
		    int len=arr[i].length();
		    if(len%2==0 && len>ans){
		        ans=len;
		        idx=i;
		    }
		}
		System.out.println(arr[idx]);
	}
}