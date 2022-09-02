package Storage;
import Discs.*;
import Trilhas.Trilha;
import Setores.Setor;
public abstract class Storage {
    private int Id;
    private Disc disc;
    

   @SuppressWarnings("static-access")
public String lookForEmptySpace() 
   {
	   String colapsedIds = null;
	   if(disc.getPlate1().isCheio() == false) 
	   {
		   int stationaryPlateId = disc.getPlate1().getId();
		   for (Trilha t : disc.getPlate1().listsInferior.getTrilhas()) {
			if(t.isCheio() == false) 
			{
				int stationaryTrilhaId = t.getId();
				for (Setor s : t.listSetorizacao.getSetores() ) {
					if(s.isCheio() == false) 
					{
						int stationarySetorId = s.getId();
						colapsedIds = String.valueOf(stationaryPlateId) + "." + disc.getPlate1().identityI + "." + String.valueOf(stationaryTrilhaId)  + "." + String.valueOf(stationarySetorId);
					}
				}
			}
		}
		   return colapsedIds;
	   }
	   else if(disc.getPlate2().isCheio() == false) 
	   {
		   int stationaryPlateId = disc.getPlate2().getId();
		   for (Trilha t : disc.getPlate1().listsInferior.getTrilhas()) {
			if(t.isCheio() == false) 
			{
				int stationaryTrilhaId = t.getId();
				for (Setor s : t.listSetorizacao.getSetores() ) {
					if(s.isCheio() == false) 
					{
						int stationarySetorId = s.getId();
						colapsedIds = String.valueOf(stationaryPlateId) + "." + disc.getPlate2().identityI + "." + String.valueOf(stationaryTrilhaId)  + "." + String.valueOf(stationarySetorId);
					}
				}
			}
		}
		   return colapsedIds;
	   }
	   else if(disc.getPlate3().isCheio() == false) 
	   {
		   int stationaryPlateId = disc.getPlate3().getId();
		   for (Trilha t : disc.getPlate1().listsInferior.getTrilhas()) {
			if(t.isCheio() == false) 
			{
				int stationaryTrilhaId = t.getId();
				for (Setor s : t.listSetorizacao.getSetores() ) {
					if(s.isCheio() == false) 
					{
						int stationarySetorId = s.getId();
						colapsedIds = String.valueOf(stationaryPlateId) + "." + disc.getPlate3().identityI + "." + String.valueOf(stationaryTrilhaId)  + "." + String.valueOf(stationarySetorId);
					}
				}
			}
		}
		   return colapsedIds;
	   }
	   else if(disc.getPlate4().isCheio() == false) 
	   {
		   int stationaryPlateId = disc.getPlate4().getId();
		   
		   for (Trilha t : disc.getPlate1().listsInferior.getTrilhas()) {
			if(t.isCheio() == false) 
			{
				int stationaryTrilhaId = t.getId();
				for (Setor s : t.listSetorizacao.getSetores() ) {
					if(s.isCheio() == false) 
					{
						int stationarySetorId = s.getId();
						colapsedIds = String.valueOf(stationaryPlateId) + "." + disc.getPlate4().identityI + "." + String.valueOf(stationaryTrilhaId)  + "." + String.valueOf(stationarySetorId);
					}
				}
			}
		}
		   return colapsedIds;
	   }
	return null;
	   
   }
}
