package expressaoLambdaJava8;

public class Main1 {

	interface Num {

		double getValue();
	}

	interface ValorNumeric {

		boolean test(int n);
	}

	interface ValorNumeric2 {

		boolean test(int n, int n2);
	}

	public static void main(String[] args) {

		// Expressã lambda utilizada como uma constante
		Num n;
		n = () -> 3.1415;

		System.out.println(n.getValue());

		// Utilização da classe math com a estrutura lambda
		Num n2 = () -> Math.random() * 100;

		System.out.println(n2.getValue());

		System.out.println(n2.getValue());

		ValorNumeric isPar = (int i) -> (i % 2) == 0;

		System.out.println(isPar.test(89));
		System.out.println(isPar.test(90));

		ValorNumeric2 isDiv = (x, y) -> (x % y) == 0;
		System.out.println(isDiv.test(10, 2));
		System.out.println(isDiv.test(10, 3));

		ValorNumeric expessao1 = i -> (i % 2) == 0;
		ValorNumeric2 expressao2 = (int x, int y) -> {

			int w = x + y;

			return w > 1000;
		};

	}

}
