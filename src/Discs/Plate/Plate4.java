package Discs.Plate;

import Discs.SuperficeInferior;
import Discs.SuperficeSuperior;

public class Plate4 extends Plate implements SuperficeInferior , SuperficeSuperior{
	 public Plate4(int id) {
			super();
			listsInferior.addToTrilha(305); 
			listsSuperior.addToTrilha(305);
			Id = id;
		}

		private int Id;

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		
}
