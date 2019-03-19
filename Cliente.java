public class Cliente {
  String nome;
  String endereco;
  String telefone;
  String email; 
  Conta[] listaDecontas = new Conta[10];
  int Contador;
  
  public Cliente(){
    contador=0;
    nome="vago";
    endereco="vago";
    telefone="vago";
    email="vago";
    Conta c = new Conta();
    for(int i=0; i<listaDecontas.lenght; i++){
      listaDeconta=c;
    }
  }
  
  public Cliente(String nome; String endereco; int telefone; String email){
    this.nome=nome;
    this.endereco=endereco;
    this.telefone=telefone;
    this.email=email;
  }
}
