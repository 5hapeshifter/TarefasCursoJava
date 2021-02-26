package oo.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro Civic = new Civic();// Sempre alterar o construtor para chamar a classe usando os atributos e métodos como herança
		Civic.acelerar(Civic);
		Civic.acelerar(Civic);
		Civic.acelerar(Civic);
		Civic.acelerar(Civic);
		
		Carro Ferrari = new Ferrari();
		Ferrari.acelerar(Ferrari);
		Ferrari.acelerar(Ferrari);
		Ferrari.acelerar(Ferrari);
		Ferrari.acelerar(Ferrari);
		
		Ferrari.frear(Ferrari);
	
			
		System.out.println(Civic.velocidadeAtual());
		System.out.println(Ferrari.velocidadeAtual());
		
	}
}
