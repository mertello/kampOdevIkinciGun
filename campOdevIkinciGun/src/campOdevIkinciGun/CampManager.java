package campOdevIkinciGun;

public class CampManager {
	
	public void addToCamp(Camp camp) {
		System.out.println("Tebrikler! " + camp.campName + "'na katıldınız.");
	}
	public void removeToCamp(Camp camp) {
		System.out.println("İşlem başarılı. " + camp.campName + "'ndan çıkarıldınız.");
		System.out.println("Böyle fırsat bir daha gelmez, iyi düşün...");
	}

}
