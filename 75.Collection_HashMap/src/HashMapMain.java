import java.util.HashMap;
import java.util.Map;


public class HashMapMain {
		public static void main(String[] args) {
			
			
			/*
			 
			  HashMap Sınıfı 
			  
		1.Değerleri Key (Anahtar) ve Value (Değer) olarak depolar. Her key'e karşılık gelen bir tane değer bulunur
			  
		2.Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla kez olabilir.
		
		3.Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. ( HashSet gibi sırasız şekilde depoluyor kısaca )
		
		Map Interface'ni implement eder ve verileri bir hash tablosu ( hash table ) kullanarak saklar.
		
		Set , List , Queue ınterface'leri Collection Interface'ini direkt extends ederken 
		
		Map Interface'i Collection Interface'ini extends etmez.
		
		Her anahtar benzersiz olmalıdır  , ancak birden fazla anahtar aynı değere sahip olabilir .
		Elemanlar belirli bir sırayla tutulmaz
		Bir adet nul anahtarına  ve birden fazla null değerine izin verir
		
		Eleman ekleme işlemini put metodu ile yapıyoruz ilk eklenen key , sonra eklenen value oluyor 
		
		Örnek ; hashMap.put("Ali",1); Burada Ali değeri key , value ise 1 oluyor
		
		
		// İlk önce key , sonra value 
		
			 */
			
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		// Eleman Ekleme 
		
		hashMap.put(5, "Rust");
		hashMap.put(20, "Go");
		hashMap.put(40,"Java");
		hashMap.put(7, "Go"); // Anahtar farklı olacak , değerler aynı olabilir , ve sırasız şekilde sıralanıyorlar.
		
		hashMap.put(5, "React"); // Burada 5 key'ine sahip değeri silecek yeriner React value'sunu getirecek.
		System.out.println(hashMap);
		
		// Eleman bulma - döndürme 
		// Bunun için get komutunu kullanıp içerisine key değeri giriyorum.
		
		System.out.println(hashMap.get(5));
		
		
		// HashMap elemanları direkt olarak ekrana bastırmak için entrySet metodunu kullanıyoruz 
		// Biz bu sayede hashMap'İmizi Set'e çevirebiliyoruz.
		
		for(Map.Entry<Integer,String> entry: hashMap.entrySet() ) {
			
			System.out.println("Anahtar : " + entry.getKey() + " Değer : " + entry.getValue());
		}
			
			/*
		entrySet() ve Map.Entry Kullanımı
		entrySet() Metodu:

HashMap'deki tüm anahtar-değer çiftlerini (entries) bir Set olarak döner. Bu Set, Map.Entry<K, V> tipinde öğeler içerir.
Yani, entrySet() metodu, HashMap'in içindeki tüm anahtar-değer çiftlerini (Map.Entry objeleri) 
bir Set içerisine koyar ve bu Set'i döner.

Map.Entry<K, V> Interface'i:

Map.Entry<K, V>, Map'in içinde bulunan her bir anahtar-değer çiftini temsil eder.
Bu interface, bir anahtar (key) ve bu anahtara karşılık gelen bir değer (value) içerir.
		
			*/
			
		
		
			
		}
}	
