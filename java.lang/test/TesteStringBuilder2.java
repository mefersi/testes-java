package test;

public class TesteStringBuilder2 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Mudaram as estacoes");
		sb.append(" nada mudou");
		sb.append(" mas eu sei que alguma coisa");
		sb.append(" aconteceu");
		sb.append("\nta tudo assim");
		sb.append(" tao diferente");
		sb.append(" se lembra quando a gente");
		sb.append("chegou um dia acreditar");
		sb.append(" que tudo era para sempre");
		sb.append(" sem saber");
		sb.append(" \nque o para sempre");
		sb.append(" sempre acaba");
		String musica = sb.toString();
		System.out.println(musica);
	}
}
