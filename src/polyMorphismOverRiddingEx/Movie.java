package polyMorphismOverRiddingEx;

public class Movie {
	public String fight(int a) {
		if (a <= 3) {
			return "Good";
		} else {
			return "Average";
		}
	}
	public String movieName() {
		return "Beast";
	}
	

}
