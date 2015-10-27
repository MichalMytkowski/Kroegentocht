package model;

public class KroegenTocht {

	public static void main(String[] args)
	{
		Adres adres1 = new Adres();
		adres1.setStreet("lolstraat");
		adres1.setNumber("4");
		adres1.setCity("Leuven");
		
		Adres adres2 = new Adres();
		adres1.setStreet("brolstraat");
		adres1.setNumber("1");
		adres1.setCity("Leuven");
		
		Adres adres3 = new Adres();
		adres1.setStreet("lrolstraat");
		adres1.setNumber("94");
		adres1.setCity("Leuven");
		
		Adres adres4 = new Adres();
		adres1.setStreet("krolstraat");
		adres1.setNumber("40");
		adres1.setCity("Leuven");
		
		Adres adres5 = new Adres();
		adres1.setStreet("trolstraat");
		adres1.setNumber("100");
		adres1.setCity("Leuven");
		
		Cafe cafe1 = new Cafe(adres1, CafeSoort.BRASSERIE);
		Cafe cafe2 = new Cafe(adres2, CafeSoort.BRUINE_KROEG);
		Cafe cafe3 = new Cafe(adres3, CafeSoort.STUDENTENCAFE);
		Cafe cafe4 = new Cafe(adres4, CafeSoort.CLUB);
		Cafe cafe5 = new Cafe(adres5, CafeSoort.CLUB);
		
		Cafebezoek cafebezoek1 = new Cafebezoek(cafe1);
	}
	
	public void toonAantalMinutenBezoekInPeriode()
	{
		
	}
	
	public int toonTotaalBezoeken()
	{
		return CafebezoekenStatistieken.totaalAantal();
	}
	
	public void toonGemiddeldeConsumpties()
	{
		
	}
	
	public void toonLangsteBezoek()
	{
		
	}
}
