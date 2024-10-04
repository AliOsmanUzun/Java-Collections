import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String> { // Bastırmak istediğimiz veri tipini kullanıyoruz generic'te

	private ArrayList<String> kanallar_listesi = new ArrayList<String>();

	 public Radyo(String[] kanallar) {
		 
		 for (String s : kanallar) {
			kanallar_listesi.add(s);
		}
	 }

	@Override
	public Iterator<String> iterator() {
		return new Radyo_Iterator();
		
		// return kanallar_listesi.iterator();
		
		// Kanallar listesi isimli array listim içerisinde oluşturduğum iterator referansını döndürdüm
		// Böylece foreach yapısını kullandığımda bu array list içerisinde dönmüş olacağım
	}
	
	// Bu yöntem yerine iç içe bir sınıf yazıpta iterator'ü kullanabiliriz.
	// Eğer bir arraylist'i döneceksek ıterator interface'ini implement etmemiz gerekiyor.  
	
	public class Radyo_Iterator implements Iterator<String>{
										// Ekrana bastırmak istediğim değerlerin veri yapısını generic'te belirtiyorum
		
		
	// ilk elemandan yani 0. indexden başlaması için index'i tanımlamamız lazım öncesinde
		
	private int index = 0 ; // Iteratorumun nereden başlıyağını söylüyorum index tanımlayarak aslında 
		@Override
		public boolean hasNext() {
			if(index<kanallar_listesi.size()) { // index değeri array listemin boyutundan büyük olmadığı sürece
				return true;
			}
			else {
				return false ;
			}
		}

		@Override
		public String next() {
			String deger = kanallar_listesi.get(index);
			index++;
			return deger;
		}

		// Radyo_Iterator sınıfımız Iterator İnterface'ini implement ettiği için 
		// Buradan oluşturacağımız bir obje aynı zamanda Iterator referansı'da dönebilmiş oluyor.
									
		
		
	}

	 
	 
	
	
	
	
	
}
