public class Main {

	public static void main(String[] args) {
  	int n1, n2;
		double res;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro número inteiro");
		n1 = input.nextInt();
		System.out.println("Insira o segundo número inteiro");
		n2 = input.nextInt();
		
		Operacao operacao = new Operacao(n1, n2);

		operacao.soma();
		System.out.println("O resultado da soma é: "+ operacao.getResultado());
		
		operacao.calcularMedia(n1, n2);
		System.out.println("A média dos números é: "+ operacao.getResultado());
		
		res = operacao.multiplicar();
		System.out.println("O resultado da multiplicação dos números é: "+ res);

		res = operacao.dividir(n1, n2);
		System.out.println("O resultado da divisão dos números é: "+ res);	
		
		operacao.subtrair();
		System.out.println("O resultado da subtração é: " + operacao.getResultado());

		res = operacao.calcularPotencia();
		System.out.println(" o resultado da Potência é: " + res);

		operacao.calcularFatorial(n1);
		System.out.println("O resultado do fatorial é: "+operacao.getResultado());
		
		res = operacao.calcularMediaPonderada(n1, n2);
		System.out.println("O resultado da media ponderada é: "+operacao.getResultado());
  	}
}
