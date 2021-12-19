package test;

public class TesteStringBuilder1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("É preciso");
		sb.append(" amar");
		sb.append(" as pessoas");
		sb.append(" como se nao");
		sb.append(" houvesse");
		sb.append(" amanha");
		sb.append(" porque se voce");
		sb.append(" parar para pensar");
		sb.append(" na verdade");
		sb.append(" nao ha");
		String musica = sb.toString();
		System.out.println(musica);
	}
}
