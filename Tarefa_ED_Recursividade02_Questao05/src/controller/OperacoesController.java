package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public int fib(int n){
		/* f(1) = 1; f(2) = 1 e f(n) = f(n - 1) + f(n - 2)
		 * Para n maior que 2, a funcao devera retornar a soma dela mesma 
		 * aplicada para os dois valores anteriores a n.
		 * O ponto de parada sera quando n for igual 1 ou 2, nestes dois casos, a 
		 * funcao devera retornar o valor 1.
		*/
		if(n == 1 || n == 2) return 1;
		else return fib(n - 1) + fib(n - 2); 
	}
}