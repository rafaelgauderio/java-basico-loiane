package aula75_84_String;

public class Cliente {
	
	private Integer code;
	private String name;
	private Double creditLimit;
	
	public Cliente () {
		
	}

	public Cliente(Integer code, String name, Double creditLimit) {		
		this.code = code;
		this.name = name;
		this.creditLimit = creditLimit;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return "Cliente [code=" + code + ", name=" + name + ", creditLimit=" + String.format("%.2f", this.creditLimit) + "]";
	}
	
	
	
	

}
