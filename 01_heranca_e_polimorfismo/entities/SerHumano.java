package entities;

public class SerHumano extends SerVivo{

	private double altura;
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String nomeClasse() {
		return "Classe SerHumano";
	}
}
