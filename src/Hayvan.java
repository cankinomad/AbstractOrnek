

public abstract class Hayvan { //abstract yaparsan hayvan nesnesinden bir sey olusturamazsin, ama onun alt sinifindan yapabilirsin.
//abstract class icinde abstract olan ve olmayan metodlar ayni anda barinabilir.	

	private String ad;
	private int kilo;
	private int boy;
	
	//abstract metod govdesi olmaz.
	//abstract metodlar sadece abstract sinifta olabilir. kafana gore abstract yapamazsin.
	public abstract void sesCikar(); 	//sadece override yapsinlar diye abstract olarak birakiyorsun. Interface yazmis olduk. 
	//suslu parantezleri olmaz. noktali virgul ile bitmesi gerekiyor abstract metodun.
	
	
	
	public Hayvan(String ad, int kilo, int boy) {
		super();
		this.ad = ad;
		this.kilo = kilo;
		this.boy = boy;
	}


	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}
	
	
}
