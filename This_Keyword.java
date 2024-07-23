package Super_This_keyword;
// with the help of 1 object we called every constructor by this keyword
public class This_Keyword {

	This_Keyword(int a) {
		System.out.println("I am in 1 constructor");

	}

	This_Keyword(String a) {
		this(30);
		System.out.println("I am in 2 constructor");

	}

	This_Keyword(String b, int a) {

		this("Sethi");
		System.out.println("I am in 3 constructor");
	}

	public static void main(String[] args) {

		This_Keyword tw = new This_Keyword("Rajan", 10);

	}

}
