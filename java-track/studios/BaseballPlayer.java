
public class BaseballPlayer {
	
	String name;
	int num;
	String hand;
	int hits;
	int RBI;
	int gamesPlayed;
	
	public BaseballPlayer(String name, int num, String hand, int hits, int RBI, int gamesPlayed){
		this.name = name;
		this.num = num;
		this.hand = hand;
		this.hits = hits;
		this.RBI = RBI;
		this.gamesPlayed = gamesPlayed;
	}
	
	public int hits(int h){
		this.hits += h;
		return this.hits;
	}
	
	public int RBI(int r){
		this.RBI += r;
		return this.RBI;
	}
	
	public int gamesPlayed(int g){
		this.gamesPlayed += g;
		return this.gamesPlayed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BaseballPlayer bp = new BaseballPlayer("Brandon",5,"left",5,1,2);
		 
	}

}
