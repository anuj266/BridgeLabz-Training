package scenrio;

//import java.util.*;


public class CreatorStats {
	public String creatorName;
	public double[] weeklyLikes;
	private String likes;
	public CreatorStats(String creatorName,String likes) {
		this.creatorName=creatorName;
		this.likes=likes;
		weeklyLikes=new double[4];
		addlikes(likes);
	}
	public void addlikes(String likes) {
		int idx=0;
		String[] like=likes.trim().split(",");
		for(String s:like) {
			weeklyLikes[idx++]=Double.parseDouble(s);
		}
	}
	

}
