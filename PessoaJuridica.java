public class PessoaJuridica extends Cliente {
	public String CNPJ;

	public PessoaJuridica() {
		super();
		this.CNPJ = "0";
	}

	public PessoaJuridica(String nome, String endereco, String telefone, String email, String CNPJ) {
		super(nome, endereco, telefone, email);
		this.CNPJ = CNPJ;
	}

}
