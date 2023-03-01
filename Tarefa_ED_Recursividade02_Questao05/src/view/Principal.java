/* Nome: Ronan Jorge
 * Data: 28/02/2023
 * Objetivo: 05)  Escrever uma função recursiva que, dado uma posição da série de fibonacci,
 * a função retorne seu valor. Entrada limitada a 20.*/

package view;

import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Entre com a posição na série de Fibonacci:"));
		System.out.println("O valor da "+n+"ª posição da série de Fibonacci é "+op.fib(n)+".");
	}

}
