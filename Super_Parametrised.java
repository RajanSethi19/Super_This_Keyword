package Super_This_keyword;

class Maldives {

	Maldives(double d) {
		System.out.println("I am in Maldives constructor");
	}
}

class Russia extends Maldives {
	Russia(int a) {
		super(22.33);
		System.out.println("I am in Russia constructor");
	}

}

class China extends Russia {
	China(String b) {

		super(2);
		System.out.println("I am in China constructor");
	}

}

public class Super_Parametrised extends China {
	Super_Parametrised() {

		super("Rajan");
		System.out.println("I am in Super constructor");

	}

	public static void main(String[] args) {
		Super_Parametrised su = new Super_Parametrised();

	}

}
