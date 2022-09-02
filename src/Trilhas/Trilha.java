package Trilhas;

import Setores.Setorizacao;

public class Trilha implements Setorizacao{

	public Trilha(int id) {
		super();
		listSetorizacao.addToSetor(17);
		this.id = id;
	}
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
