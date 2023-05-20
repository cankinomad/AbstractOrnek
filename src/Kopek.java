

public class Kopek extends Hayvan{

	public Kopek(String ad, int kilo, int boy) {
		super(ad, kilo, boy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+" HavHav dedi");
	}

}
