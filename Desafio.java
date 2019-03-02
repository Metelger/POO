
public class Desafio {
	public static void main(String[] args) {
		//var: Gasolina, alcool, resultado
		//Se gasolina * 0.7 < que o valor do alcool, gasolina compensa
		double gasolina = 3.9;
		double alcool = 2.8;
		
		if (gasolina * 0.7 < alcool) {
			System.out.println("Compensa abastecer com gasolina!");
		}else {
			System.out.println("Compensa abastecer com alcool!");
		}
	}

}
