import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		/* Set Interface  -----> HashSet , LinkedHashSet , TreeSet ( Set Interface'ini implement ediyorlar ) 
		
	
		Set Interface ile List Interface'i implemente eden classların farkı , 
		
		List Interface'i implement eden classlar bir elementten ( değeri yani ) birden fazla depolayabilirken ,
		Set Interface'i implement eden classlar bir elementten ( değeri )  sadece bir tane depolayabilir. 
		
		HashSet Sınıfı
		
		HashSet extends AbstractSet implements  Set Interface  extends Collection extends Iterable 
		
		AbstractSet HashSet sınıfımızın direkt olarak yapısını belirliyor ( elemanları depolama , tutma yapısı ) 
		
		1. HashSet elementleri "hashing" yani hash table mekanizmasına uygun bir biçimde depolanırlar.
		( Her element belli bir key'e göre depolanır. ) 
		
		Yani bellekte bir değeri belli bir hash fonksiyonuna göre depoluyor 
		Daha sonra erişmeye çalıştığımız zaman bu hash fonksiyonuna göre depolanan yere direkt olarak gidiyor ve erişiyor
		
		2. HashSet bir element'i sadece bir defa depolar. ( Set Interface ) 
		
		3. Elementlerin ekleme sırasına  göre depolamaz.
		
		
		LinkedHashSet Sınıfı
		
		1.LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davranır.
		
		2. HashSette olduğu gibi bir elementi sadece bir defa depolar. ( Set Intferace implement ) 
		
		3. Elementleri ekleme sırasına göre depolar
		
		TreeSet Sınıfı 
		
		TreeSet Sınıfı NavigableSet ınterface'ini implemente eder ve AbstractSet sınıfından miras alır.
		
		NavigableSet ınterface'i de SortedSet interface'inden miras alır.
		
		1. Elementleri depolamak için Tree yani Ağaç yapısını kullanır.
		Bir ağaç gibi dallanarak yeni veriler için yer açıyor ve onları orada tutuyor
		
		2. Elementleri doğal sıralama şeklinde sıralar yani küçükten büyüğe , alfabetik olarak A,B,C....
		
		3. Null değerleri kabul etmez
		
		
		HashSet vs LinkedHashSet vs TreeSet
		
		HashSet , Hash Table mekanizmasını uyguladığı için elementler sıralı değildir. 
		Ekleme , Çıkarma  ve Arama metodları sabit zamanda  ( Time Complexity : O(1) ) çalışır
		
		TreeSet  , elementleri tree yapısına yani ağaç yapısına uygun depolar. 
		Ekleme, Çıkarma ve Arama metodları O( log (n) ) complexity'si ile çalışır
		
		LinkedHashSet sınıfı hashtable ile linked list yapısını kullanarak elementleri depolar. 
		Bu yüzden , elementler ekleme sırasına göre depolanır. 
		Ekleme , Çıkarma  ve Arama metodları sabit zamanda  ( Time Complexity : O(1) ) çalışır.
		*/
	

		// 3 sınıftan da birer tane obje oluşturalım 
		// Bu objelerin referans değişkenlerinin tipini sınıflarını türetildiği Interface tipli yapalım
		
		Set<String> set1 = new HashSet<String>();
		
		Set<String> set2 = new LinkedHashSet<String>();
		
		Set<String> set3 = new TreeSet<String>();
		
    	//Hash Set Objesi
		set1.add("Java");
		set1.add("Python");
		set1.add("C++");
		set1.add("JavaScript");
		set1.add("Php");

		for (String string : set1) {
			System.out.println(string);
		}
		
		//LinkedHashSet Objesi
		System.out.println("\n**********************\n");
		set2.add("Java");
		set2.add("Python");
		set2.add("C++");
		set2.add("JavaScript");
		set2.add("Php");

		for (String string : set2) {
			System.out.println(string);
		}
		System.out.println("\n**********************\n");

     	//TreeSet Objesi
		set3.add("Java");
		set3.add("Python");
		set3.add("C++");
		set3.add("JavaScript");
		set3.add("Php");
		
		
		// set3.add("Java"); 
		// Bu elemanı ekleyemem çünkü , HashSet , LinkedHashSet , TreeSet'ler bir elementi sadece bir defa depolarlar.
		
		for (String string : set3) {
			System.out.println(string);
			}
		
		
		// Contain Metodu İçerisine Gönderdiğimiz Elementin O Setin İçerisinde Olup Olmadığını Kontrol Ediyor
		// Ve boolean değer dönüyor.
		
		// contains() metodu, bir koleksiyonun belirli bir elemanı içerip içermediğini kontrol etmek için kullanılır.
		// Bu metot, Collection interface'inde tanımlanmıştır ve List, Set, Map gibi koleksiyonlar üzerinde kullanılabilir.

		// Kullanımı
		// contains() metodu, belirtilen elemanın koleksiyon içinde bulunup bulunmadığını kontrol eder 
		// ve sonucu bir boolean (true veya false) olarak döner.
		
		System.out.println(set1.contains("java")); // false değer dönecek
		System.out.println(set2.contains("Php")); // true değer dönecek
		
		// isEmpty() metodu bizim koleksiyonumuzun içi  boş ise true değer dönüyor
		// Dolu ise false değer dönüyor
		    
		System.out.println(set2.isEmpty());
		
		// Kaldırma İşlemi
		
		set1.remove("Php");
		
		//  Set InterFace'ini implement eden class'larıımız aslında  bir küme görevi görüyor.
		
		// Biz şimdi burada Kesişim ve Fark Kümelerini bulalım.
		
		Set<String> hashset1 = new HashSet<String>();
		
		Set<String> hashset2 = new HashSet<String>();
		
		hashset1.add("Java");
		hashset1.add("Python");
		hashset1.add("C++");
		hashset1.add("JavaScript");
		hashset1.add("Php");
		
		hashset2.add("Go");
		hashset2.add("Java");
		hashset2.add("CSS");
		
		// Fark kümemize eşit olacak
		Set<String> fark_hashset = new HashSet<String>(hashset2);
		
		// Burada fark_hashset referansının göstermiş olduğu yeni türetilen objeye hashset2 objesinin içeriğini ,
		// Kopyalamış olduk bu iki obje birbirinden bağımsızdır bu en önemli nokta Referanslar farklı objeleri gösterir.
		
		
		System.out.println(fark_hashset.removeAll(hashset1));
		System.out.println(fark_hashset);
