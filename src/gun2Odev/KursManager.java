package gun2Odev;

public class KursManager {
	
	public void add(Kurs kurs) {
		System.out.println("Kurs tanımlandı: " + kurs.getname());
      }
	
	public void update(Kurs kurs) {
		System.out.println("Kurs bilgileri güncellendi: " + kurs.getname());
	}
}
