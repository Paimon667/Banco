
public class Conta {

	int numero;
	double saldo;
	double limitesaque;
	Movimentacao movimentacoes[];
	Cliente c1;
	Agencia a1;
	
	
	Conta(){
		numero=0;
		saldo=0;
		limitesaque=0;
		c1 = new Cliente();
		a1 = new Agencia();
	}
 	
}
