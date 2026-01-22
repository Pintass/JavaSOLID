package v3.client;

import enumType.Builder;
import enumType.Type;
import enumType.Caracteristiques;
import enumType.Wood;
import enumType.Style;
import enumType.InstrumentType;
import v3.modele.Instrument;
import v3.modele.InstrumentSpec;
import v3.modele.Inventory;

import java.util.*;

public class FindInstrumentTester {

    public static void main(String[] args) {
        // Set up Rick's inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);


        InstrumentSpec whatBryanLikes = new InstrumentSpec(Arrays.asList(
                Caracteristiques.INSTRUMENT_TYPE, InstrumentType.GUITAR));

        whatBryanLikes = new InstrumentSpec(Arrays.asList(
                Caracteristiques.INSTRUMENT_TYPE, InstrumentType.BANJO
        ));

        List matchingInstruments = inventory.search(whatBryanLikes);
        if (!matchingInstruments.isEmpty())
            System.out.println( "Here's what we have for you:\n" +matchingInstruments);
        else
            System.out.println("Sorry, we have nothing for you.");
    }


    public static void initializeInventory(Inventory inventory) {
        inventory.addInstrument(new Instrument("82765501", 1890.95,
                new InstrumentSpec(Arrays.asList(
                        Caracteristiques.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Caracteristiques.TYPE, Type.ELECTRIC,
                        Caracteristiques.MODEL, "SG '61 Reissue",
                        Caracteristiques.BACKWOOD, Wood.MAHOGANY,
                        Caracteristiques.TOPWOOD, Wood.MAHOGANY))));

        inventory.addInstrument(new Instrument("9019920", 5495.99,
                new InstrumentSpec(Arrays.asList(
                        Caracteristiques.INSTRUMENT_TYPE, InstrumentType.MANDOLIN,
                        Caracteristiques.TYPE, Type.ACOUSTIC,
                        Caracteristiques.MODEL, "DRSM-008 E",
                        Caracteristiques.BACKWOOD, Wood.MAPLE,
                        Caracteristiques.TOPWOOD, Wood.MAPLE,
                        Caracteristiques.BUILDER, Builder.PRS,
                        Caracteristiques.STYLE, Style.A
                ))));

        inventory.addInstrument(new Instrument("7819920", 549,
                new InstrumentSpec(Arrays.asList(
                        Caracteristiques.INSTRUMENT_TYPE, InstrumentType.MANDOLIN,
                        Caracteristiques.TYPE, Type.ACOUSTIC,
                        Caracteristiques.MODEL, "F-5G",
                        Caracteristiques.BACKWOOD, Wood.MAPLE,
                        Caracteristiques.TOPWOOD, Wood.MAPLE,
                        Caracteristiques.BUILDER, Builder.GIBSON,
                        Caracteristiques.STYLE, Style.F
                ))));
        inventory.addInstrument(new Instrument("8900231", 2945.95,
                new InstrumentSpec(Arrays.asList(
                        Caracteristiques.INSTRUMENT_TYPE, InstrumentType.BANJO,
                        Caracteristiques.MODEL, "RB-3 Wreath",
                        Caracteristiques.YEAR_OF_MANUFACTURE, 1967
                ))));
        inventory.addInstrument(new Instrument("70108276", 2295.95,
                new InstrumentSpec(Arrays.asList(
                        Caracteristiques.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Caracteristiques.BUILDER, Builder.GIBSON,
                        Caracteristiques.MODEL, "Les Paul",
                        Caracteristiques.BACKWOOD, Wood.MAPLE,
                        Caracteristiques.TOPWOOD, Wood.MAPLE
                ))));
        inventory.addInstrument(new Instrument("V95693", 1499.95,
                new InstrumentSpec(Arrays.asList(
                        Caracteristiques.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Caracteristiques.BUILDER, Builder.FENDER,
                        Caracteristiques.MODEL, "Stratocastor",
                        Caracteristiques.BACKWOOD, Wood.ALDER,
                        Caracteristiques.TOPWOOD, Wood.ALDER,
                        Caracteristiques.TYPE, Type.ELECTRIC
                ))));
        inventory.addInstrument(new Instrument("V9512", 1549.95,
                new InstrumentSpec(Arrays.asList(
                        Caracteristiques.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Caracteristiques.BUILDER, Builder.FENDER,
                        Caracteristiques.MODEL, "Stratocastor",
                        Caracteristiques.BACKWOOD, Wood.ALDER,
                        Caracteristiques.TOPWOOD, Wood.ALDER,
                        Caracteristiques.TYPE, Type.ELECTRIC
                ))));
        inventory.addInstrument(new Instrument("122784", 5495.95,
                new InstrumentSpec(Arrays.asList(
                        Caracteristiques.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Caracteristiques.BUILDER, Builder.MARTIN,
                        Caracteristiques.MODEL, "D-18",
                        Caracteristiques.BACKWOOD, Wood.MAHOGANY,
                        Caracteristiques.TOPWOOD, Wood.ADIRONDACK
                ))));
        inventory.addInstrument(new Instrument("11277", 3999.95,
                new InstrumentSpec(Arrays.asList(
                        Caracteristiques.INSTRUMENT_TYPE, InstrumentType.GUITAR,
                        Caracteristiques.BUILDER, Builder.COLLINGS,
                        Caracteristiques.MODEL, "CJ",
                        Caracteristiques.BACKWOOD, Wood.INDIAN_ROSEWOOD,
                        Caracteristiques.TOPWOOD, Wood.SITKA,
                        Caracteristiques.TYPE, Type.ACOUSTIC,
                        Caracteristiques.NUMBER_OF_STRINGS, 6
                ))));
    }
}