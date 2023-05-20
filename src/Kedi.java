

public class Kedi extends Hayvan {

	public Kedi(String ad, int kilo, int boy) {
		super(ad, kilo, boy);
		
		
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+" Meow dedi");
	}
	
	
}
