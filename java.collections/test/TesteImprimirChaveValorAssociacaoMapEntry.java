package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteImprimirChaveValorAssociacaoMapEntry {

	public static void main(String[] args) {

		Map<String, Integer> pessoasIdades = new HashMap<String, Integer>();

		pessoasIdades.put("Yuri", 26);
		pessoasIdades.put("Cristiane", 33);
		pessoasIdades.put("Regina", 56);
		pessoasIdades.put("Julia", 02);
		
		//para acessar as chaves e exibir o nome
        Set<String> chaves = pessoasIdades.keySet();    
        for (String nome : chaves) {
            System.out.println(nome);
        }
        
        //para acessar os valores e exibir a idade
        Collection<Integer> valores = pessoasIdades.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }
        
        //para acessar a associacao e imprimir a chave e o valor
        Set<Entry<String, Integer>> associacoes = pessoasIdades.entrySet();
        
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
	}
}
