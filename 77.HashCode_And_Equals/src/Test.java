import java.util.HashSet;
import java.util.Set;

public class Test  {
	
	
		public static void main(String[] args) {
			
		
		
		
	
		// Set'ler List'lerden farklı olarak bir elemanı bir defa depoluyordu.
		
		/* Peki bunu nasıl yapıyor ? 
		
		Burada değer bir tane hash fonksiyonuna gidiyor ve bu hashfonksiyonu bize bir tane hashcode üretiyor
		
		Üretilen bu hashcode belli bir hash bucket'ine bu değeri yerleştiriyor
		
		Java  equals metodunu kullanarak bu iki değerin aynı olup olmadığını aynı hash bucketta sorguluyor
		
		Aynı hash bucketta eğer farklı değerler varsa bunları depoluyor , 
		Ancak hash bucketta aynı değerler varsa bunları bir daha depolamıyor
		
		HashCode'lar her obje ve değer için benzersiz değil , Farklı değerlerde aynı HashCode'a sahip olabilir.
		
		*/
		
		Set<Player> hashSet = new  HashSet<Player>();	
			
		Player player1 = new Player("Kağan", 54);
		 
		Player player2 = new Player("Hamza", 76);
		
		Player player3 = new Player("Veli", 43);
		
		Player player4 = new Player("Kağan", 54);
		
				
		hashSet.add(player1);
		hashSet.add(player2);
		hashSet.add(player3);
		hashSet.add(player4);
		
		for(Player s : hashSet) {
			System.out.println(s);
		}
		// player 1 ve player 4 birbirinden farklı objelerde olsa değerleri aynı
		// Ve hashset bu 2 aynı değeri depolamış oldu
		
		/* Bu 2 aynı değerin depolanma nedeni ne peki ? 
		
	HashSet'le normal de aynı değerleri depolayamıyorduk ama burada oluşturduğumuz class'ın objeleri aynı değerler sahip
		
	Çünkü bu bizim yazmış olduğumuz class'da eğer biz equals ve hashcode metotlarını yazmazsak eğer
	
	Java bu 2 objenin direkt olarak aynı olup olmadığını anlayamayacak
		
	Normal Integer ,String sınıflarını generic olarak kullanıp ardından set koleksiyonundan bir nesne 
	oluşturup değerler atadığım zaman sorunsuz çalışmasının nedeni generic'te tip olarak kullandığım bu sınıfların
	içerisinde hashcode ve equals metotları tanımlanmış
	
	Yani biz class'tan ürettiğimiz objelerin benzersiz olmasını , aynı key olunca set'e eklenmemesini istiyorsak
	Equals ve hashcode metotlarını beraber override etmemiz gerekiyor mutlaka
	
	Değerleri birbirinden farklı olan objeler'inde hashcode'u aynı olup aynı bucket içerisinde olabilirler
	Bu durumdan sonra bu objelerin farklı olup olmadığını anlamak için equals kullanıyoruz. İçeriklerini kıyaslıyoruz
		
		
		
	Eğer kendi objelerimi Hash table yapısını uygulayan Map koleksiyonlarında veya Hash table yapısını uygulayan 
	Set koleksiyonlarında kullanmak istiyoram oluşturduğum Class içerisinde hashcode ve equals metotlarını muhakkak kullanmam gerekiyor düzgünce çalışması için
		*/
		}
		
		
		
}
