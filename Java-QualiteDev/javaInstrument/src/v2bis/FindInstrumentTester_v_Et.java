package v2bis;

import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.List;

public class FindInstrumentTester_v_Et {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes= new GuitarSpec("Stratocastor", Builder.FENDER , Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER, 6);
        MandolinSpec whatErinLikes2 = new MandolinSpec(Builder.PRS, "F-5G", Type.ACOUSTIC, Wood.MAPLE,
                Wood.MAPLE, Style.A);
        List matchingInstruments = inventory.search (whatErinLikes);

        if (!matchingInstruments.isEmpty()) {
            System.out.println( matchingInstruments);
        }

        else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }


    public static void initializeInventory(Inventory inventory) {

        // Ajout des guitares à l'inventaire
        inventory.addInstrument("11277", 3999.95,
                new GuitarSpec("CJ", Builder.COLLINGS,  Type.ACOUSTIC,
                                        Wood.INDIAN_ROSEWOOD, Wood.SITKA, 6));
        inventory.addInstrument("V95693", 1499.95,
                new GuitarSpec("Stratocastor", Builder.FENDER,Type.ELECTRIC,
                                        Wood.ALDER, Wood.ALDER, 12));
        inventory.addInstrument("V9512", 1549.95,
                new GuitarSpec("Stratocastor", Builder.FENDER,  Type.ELECTRIC,
                                        Wood.ALDER, Wood.ALDER, 6));
        inventory.addInstrument("122784", 5495.95,
                new GuitarSpec("D-18", Builder.MARTIN,  Type.ACOUSTIC,
                                        Wood.MAHOGANY, Wood.ADIRONDACK, 6));
        inventory.addInstrument("76531", 6295.95,
                new GuitarSpec("OM-28", Builder.MARTIN, Type.ACOUSTIC,
                                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 6));
        inventory.addInstrument("70108276", 2295.95,
                new GuitarSpec("Les Paul", Builder.GIBSON,  Type.ELECTRIC,
                                        Wood.MAHOGANY, Wood.MAHOGANY, 6));
        inventory.addInstrument("82765501", 1890.95,
                new GuitarSpec("SG '61 Reissue", Builder.GIBSON, Type.ELECTRIC,
                                        Wood.MAHOGANY, Wood.MAHOGANY, 6));
        inventory.addInstrument("77023", 6275.95,
                new GuitarSpec("D-28", Builder.MARTIN, Type.ACOUSTIC,
                                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 6));
        inventory.addInstrument("1092", 12995.95,
                new GuitarSpec("SJ", Builder.OLSON,  Type.ACOUSTIC,
                                        Wood.INDIAN_ROSEWOOD, Wood.CEDAR, 12));
        inventory.addInstrument("566-62", 8999.95,
                new GuitarSpec("Cathedral", Builder.RYAN, Type.ACOUSTIC,
                                        Wood.COCOBOLO, Wood.CEDAR, 12));
        inventory.addInstrument("6 29584", 2100.95,
                new GuitarSpec("Dave Navarro Signature", Builder.PRS, Type.ELECTRIC,
                                        Wood.MAHOGANY, Wood.MAPLE, 6));

        // Ajout des mandolines à l'inventaire
        inventory.addInstrument("8819920", 5495.99 ,
                new MandolinSpec(Builder.PRS, "F-5G", Type.ACOUSTIC,
                        Wood.MAPLE, Wood.MAPLE, Style.F));
        inventory.addInstrument("9019920", 745.99 ,
                new MandolinSpec (Builder.PRS, "F-5G", Type.ACOUSTIC,
                        Wood.MAPLE, Wood.MAPLE, Style.A));
    }


}