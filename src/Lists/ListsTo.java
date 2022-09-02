package Lists;
import Trilhas.*;
import java.util.*;
import Setores.Setor;

public class ListsTo {
	private static List<Trilha> trilhas = new LinkedList<Trilha>();
	private static List<Setor> setores = new LinkedList<Setor>();
	private static Random rand = new Random();
	public void addToTrilha(int qtty) 
	{
			for (int i = 0; i < qtty; i++) {
				int id = getRand().nextInt(10000);
				Trilha trial = new Trilha(id);
				trilhas.add(trial);
				
			}
	}
	public void addToSetor(int qtty) 
	{
			for (int i = 0; i < qtty; i++) {
				int id = getRand().nextInt(10000);
				Setor setor = new Setor(id);
				setores.add(setor);
				
			}
	}
	public static Random getRand() {
		return rand;
	}
	
	public Trilha returnedTrilha() 
	{
		Trilha trilha = null;
		for (Trilha t : trilhas) {
			if(t == null) 
			{
				trilha = t;
			}
		}
		return trilha;
	}
}
