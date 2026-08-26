public class MaximumOcurringCharacter
{
	public static void main(String[] args) {
		// maximum occuring character 
		String s="aaaaaaaaaaabbbbbbbcccc";
		if (s == null || s.isEmpty()) {
            	    System.out.println("String is empty.");
            	    return;
        	}
		int[] freq=new int[26];
		for(char c:s.toCharArray()){
		    freq[c-'a']++;
		}
		int max=-1;
		int idx=-1;
		for(int i=0;i<26;i++){
		    if(freq[i]>max){
		        max=freq[i];
		        idx=i;
		    }
		}
		System.out.println("maximum occuring character: "+(char) ('a'+idx));
	}
}