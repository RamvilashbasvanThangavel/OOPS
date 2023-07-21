package polyMorphismOverLoading;

public class UseAdd {
	public static void main(String[] args) {
		Add a1 = new Add();
		System.out.println(a1.add(1));
		System.out.println(a1.add(1, 2));
		System.out.println(a1.add(1, 2, 3));
		System.out.println(a1.add(1, 2, 3, 4));
	}

}
