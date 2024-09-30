package entities;

public abstract class Pessoa {

	private String name;
	private String adress;
	private Long phoneNumber;

	public Pessoa() {
	}
	
	public Pessoa(String name, String adress, Long phoneNumber) {
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}
