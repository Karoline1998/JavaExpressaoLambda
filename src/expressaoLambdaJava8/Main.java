package expressaoLambdaJava8;

public class Main {

	public static void main(String[] args) {

		System.out.println("=== Inicio do teste ===");

//		Implementação da classe anonima Runnable		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				System.out.println("Estudando a expressao lambda 1.");
			}
		};

		Runnable r2;

		r2 = () // Lista de argumentos
		-> // Seta
		System.out.println("Estudando a expressão lambida 2."); // corpo

		r1.run();
		r2.run();
	}

}
