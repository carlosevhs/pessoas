package entities;

public class PessoaJuridica extends Pessoa{

	
	private Long cnpf;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String name, String adress, Long phoneNumber, Long cnpf) {
		super(name, adress, phoneNumber);
		this.cnpf = cnpf;
	}

	public Long getCnpf() {
		return cnpf;
	}

	public void setCnpf(Long cnpf) {
		this.cnpf = cnpf;
	}
	
	
	
}
