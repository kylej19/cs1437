
package RepairShop;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Computer> allComputers = new ArrayList<>();

    public void addNewComputer(Computer newComputer) {
        allComputers.add(newComputer);
    }

}
