package Discs;

import Discs.Plate.Plate1;
import Discs.Plate.Plate2;
import Discs.Plate.Plate3;
import Discs.Plate.Plate4;
import Lists.ListsTo;


public class Disc {
	

    private Plate1 plate1 = new Plate1(ListsTo.getRand().nextInt(100000));
    private Plate2 plate2 = new Plate2(ListsTo.getRand().nextInt(100000));
    private Plate3 plate3 = new Plate3(ListsTo.getRand().nextInt(100000));
    private Plate4 plate4 = new Plate4(ListsTo.getRand().nextInt(100000));


    public Plate1 getPlate1() {
        return plate1;
    }

    public Plate2 getDisc2() {
        return plate2;
    }

    public Plate3 getPlate3() {
        return plate3;
    }

    public Plate4 getDisc4() {
        return plate4;
    }
}
