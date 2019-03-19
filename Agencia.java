public class Agencia(){
int numero;
String nome;
String endereco;
Cliente[] clientes = new Cliente[20];
int ContadorClientes;
int ContadorContas;
Conta[] contas = new Conta[20];

public Agencia(){
numero=0;
nome="vago";
endereco="vago";
Cliente x = new Cliente();
Conta c = new Conta();
ContadorClientes=0;
ContadorContas=0;
for(int i=0; i<contas.lenght; i++){
  clientes[i]=x;
  contas[i]=c;
}

public Agencia(int numero, String nome, string endereco){
this.numero=numero;
this.nome=nome;
this.endereco=endereco;
  
}


}

}
