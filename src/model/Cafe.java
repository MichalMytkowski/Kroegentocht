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
	
	/**
	 * Constructor
	 * 
	 * @param cafeAdres
	 * @param cafeSoort
	 */
	public Cafe(Adres cafeAdres, CafeSoort cafeSoort)
	{
		this.cafeAdres = cafeAdres;
		this.cafeSoort = cafeSoort;
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
