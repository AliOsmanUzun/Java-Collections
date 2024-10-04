import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BuyuktenKucugeString implements Comparator<String>{ // Generice kıyaslayacağım veri tipini giriyorum {

	@Override
	public int compare(String o1, String o2) {
	// Eğer compare metodumuz büyükten küçüğe doğru sıralama yapacaksa 
	// İlk değer , ikinci değerden büyüksek -1 döndürmesi gerekiyor.
	// İlk değer , ikinci değerden küçükse 1 döndürmesi gerekiyor
	// Eşitlerse zaten 0 döndürüyor direkt 
		
	// Eğer küçükten büyüğe doğru sıralama yapacaksa 
	// İlk değer , ikinci değerden küçükse -1 
	// İlk değer , ikinci değerden büyükse 1 döndürmesi gerekiyor 
	// Eşitler 0 döndürücek
		
	
		
		
		
		return -o1.compareTo(o2); 
	// Bu şekilde dönecek değerlerin negatif değerini alıyorum ve küçükten büyüğe değilde 
	// Büyükten küçüğe doğru sıralama yapılmasını sağlıyorum , negatif değeri sıfırı etkilemiyor .
	}

}


 // Kendi yazdığımız sınıflar için Comparator implement eden ve küçükten büyüğe veya büyükten küçüğe sıralama yapacak
 // Sınıflar oluşturalım

 	class KucuktenBuyugePlayer implements Comparator<Player> {

		@Override
		public int compare(Player o1, Player o2) {

			return o1.compareTo(o2)  ;
		}
	 
 		
 		
 		
 	}
 
 	class BuyuktenKucugePlayer implements Comparator<Player> {

		@Override
		public int compare(Player o1, Player o2) {
			
			return	-o1.compareTo(o2) ;
		}
	 
 		
 	}
 	
 	// String değerlerine göre sıralayalım objelerimizi 
 	
 	class KucuktenBuyugeStrıngPlayer  implements Comparator<Player>{

		@Override
		public int compare(Player o1, Player o2) {
				return o1.getIsim().compareTo(o2.getIsim()) ;
			}
		}
 		
class Player implements Comparable<Player> {
	 
	 private String isim ; 
	 
	 private int id ;

	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}
	

	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		
		return "İd : " + id + " İsim : " + isim;
	}

	@Override
	public int compareTo(Player player) {
		if (this.id > player.id) {
			return 1 ;
		}
		else if (this.id<player.id ) {
			return -1;
		}
		else {
			return 0;
		}
	} 
	
	
	
	 
	 
	 
}

 
	
public class Test {
		
	

		public static void main(String[] args) {
			
			// Comparator Interface ve sort metod'unun kullanımı
			
			List<String> list = new ArrayList<String>();
			
			list.add("Java");
			list.add("C++");
			list.add("Python");
			list.add("Php");
			list.add("Go");
			
			Collections.sort(list); // Küçükten büyüğe sıralıyacak arraylist'imdeki elemanları
			
			
			
			// sort metodunun bir kullanım şekli daha var
			
//			Collections.sort(list, new BuyuktenKucugeString());
	// Bu sort metodunda parametre olarak bir List ınterface referansı
	// ve Comparator ınterface'ini implement eden bir class yani objesini istiyor.
	// Bu sort metodu benim istediğim şekilde liste'de sıralama işlemi yapmamı sağlıyor.
	//  ( Küçükten ,büyüğe  / büyükten küçüğe / yada başka şekillerde ) 
		
//			for (String g : list) {
//				System.out.println(g);
//			}
			
			
			List<Player> player_list = new ArrayList<Player>();
			
			player_list.add(new Player("Ahmet", 1));
			player_list.add(new Player("Hamza", 43));
			player_list.add(new Player("Bekir", 14));
			player_list.add(new Player("Tolgay", 58));
			
//			// Büyükten Küçüğe Doğru Sıralama Id'ye göre 
//			Collections.sort(player_list , new BuyuktenKucugePlayer());
//			for (Player p : player_list) {
//				System.out.println(p);
//			}
//			
//			// Küçükten Büyüğe Doğru Sıralama Id 'ye göre 
//			Collections.sort(player_list, new KucuktenBuyugePlayer());
//			
//			for (Player p : player_list) {
//				System.out.println(p);
//			}
//		
		// Comparator yapısını Integer , String sınıp tipli list'ler içinde kullanabilirim
		// Çünkü bu sınıflara müdahale edemiyeceğim için sort metodunu kullandığım zaman
		// İçerisinde tanımlanmış compareTo metoduna göre sadece küçükten büyüğe doğru sıralanacaklar
		// Ama ben Comparator interface'i implement eden bir sınıf oluşturup burada compare metodu ile 
		// Büyükten küçüğe doğru  yada istediğim bir şekilde sıralama yapabilirim
		
		
			// İsim değerlerine göre Küçük'ten Büyüğe doğru sıralama 
			
			Collections.sort(player_list,new KucuktenBuyugeStrıngPlayer());
			
			for (Player player : player_list) {
				System.out.println(player);
			}
			System.out.println("\n******************\n");
			// İsim değerlerine göre Büyükten Küçüğe doğru sıralama 
			
		// Buyukten Kucuge Dogru String sıralamayıda Anonım ınner class ile yapabilir 
		// Çünkü sort metoduna direkt Comparator Interface'ini implement eden bir nesne göndermemiz yeterli oluyor
			Comparator<Player> BuyuktenKucugeStringPlayer = new Comparator<Player>() {

				@Override
				public int compare(Player o1, Player o2) {
					return -o1.getIsim().compareTo(o2.getIsim()) ;
				}
		 		
			};
			
			
			Collections.sort(player_list , BuyuktenKucugeStringPlayer);
			
			for (Player player : player_list) {
				System.out.println(player);
			}
		
			
			/* COMPARATOR VS COMPARABLE
			 
			 Hangisi daha avantajlı ? 
			 
			 Comparator çünkü comparator ile birden fazla sıralama şeklini ayrı ayrı class'larda tanımlayıp , 
			 Sıralama yapacağımız list için kullanabiliriz
			 
			 Comparable ise sadece bir kez implement edip metodunu tek sefer kullanabiliyoruz
			
			
			
			
			*/
		}
		
		
		
		
		
}
