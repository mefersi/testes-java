package model;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Planta {

	private String descricao;
	private Set<Suculenta> suculentas = new HashSet<Suculenta>();
	private Set<Cacto> cactos = new HashSet<Cacto>();
	private Map<Integer, Suculenta> codigoSuculenta = new HashMap<>();

	public Planta(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setSuculentas(Set<Suculenta> suculentas) {
		this.suculentas = suculentas;
	}

	public void setCactos(Set<Cacto> cactos) {
		this.cactos = cactos;
	}

	public Set<Suculenta> getSuculentas() {
		return Collections.unmodifiableSet(suculentas);
	}

	public Set<Cacto> getCactos() {
		return Collections.unmodifiableSet(cactos);
	}

	public void adiciona(Suculenta suculenta) {
		this.suculentas.add(suculenta);
		this.codigoSuculenta.put(suculenta.getCodigo(), suculenta);
	}

	public void adiciona(Cacto cacto) {
		this.cactos.add(cacto);
	}

	public Suculenta buscaSuculenta(int codigo) {
		if (!codigoSuculenta.containsKey(codigo)) {
			throw new NoSuchElementException("Codigo da suculenta nao encontrado!");
		}
		return codigoSuculenta.get(codigo);
	}
}
