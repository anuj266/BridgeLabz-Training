
public class CommonCharacterAtIndices
{   
	public static void main(String[] args) {
	    //Common Character at Corresponding Indices
	   String[] A = {"ae", "bc", "zx"};
	   String[] B = {"ab", "vb", "op"};
	   
	   for(int i=0;i<A.length;i++){
	       if(isCommon(A[i],B[i])){
	           System.out.print("YES ");
	       }else{
	           System.out.print("NO ");
	       }
	   }
	}
	
	static boolean isCommon(String a, String b){
	    for(int i=0;i< a.length();i++) {
            if(a.charAt(i)==b.charAt(i)){
                return true;
            }
        }
	    return false;
	}
	
	
}