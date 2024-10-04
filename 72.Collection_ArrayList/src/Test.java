import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		// ArrayList sınıfı List Interface'ini İmplement ediyor 
		// List Interface'i Collection Interface'ini implement ediyor
		// Collection Interface'ide Iterator Interface'ini implement ediyor.
		// ArrayList ve LinkedList'de kullandığımız çoğu metodun birbirine benzemesinin nedenide bu tam olarak aslında 
		// İkiside bu yolu izleyen Interface'leri implement ediyor 
		// En yukarıdaki Interface'de daha genel metodlar variken
		// İmplement edildikçe override edilen metotların yanına yeni metotlarda eklenerek özelleşiyor.
		
		// ArrayList dinamik olarak uzayan kısayan bir listedir.
		// Biz veri ekledikçe liste dinamik olarak uzar , biz veri çıkardıkça liste otomatik olarak kısalır.
		// Yani normal arrayler gibi belirli bir eleman sayısı yok , belirtilmez.
		
			
			ArrayList<String> arrayList = new ArrayList<String>();
			
			// ArrayList'e değer eklemek için add 
			
			arrayList.add("Java");
			arrayList.add("SQL");
			arrayList.add("Pyhton");
			
			// ArrayList Elemena Erişim
			// Belirli bir indexdeki değeri döndürmek için get
			
			System.out.println(arrayList.get(2) + " " + arrayList.get(0));
			
			// System.out.println(arrayList.get(4)); // Hata verir 4. indexde eleman yok
			
			// ArrayList Elemanlarının Hepsini Ekrana Bastırma 
			
			for(int i = 0 ; i<arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
			}
			
			System.out.println("\n**************************\n");
			
			// foreach ilede bastırabiliriz daha pratik bir şekilde 
			
			for(String a : arrayList) {
				System.out.println(a);
			}
			
			System.out.println("\n**************************\n");
			
			// Silme İşlemi ( remove metodu ) 
			
			arrayList.remove(1); // SQL değeri silinecek listeden
							     // İndex değeri yerine direkt olarak elemanın değerinide verebiliriz
			
			for(String a : arrayList) {
				System.out.println(a);
			}
			
			
			
			
			
			// Bir interface'den direkt olarak obje oluşturamayız ama 
			// O interface'i implement eden sınıflardan nesne oluştururken 
			// İmplement edilen interface'i o objenin referans değişkeninin tipi olarak kullanabilirdik
			
	
			
			// Örnek 
			
			List<String> arrayList2 = new ArrayList<String>();
			arrayList2.add("Barış Manço");
			arrayList2.add("Sezen Aksu");
			
			arrayList2.set(1, "Cem Karaca");     
			
			for (String s : arrayList2) {
				System.out.println(s);
			}
			
			// İmplement edilen interface'in kendisinin implement ettiği ınterface'leride kullanabiliriz
			// Mesela Collection ınterface'i Lıst interface'i burayı implement ediyor.
			
			Collection<Integer> arrayList3 = new ArrayList<Integer>();
			
			arrayList3.add(3);
			
			
			
			
			
		}
}
