package entities;

public class PessoaFisica extends Pessoa {

	private Long cpf;

	public PessoaFisica() {
	}
	
	public PessoaFisica(String name, String adress, Long phoneNumber, Long cpf) {
		super(name, adress, phoneNumber);
		this.cpf = cpf;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
}