// Burada çıkan fark sonucu boş küme değilse true değer dönüyor bu metoddan , eğer boş küme olursa false değer dönüyor 
		
		
		// removeAll() metodu, bir koleksiyon içerisindeki belirtilen elemanları toplu halde kaldırmak için kullanılır.
		//Bu metot, iki koleksiyon arasında fark işlemi yapar ve bir koleksiyondan diğer koleksiyondaki tüm elemanları çıkarır.
		
		
		// İki kümenin kesişimini , ortak elemanlarını bulma 
		
	Set<String> kesisim = new HashSet<String>(hashset1); // hashset1 içindeki elemanları kesisim isimli objeye kopyaladık
		
	
	// retainAll() metodu, bir koleksiyonun yalnızca belirtilen diğer koleksiyonla ortak olan elemanlarını tutmasını sağlar.
	 // Yani, ilk koleksiyondan ikinci koleksiyondaki elemanlar haricindeki tüm elemanları kaldırır. 
	// Bu işlem sonucunda, iki koleksiyonun kesişimini elde etmiş olursunuz.
	
// Kısaca kesisim elde etmek için retainAll metodunu kullanıyorum. Ayrıca kesişen eleman varsa true , yoksa false dönüyor
	
		System.out.println(kesisim.retainAll(hashset2));
		System.out.println(kesisim);
		
		
		
		// AVANTAJLAR VE DEZAVANTAJLAR 
		
		// Biz bu koleksiyon yapılarına sürekli olarak sıralı değer eklersek (1,2,3....100) en hızlı çalışan treeSet oluyor
		// Sıralı değerlerde hashSet biraz daha yavaş kalıyor treeSet'e göre 
		
		// Ancak sıralı değer koymazsak , farklı  karışık değerler koyarsak bu sefer en hızlı hashSet oluyor
		
		// LinkedHashSet ise her zaman bunların arasında bir performans gösteriyor.
		
 	}

}
