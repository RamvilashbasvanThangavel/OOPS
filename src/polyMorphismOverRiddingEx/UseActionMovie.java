package polyMorphismOverRiddingEx;

public class UseActionMovie {
	public static void main(String[] args) {
		ActionMovie am = new ActionMovie();
		System.out.println(am.fight(6));
		System.out.println(am.movieName());
		
		Movie m = new Movie();
		System.out.println(m.fight(6));
	}

}
