package entities;

public class Aluguel {

	/*Aluguel de dez quartos:
	 * Um programa que inicie os 10 quartos vazios, e depois
	 * leia uma N (que pode ser de 1 a 10). Registre o aluguel,
	 * nome e emaisl dos hospedes e o quarto que ele 
	 * escolheu. Ao final mostre um relatorio com todas as 
	 * ocupações
	 */
	
	private String nome;
	private String email;
	
	// get = pegue
	// set = faça
	
	public Aluguel(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
    public String toString() {
    	return nome +","+email;
    }
	
}
