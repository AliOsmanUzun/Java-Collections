
public class Student implements Comparable<Student>{
	
	private String isim ; 
	private int id;
	
	
	public Student(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}


	@Override
	public String toString() { // Nesneyi ekrana bastırdığımızda ram bellek adresi yerine return ettiğimiz değerler dönecek
		// TODO Auto-generated method stub
		return "İd : " + id + " İsim : " + isim;
	}


	@Override
	public int compareTo(Student student) {
		// Tek bir özelliğe göre bir karşılaştırma yapabiliyorum o bana kalmış.
		// Collections . sort metodunu kullandığım zaman buradaki komutlara göre sıralama yapacak
		
		// Eğer küçükten büyüğe doğru sıralama yapmak istiyorsam id üzerinden
		// Objemizin id'si parametre olarak girilen objenin id'sinden küçükse -1 döndürmem gerekiyor
		// Eşitse  0 , büyükse 1 döndürmem gerekiyor
		
		// Büyükten küçüğe ise tam tersi parametre büyükse 1 , eşitse 0 , objemin değeri büyükse -1 döndürmem gerekiyor
		
		if (this.id < student.id)  { // this ile bu class'tan türettiğim nesnenin değeri olduğunu belirtiyorum
			return 1 ; // negatif değer döndürmem yetiyor
		}
		else if (this.id==student.id) {
			return 0 ;
		}
		else {
			return -1 ;
		}
	}
	
	

	
	
	
	
	
	
}
