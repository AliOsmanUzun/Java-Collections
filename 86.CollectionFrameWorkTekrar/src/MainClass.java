
public class MainClass {
	
		public static void main(String[] args) {
			
	/*
	
	 List  Interface'i  implement'e eden class'lar
	
	 Elementleri liste halinde depolar
	 Bir element birden fazla bulunabilir
	 Elementler index ile tutulur
	 Elementler eklenme sırasını korur
	 Bir elemanı aramak çok yavaştır
	 Bir eleman'a indeks değeri ile ulaşmak hızlıdır.
	 Listeler Collections.sort metoduyla sıralanabilir.
	
	
   	 Thread İşlemlerinde Kullanılabilecek Veri Yapısı
	
	 Vectorler ---> Çünkü bazı metodları "synchronized" anahtar kelimesiyle yazılmıştır.
	 
	 
	 Elemanı Sadece Sona Ekleyeceğimiz Durumlarda 
	 
	 ArrayList ---> Çünkü sadece sona eklemek ArrayList'lerde daha hızlıdır.
	 
	 
	 Elemanı Ortalara Ekleyeceğimiz Durumlar Varsa
	 
	 LinkedList --> Çünkü sadece o bölgenin referansları üzerinde işlem yapılır.
	 
	 ------------------------------------------------
	 
	 Set Interface'ini implement eden classlar
	
	 Bir elemanı sadece bir defa depolar
	 Bir elemanın sadece bir defa depolanmasını istiyorsak Listler(ArrayList,LinkedList vs.) yerine kullanılabilir
	 Elemanlar listeler gibi indekslenmezler
	 Bir elemanı setlerde olup olmadığını sorgulama listlere göre oldukça hızlıdır.
	 
	 Elemanların Sırası Önemli Değilse ve Sorgulama İşlemlerinin Hızlı Olması İsteniyorsa 
	 
	 HashSet ---> Elemanları ekleme sırasına göre depolamaz ve bir elemanın olup olmadığını sorgulama hash fonksiyonuyla
	 hash fonksiyonuyla yapıldığı için her zaman hızlı ve sabit zamanda çalışır.
	 
	 Elemanların Eklenme Sırası Önemliyse ve Sorgulama İşlemlerinin Hızlı Olması İsteniyorsa 
	 
	 LinkedHashSet ---> LinkedList ve HashSet implementasyonu gibi çalıştığı için değerleri ekleme sırasına göre depolar.
	 Ayrıca elemanları sorgulama çok hızlıdır ve sabit zamanda çalışır.
	 
	 Elemanların Sıralanması Önemliyse
	 
	 TreeSet --> Verileri ağaç yapısında depoladığı için veriler her zaman sıralıdır.
	 Ancak bir elemanın var olup olmadığını sorgulama zamanı içindeki eleman sayısıyla doğru orantılıdır.(O(logn))
	 
	 Eğer kendi objelerimizi setlerde  kullanmak istiyorsak hashCode() ve equals() metotlarını override etmeliyiz.
	 
	 
	 ------------------------------------------------
	 
	 Map Interface'ini Implement Eden Class'lar
	 
	 Veriler Anahtar Değer ilişkisiyle depolanır
	 Bir key'e karşılık gelen yalnızca bir değer bulunur 
	 Bir key birden fazla bulanamaz
	 Bir değere bir key üzerinden erişmek çok hızlıdır.
	 Değerlerin üzerinde  tek tek gezinmek çok yavaştır.
	 Eğer kendi objelerimizi maplerde kullanmak istiyorsak hashCode() ve equals() metodlarını override etmeliyiz
	 
	 HashMap
	 
	 Anahtarlar ve Değerler sıralı değildir
	 
	 LinkedHashMap
	 
	 Anahtarlar ve Değerler eklenme sırasına göre depolanır
	 
	 
	 TreeMap
	 
	 Anahtarlar ve Değerler "Anahtarlara Göre" Sıralı depolanır
	 
	 ------------------------------------------------
	 
	 Queue Interface'ini Impelement'e eden  Classlar
	 
	 LinkedList
	 
	 Eğer Queue Interface'inden bir referans ile LinkedList oluşturulursa
	 bu linkedlist aynı zamanda bir Queue gibi davranır
	 
	 First In Firs Out  ( İlk Gelen İlk Çıkar mantığıyla çalışır ) 
	 
	 PriorityQueue
	 
	 Queue Interaface'ini implemente etmesine rağmen First In First Out mantığıyla çalışmaz , 
	 Değerler doğal sıralanma şekline göre sıralanır yani küçükten büyüğe doğru ve en öncelikli değer 
	 kuyruğun başına geçer
	 
	 ------------------------------------------------
	 
	 Vector Class'ından Extend Eden Stackler 
	 
	 LIFO ( Last In First Out mantığıyla çalışır) Bilgisayarlarda Recursif Fonksiyonlar çalıştırılırken kullanılır.
	 
	  ------------------------------------------------
	  
	  Kendi Objelerimizle Oluşturduğumuz bir Veri Yapısını Sıralamak
	  
	  Collections.sort() metoduyla kendi Objelerimizle oluşturduğumuz bir veri yapısını sıralamak için
	  ya Comparable Interface'ini ya da Comparator Interface'ini implement etmek zorundayız.
	  
	  ------------------------------------------------
	  
	  Iteratorlar ve Iterable 
	  
	  Bir veri yapısından iterator oluşturacak veri yapısının elemanları üzerinden kolayca gezinebiliriz
	  
	  Aslında For Each Döngüsü kendi içinde iterator kullanır.
	  
	  O yüzden bizim de bir classımızdan oluşturduğumuz objelerin üzerinde gezinebilmemiz için Iterable Sınıfını
	  implemente etmemiz ve Classımıza ait bir tane iterator class yazmamız gerekmektedir.
	 
	 
	 
	 
	
	
			
			
			
			
			
			
			
			
	*/	
			
		}

}
