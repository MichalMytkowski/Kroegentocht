package model;

import java.util.Date;

public class CafebezoekenStatistieken extends Cafebezoeken {

	/**
	 * 
	 * @return
	 */
	public static int totaalAantal()
	{
		return cafebezoeken.size();
	}
	
	public void toonLangsteBezoek()
	{
		Cafebezoek langsteCafeBezoek;
		Date laatsteBeginDatumVanLangsteBezoek;
		Date laatsteEindDatumVanLangsteBezoek;
		
		
		for (int n = 0; n < cafebezoeken.size(); n++)
		{
			
		}
	}
}
