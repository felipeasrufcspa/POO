package tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.CubicCurve2D.Double;
import java.util.Scanner;

import org.junit.jupiter.api.Test;


class calculadora {
	float n1;
    float n2;
    String  operacao = "";
// codigo do segundo semestre 
	@Test
	public void test() {
	
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite a opera��o desejada (+, -, *, /): ");
			operacao = entrada.nextLine();
			
			System.out.println("Digite um valor: ");
			n1 = entrada.nextFloat();
			
			System.out.println("Digite um valor: ");
			n2 = entrada.nextFloat();
			
			int controle = 0;
			float soma = Resultados.soma(n1, n2);
			float divisao= Resultados.divis�o(n1, n2);
			float subtracao = Resultados.subtracao(n1, n2);
			float multiplicao = Resultados.multiplicacao(n1, n1);
			
			if(operacao.equals("+")) {
				System.out.println("O resultado da Soma �: " + soma );
				controle ++;			
			}
			
			if(operacao.equals("-")) {
				System.out.println("O resultado da subtra��o �: " + subtracao);
				controle++;		
			}
			
			if(operacao.equals("*")) {
				System.out.println("O resultado da multiplica��o �: " + multiplicao);
				controle++;			
			}
			
			if(operacao.equals("/")) {
				System.out.println("O resultado da divis�o �: " + divisao);
				controle++;			
			}
			
					
 }


}
