

public class Kus extends Hayvan { //ust sinifin butun abstract metodlarini implement etmek zorundasin yoksa hata alirsin

	public Kus(String ad, int kilo, int boy) {
		super(ad, kilo, boy);
		// TODO Auto-generated constructor stub
	}

	@Override
		public void sesCikar() {	
			System.out.println(getAd()+" cik cik cik dedi ");
		}

}
