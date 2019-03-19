public class PessoaFisica extends Cliente{
  public String CPF;
  public String estadoCivil;
  
  public PessoaFisica(String CPF, String estadoCivil){
    this.CPF = CPF;
    this.estadoCivil = estadoCivil;
  }
  
  public PessoaFisica(){
    this.CPF = 0;
    this.estadoCivil = "null";
  }
   
  
  
}
