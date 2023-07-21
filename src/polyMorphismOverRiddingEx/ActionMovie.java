package polyMorphismOverRiddingEx;

public class ActionMovie extends Movie {
	public String fight(int a) {
		if (a > 0 && a <= 3) {
			return "Bad";
		} else if (a > 3 || a <= 5) {
			return "Average";
		} else {
			return "VeryGood";
		}
	}

}
