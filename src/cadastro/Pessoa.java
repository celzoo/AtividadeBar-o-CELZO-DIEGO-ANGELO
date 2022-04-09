package cadastro;

public class Pessoa {
	
	private String nome;
	private String CPF;
	private String RG;
	private String rua;
	private String bairro;
	private String dataDoAcontecimento;
	private String acontecimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getDataDoAcontecimento() {
		return dataDoAcontecimento;
	}
	public void setDataDoAcontecimento(String dataDoAcontecimento) {
		this.dataDoAcontecimento = dataDoAcontecimento;
	}
	public String getAcontecimento() {
		return acontecimento;
	}
	public void setAcontecimento(String acontecimento) {
		this.acontecimento = acontecimento;
	}
	public Pessoa(String nome, String cPF, String rG, String rua, String bairro, String dataDoAcontecimento,
			String acontecimento) {

		this.nome = nome;
		CPF = cPF;
		RG = rG;
		this.rua = rua;
		this.bairro = bairro;
		this.dataDoAcontecimento = dataDoAcontecimento;
		this.acontecimento = acontecimento;
	}
	
	

}
