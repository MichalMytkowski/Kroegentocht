package model;

import java.util.ArrayList;

/**
 * @Autor: Isaak Malik, Michal dinges
 * @Team: Team29
 * @Date: 25/10/2015
 * @Project: KroegenTocht
 * @Purpose: Cafébezoeken bijhouden om een idee te krijgen van alcoholverslaving
 */
public class Cafebezoeken {

	protected static ArrayList<Cafebezoek> cafebezoeken;
	
	/**
	 * 
	 * @param cafebezoek
	 */
	public static void toevoegen(Cafebezoek cafebezoek)
	{
		cafebezoeken.add(cafebezoek);
	}
}
