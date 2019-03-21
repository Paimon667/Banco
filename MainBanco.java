
import java.util.Scanner;

public class MainBanco {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Banco b = new Banco();
		while (5 == 5) {
			System.out.println("Digite a opção desejada");
			System.out.printf(
					"1-Criar conta\n 2-Excluir conta\n 3-Sacar\n 4-Depositar\n 5- Transferir\n 6- ver saldo\n 7-Ver extrato");
			int op = x.nextInt();
			switch (op) {
			case 1:
				System.out.println("tipo de conta, 1-corrente 0- poupanca");
				System.out.println("Pessoa fisica 1- Juridica-0");
				b.CriarConta(x.nextInt(), x.nextInt());
				break;
			case 2:
				System.out.println("Digite o numero da conta");
				b.excluirConta(x.nextInt());
				break;
			case 3:
				System.out.println("Digite o numero da conta seguido do valor");
				b.sacar(x.nextInt(), x.nextInt());
				break;
			case 4:
				System.out.println("Digite o numero da conta seguido do valor");
				b.depositar(x.nextInt(), x.nextInt());
				break;
			case 5:
				System.out.println(
						"Digite o numero da conta que irá receber, seguido da que irá depositar, junto do valor");
				b.transferir(x.nextInt(), x.nextInt(), x.nextInt());
				break;
			case 6:
				System.out.println("Digite o numero da conta");
				b.emitirSaldo(x.nextInt());
				break;
			case 7:
				System.out.println("Digite o numero da conta");
				b.emitirExtrato(x.nextInt());
			}
		}

	}
}
