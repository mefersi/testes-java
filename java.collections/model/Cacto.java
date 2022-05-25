package model;

public class Cacto extends Suculenta {

	private String tipoEspinho;

	public Cacto(String nome, int codigo) {
		super(nome, codigo);
	}

	public String getTipoEspinho() {
		return tipoEspinho;
	}

	public void setTipoEspinho(String tipoEspinho) {
		this.tipoEspinho = tipoEspinho;
	}

	@Override
	public String toString() {
		return "Cacto: " + this.getNome() + ", codigo: " + this.getCodigo();
	}
}
