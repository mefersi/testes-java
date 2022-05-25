package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Artigo;

public class TesteArtigoDate {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		Artigo artigo1 = new Artigo("Estudo sobre tomografia computadorizada");
		Date data1 = formato.parse("05/02/2022");
		artigo1.setDataDePublicacao(data1);

//		System.out.println(formato.format(data1));
		System.out.println(artigo1);

//		Artigo artigo2 = new Artigo("Fisica das radia��es", formato.format("15/03/2022"));

		Artigo artigo2 = new Artigo("Fisica das medi��es");
		Date data2 = formato.parse("15/03/2022");
		artigo2.setDataDePublicacao(data2);
		System.out.println(artigo2);
	}
}
