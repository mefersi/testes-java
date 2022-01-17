package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import model.Doce;

public class TesteMethodReferencesDoce {

	public static void main(String[] args) {
		
		List<Doce> doces = Arrays.asList(
				new Doce("Barra de chocolate", 6.00), 
				new Doce("Bolo", 100.00), 
				new Doce("Brigadeiro", 24.00),
				new Doce("Bala", 0.25),
				new Doce("Disqueti", 18.00));
		
		doces.forEach(TesteDoce::imprimeDoce);
		
		Consumer<Doce> saidaComLambda = d -> d.comparePorNome(d, d);
//		Consumer<Doce> saidaComMethodReferences = Doce::comparePorPreco;
		
		doces.forEach(saidaComLambda);
	}
}
