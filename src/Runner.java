
public class Runner {
	
	public static void main(String[] args) {
		//Hayvan h=new Hayvan(null, 0, 0); olusturamazsin cunku abstrct yaptik.
		
		Kopek k=new Kopek("karabas", 5, 50);
		System.out.println(k.getAd());
		k.sesCikar();
		
		Hayvan h1=new Kopek("karabas", 5, 4); //new ile alt sinif olusturabilirsin ama hayvan nesnesi olusturamazsin abstract yuzunden.
	}
}
