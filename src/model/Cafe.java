package model;

/**
 * @Autor: Isaak Malik, Michal dinges
 * @Team: Team29
 * @Date: 25/10/2015
 * @Project: KroegenTocht
 * @Purpose: Cafébezoeken bijhouden om een idee te krijgen van alcoholverslaving
 */
public class Cafe {


	private Adres cafeAdres;
	private CafeSoort cafeSoort;
	private String cafeNaam;
	/**
	 * Constructor
	 * 
	 * @param cafeAdres
	 * @param cafeSoort
	 */
	public Cafe(String cafeNaam,Adres cafeAdres, CafeSoort cafeSoort)
	{
		this.cafeNaam = cafeNaam;
		this.cafeAdres = cafeAdres;
		this.cafeSoort = cafeSoort;
	}



	/**
	 * Standaard constructor
	 */
	public Cafe(){

	}

	/**
	 *
	 * @return
	 */
	public String getCafeNaam() {
		return cafeNaam;
	}

	/**
	 *
	 * @param cafeNaam
	 */
	public void setCafeNaam(String cafeNaam) {
		this.cafeNaam = cafeNaam;
	}

	/**
	 * 
	 * @return
	 */
	public Adres getCafeAdres()
	{
		return cafeAdres;
	}
	
	/**
	 * 
	 * @param cafeAdres
	 */
	public void setCafeAdres(Adres cafeAdres)
	{
		this.cafeAdres = cafeAdres;
	}
	
	/**
	 * 
	 * @return
	 */
	public CafeSoort getCafeSoort()
	{
		return cafeSoort;
	}
	
	/**
	 * 
	 * @param cafeSoort
	 */
	public void setCafeSoort(CafeSoort cafeSoort)
	{
		this.cafeSoort = cafeSoort;
	}
}
