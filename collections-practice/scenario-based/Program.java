package scenrio;
import java.util.*;
public class Program {
	List<CreatorStats> EngagementBoard = new ArrayList<>();
	public static void main(String[] args) {
		Program program = new Program();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Register Creator");
			System.out.println("2. Show Top Posts");
			System.out.println("3. Calculate Average Likes");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1) {
				System.out.println("Enter Creator Name : ");
				String creatorName = sc.nextLine();
				System.out.println("Enter Weekly Likes for 4 weeks (eg. 100,200,200,300)");
				String likes = sc.nextLine();
				program.RegisterCreator(creatorName , likes);
				System.out.println("Creator registered successfully");	
			}
			else if(choice == 2) {
				System.out.println("Enter like threshold ");
				double likeThreshold = sc.nextDouble();
				Map<String , Integer> map = program.GetTopPostCounts(program.EngagementBoard, likeThreshold);
				System.out.println(map);
			}
			else if(choice == 3) {
				double average = program.CalculateAverageLikes(program.EngagementBoard);
				System.out.println("Overall average weekly likes: "+average);
			}
			else if(choice == 4) {
				System.out.println("Logging off — Keep Creating with StreamBuzz!");
				break;
			}
			sc.close();
		}
		
		
		
	}

	public void RegisterCreator(String creatorName,String likes) {
	    EngagementBoard.add(new CreatorStats(creatorName,likes));
	}
	public Map<String, Integer> GetTopPostCounts(List<CreatorStats> EngagementBoard, double likeThreshold){
		Map<String , Integer> result = new HashMap<>();
		for(CreatorStats stat : EngagementBoard) {
			int count = 0;
			for(double x : stat.weeklyLikes) {
				if(x > likeThreshold) count++;
			}
			if(count > 0) {
				result.put(stat.creatorName, count);
			}
		}
		return result;
	}
	public double CalculateAverageLikes(List<CreatorStats> EngagementBoard) {
	    double sum = 0;
		for(CreatorStats stat : EngagementBoard) {
			for(double x : stat.weeklyLikes) {
				sum += x;
			}
		}
		return sum/(4*EngagementBoard.size());
	}
}
