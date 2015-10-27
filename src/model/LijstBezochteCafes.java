package model;

import java.util.ArrayList;

/**
 * Created by Administrator on 27-10-2015.
 */
public class LijstBezochteCafes {

    private ArrayList<Cafe> cafes = new ArrayList<Cafe>();

    /*
    public void setCafes ( ArrayList cafes){
        this.cafes = cafes;
    }
    */

    /**
     * Toevoegen cafe aan Arraylist van objecten Cafe
     * @param cafe
     */
    public void addCafe  (Cafe cafe){
        if (cafe != null){

            cafes.add(cafe);
            System.out.println("Cafe "+ cafe.getCafeNaam() +" is toegevoegd");
        }
        else {
            System.out.println("Er is een probleem bij het toevoegen");
        }
    }

    /**
     * Get cafe namen
     */
    public void getCafes()
    {
        String cafeNaam = "Ongeldig";
        for(Cafe c : cafes){
            cafeNaam = c.getCafeNaam();
            System.out.println(cafeNaam);
        }
    }

}
