package cadastro;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	 Pessoa pessoa = new Pessoa(null, null, null, null, null, null, null);
	 Scanner sc = new Scanner(System.in);
	 String choice = null;
	 String nome,rg,cpf,bairro,rua,acontecimento;
	 
	 
	 System.out.println("Bem vindo ao locais perigosos aonde voce pode dizer em qual região de ribeirão voce sofreu um ataque ");
	 System.out.println("Deseja permanecer anonimo");
	 choice = sc.next();
	 if(choice.equals("Não") || choice.equals("nao")) {
		 System.out.println("Digite seu nome ");
		 nome = sc.next();
		 pessoa.setNome(nome) ;
		 System.out.println("Digite seu RG ");
		 rg = sc.next();
		 pessoa.setRG(rg);
		 System.out.println("Digite seu CPF ");
		 cpf = sc.next();
		 pessoa.setCPF(cpf);
		 System.out.println("Digite o bairro em que ocorreu o acontecimento ");
		 bairro = sc.next();
		 pessoa.setBairro(bairro);
		 System.out.println("Digite a rua em que sofreu a agressão ");
		 rua = sc.next();
		 pessoa.setRua(rua);
		 System.out.println("Digite qual tipo de assedio voce sofreu e como foi o acontecimento ");
		 acontecimento = sc.next();
		 pessoa.setAcontecimento(acontecimento);
	 }
	 else {
		 System.out.println("Digite o bairro em que ocorreu o acontecimento ");
		 bairro = sc.next();
		 pessoa.setBairro(bairro);
		 System.out.println("Digite a rua em que sofreu a agressão ");
		 rua = sc.next();
		 pessoa.setRua(rua);
		 System.out.println("Digite qual tipo de assedio voce sofreu e como foi o acontecimento ");
		 acontecimento = sc.next();
		 pessoa.setAcontecimento(acontecimento);
		 
	 }
	 System.out.println("A informação foi salva e sera publica para as pessoas obrigado");
	 

	}

}
