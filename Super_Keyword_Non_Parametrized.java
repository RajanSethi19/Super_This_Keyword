package Super_This_keyword;

class Hindi {
	Hindi() {

		System.out.println("I ma in Hindi class constructor");
	}

}

class Math extends Hindi {
	Math() {
		// super();
		System.out.println("I ma in Math class constructor");
	}

}

public class Super_Keyword_Non_Parametrized extends Math {

	Super_Keyword_Non_Parametrized() {
		// super(); we write or we don't write super the result is same bcz in
		// constructor super is present implicitly
		System.out.println("I am in super class");
	}

	public static void main(String[] args) {

		Super_Keyword_Non_Parametrized s = new Super_Keyword_Non_Parametrized();

	}

}
