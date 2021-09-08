package calculadora;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		float num1 = teclado.nextFloat();
		System.out.println("Digite o segundo digito:");
		float num2 = teclado.nextFloat();
		teclado.close();
		float resultadoSoma = calc.somar(num1, num2);
		System.out.printf("O resultado da soma � %.2f", resultadoSoma);
		
		float resultadoSub = calc.subtrair(num1, num2);
		System.out.printf("O resultado da subtra��o � %.2f", resultadoSub);
		
		float resultadoMult = calc.multiplicacao(num1, num2);
		System.out.printf("O resultado da multipli��o � %.2f", resultadoMult);
		
		float resultadoDiv = calc.divisao(num1, num2);
		System.out.printf("O resultado da divis�o � %.2f",resultadoDiv);
		
		float resultadoResto = calc.restoDaDivisao(num1, num2);
		System.out.printf("O resultado do resto � %.2f",resultadoResto);
		
		float resultadoPot = calc.potencia(num1, num2);
		System.out.printf("O resultado da pot�ncia � %.2f",resultadoPot);
		
		float resultadoRaiz = calc.raizQuadrada(num2);
		System.out.printf("O resultado da raiz � %.2f",resultadoRaiz);

	}

}
