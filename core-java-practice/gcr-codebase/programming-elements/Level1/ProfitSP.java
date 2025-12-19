package level1;
public class ProfitSP {
    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;
        int profit = sp-cp;
        int percentage = (profit*100)/cp;
        System.out.println("The cost Price in INR " +cp+ " and Selling Price is INR "+sp+"\n The profit is INR "+profit+" and profit percentage is "+percentage + "%");
    }
}
