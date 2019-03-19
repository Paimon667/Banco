public class PessoaFisica extends Cliente{
  public String CPF;
  public String estadoCivil;
  
  public PessoaFisica(String nome, String endereco, String telefone, String email,String CPF, String estadoCivil){
   super(nome,endereco,telefone,email);
    this.CPF = CPF;
    this.estadoCivil = estadoCivil;
  }
  
  public PessoaFisica(){
    super();
    this.CPF = 0;
    this.estadoCivil = "vago";
  }
   
  
  
}
