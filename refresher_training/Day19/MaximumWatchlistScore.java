import java.util.*;
public class MaximumWatchlistScore
{   
    static class Movie{
        int duration;
        int rating;
        Movie(int duration, int rating){
            this.duration=duration;
            this.rating=rating;
        }
    }
	public static void main(String[] args) {
		//maximum watchlist score
		//score = (sum of durations of selected movies) × (minimum rating among selected movies)
		int[] duration={4,5,3,2};
		int[] rating={5,2,4,3};
		int limit=2;
		System.out.println(watchlistScore(duration,rating,limit));
	}
	
	static long watchlistScore(int[] duration,int[] rating, int limit){
	    Movie[] movies=new Movie[duration.length];
	    for(int i=0;i<duration.length;i++){
	        movies[i]=new Movie(duration[i],rating[i]);
	    }
	    Arrays.sort(movies,(a,b)->Integer.compare(b.rating,a.rating));
	    PriorityQueue<Integer> q=new PriorityQueue();
	    long sumDuration=0;
	    long maxScore=0;
	    for(Movie movie:movies){
	        q.offer(movie.duration);
	        sumDuration+=movie.duration;
	        
	        if(q.size()>limit){
	            int removed=q.poll();
	            sumDuration-=removed;
	        }
	        long score=sumDuration*movie.rating;
	        maxScore=Math.max(maxScore,score);
	    }
	    return maxScore;
	}
	
}