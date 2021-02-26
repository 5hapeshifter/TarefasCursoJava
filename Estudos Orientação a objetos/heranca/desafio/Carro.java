package oo.heranca.desafio;

public class Carro {
/*criar dois carros sendo um uma Ferrari
 *criar atributo "velocidade atual" e os métodos acelerar e frear, acrescentar ou subtrair de 5 em 5
 *quando acima de 0.
 *na Ferrari, a aceleração é de 15 em 15km por hora
 */
	final int VELOCIDADE_MAXIMA;
	int velocidade = 0;
	int delta = 5;
	*************
	Carro(int velocidade){
		this.velocidade;
	}
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar(Carro acelerar) {
		if(velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += delta;
		}
		
//		if(velocidade >= 0 && velocidade <= 235) {
//			velocidade += 5;
//		} else {
//			velocidade = 0;
//		}
	}
	void frear(Carro frear) {
		if(velocidade >=5 && velocidade <= 240) {
			velocidade -= 5;
		}
		else {
			velocidade = 0;
		}
	}
	public String velocidadeAtual() {
		return "Velocidade atual é " + velocidade + "km/h";
	}
}
