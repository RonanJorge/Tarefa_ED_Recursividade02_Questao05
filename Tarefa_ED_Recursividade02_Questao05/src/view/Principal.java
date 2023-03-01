/* Nome: Ronan Jorge
 * Data: 28/02/2023
 * Objetivo: 05)  Escrever uma fun��o recursiva que, dado uma posicao da serie de fibonacci,
 * a funcao retorne seu valor. Entrada limitada a 20.*/

package view;

import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Entre com a posicao na serie de Fibonacci:"));
		System.out.println("O valor da "+n+"a. posicao da serie de Fibonacci : "+op.fib(n)+".");
	}

}
