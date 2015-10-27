package model;

import java.util.Date;

/**
 * @Autor: Isaak Malik, Michal dinges
 * @Team: Team29
 * @Date: 25/10/2015
 * @Project: KroegenTocht
 * @Purpose: Cafébezoeken bijhouden om een idee te krijgen van alcoholverslaving
 */
public class Cafebezoek extends Cafe {

	private DatumTijd datumBezoek;
	private int consumptieTeller, totaalAantalConsumpties;
	Boolean opCafe = false;

	/**
	 * Constructor
	 */
	public Cafebezoek() {
		opCafe = true;
		datumBezoek = new DatumTijd();

		// Cafebezoeken.toevoegen(this);
		/*
		Ik denk dat dit pas na de meting van de tijd en de hoeveelheid drank moet toegevoegd worden. Nu zal "this" nog
		niet veel bevatten.
		 */
	}


	/**
	 * hier moet noh een overloaded constructor komen om de aangeduide cafe te initialiseren en
	 * de waarde van cafe bezoek aan toe te voegen.
	 * Super() constructor met naam, adres, tijd, totalDrinks
	 *
	 */


	/**
	 * @return
	 */
	public int getAantalConsumpties() {
		return consumptieTeller;
	}

	/**
	 * @param consumptieTeller
	 */
	public void setConsumptieTeller(int consumptieTeller) {
		this.consumptieTeller = consumptieTeller;
	}

	/**
	 * @param totaalAantalConsumpties
	 */
	public void setTotaalAantalConsumpties(int totaalAantalConsumpties) {
		this.totaalAantalConsumpties = totaalAantalConsumpties;
	}

	/**
	 * Verhogen van consumptie
	 */
	public void verhoogAantalConsumpties() {
		if (opCafe != false) {
			consumptieTeller++;
		} else {
			System.out.println("No place to drink");
		}

	}

	/**
	 * Stoppen van Cafe bezoek
	 *
	 *
	 */
	public void StopBezoek() {
		datumBezoek.stopTimer();
		getAantalConsumpties();
		setConsumptieTeller(0);
		setTotaalAantalConsumpties(0);
	}


	/**
	 * Dit geeft de totale tijd terug
	 *
	 *
	 * @return
	 */
	public double getTotaleBezoekTijd(DatumTijd datumTijd) {
		return datumBezoek.getTotalTime();
	}

}