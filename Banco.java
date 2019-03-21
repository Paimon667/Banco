import java.util.Scanner;
public class Banco {

	Conta[] listaContas = new Conta[10];
	Scanner y = new Scanner(System.in);

	Banco() {
		Conta z = new Conta();
		for (int i = 0; i < listaContas.length; i++) {
			listaContas[i] = z;
		}
	}

	void CriarConta(int tipo) {
		if (tipo == 1) { // poupanca
			ContaPoupanca x = new ContaPoupanca();
			for (int i = 0; i < listaContas.length; i++) {
				if (listaContas[i].numero == 0) {
					listaContas[i] =x;
					listaContas[i].numero = i + 1;
					System.out.println("O número de sua conta é :" + i + 1);
				}
			}
		} else {
			ContaCorrente x = new ContaCorrente();
			for (int i = 0; i < listaContas.length; i++) {
				if (listaContas[i].numero == 0) {
					System.out.println("Tem cheque especial ? se sim digite o valor, não digite 0");
					x.limitechequeesp=y.nextDouble();
					listaContas[i] =x;
					listaContas[i].numero = i + 1;
					System.out.println("O número de sua conta é :" + i + 1);
				}
			}

		}
	}

	void excluirConta(int numero) {
		Conta x = new Conta();
		listaContas[numero - 1] = x;
	}

	void sacar(int numero, int valor) {
		if (valor <= listaContas[numero - 1].limitesaque) {
			listaContas[numero - 1].saldo = -valor;
			listaContas[numero - 1].limitesaque = -valor;
			System.out.println("Seu novo saldo é de: " + listaContas[numero - 1].saldo);
		} else {
			System.out.println("Saque superior ao limite oferecido");
		}
	}

	void depositar(int numero, int valor) {
		listaContas[numero - 1].saldo = +valor;
		listaContas[numero - 1].limitesaque = +valor;
		System.out.println("Seu novo saldo é :" + listaContas[numero - 1].saldo);
	}

	void transferir(int numero1, int numero2, int valor) {
		listaContas[numero1 - 1].saldo = +valor;
		listaContas[numero1 - 1].limitesaque = +valor;
		listaContas[numero2 - 1].saldo = -valor;
		listaContas[numero2 - 1].limitesaque = -valor;
		System.out.println("Transferencia efetuada com sucesso");
	}

	void emitirSaldo(int numero1) {
		System.out.println("seu saldo atual é :"+listaContas[numero1-1].saldo);
	}
	
	void emitirExtrato(int numero) {
		for(int i=0;i<listaContas[numero-1].movimentacoes.length;i++) {
			System.out.println(listaContas[numero-1].movimentacoes[i].descricao);
			System.out.println(listaContas[numero-1].movimentacoes[i].valor);
		}
	}
}
