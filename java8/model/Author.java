package model;

public class Author {

	private String name;

	public Author(String name) {
		this.name = name;
	}

	public void imprime() {
		System.out.println(name);
	}
}