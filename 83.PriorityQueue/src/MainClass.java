import java.util.PriorityQueue;
import java.util.Queue;



class Player implements Comparable<Player> {

	private String isim ;
	
	private int id ;
	
	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}
	
	@Override
	public String toString() { // Bu class'dan oluşturduğum bir objeyi ekrana bastığım zaman 
							   // burada return edilen değer dönücek
		return "İD : " + id + " İsim : " + isim;
	}




	@Override
	public int compareTo(Player player) {
		if (this.id>player.id) {
			return -1 ;
		}
		else if (this.id<player.id) {
			return 1 ;
		}
		else {
			return 0 ;
		}
	}
	
	
}

public class MainClass {
		public static void main(String[] args) {
			
	/*		
	Queue Interface ve Priority Queue Sınıfı 
	
	Priority Queue normal Queue mantığı gibi davranmaz. Elemanlar öncelik sıralarına göre yüksek öncelik kazanıp
	
	(
	Integerlarda en yüksek öncelik en küçük sayıda , en düşük öncelik en büyük sayıdadır.
	Stringlerde  en yüksek öncelik alfabetik olarak sözlükte  en önce gelen stringte ,
	en düşük öncelik alfabetik olarak sözlükte en son gelen stringtedir.
	
	)
	
	kuyrukta önlere geçer  ( Tıpkı  Hastanedeki Acil Servisler Gibi ) 
	
	add veya offer metodları --> Kuyruğa eleman ekler ( LinkedListteki kullanımları ile aynı özelliği taşırlar )
	
	clear() metodu --> Kuyruğu temizler 
	
	contains ( Object o ) --> O objesi kuyruğun içindeyse true  , değilse false değer döner
	
	peek () --> Kuyruğun başındaki elemanı döner , Eğer kuyruk boşsa null değer döner 
	
	poll() --> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner . Eğer kuyruk boşşa null referans döner 
	
	size() --> Kuyruğun içindeki eleman sayısını döner .
	
	Priority Queue sınıfı eklediğim elemanları doğal sıralama yapısına  göre sıralar ( küçükten büyüğe doğru ) 
	Veya benim belirlediğim sıralama kriterine göre sıralama yapar ve öncelik sırasını ona göre oluşturur.
	
	Kısaca LinkedList yapısındaki gibi eklenme sırasına göre First In First Out yapısı yok
	
	Eklediğimiz elemanları öncelik sırasına göre yani küçükten büyüğe göre sıralıyor 
	Ve en küçük yani en öncelikli elemanı listenin başına koyuyor .
	
	İşlem yapacağımız zaman yine baştaki eleman ile yapacağız tek farkı sıralanma şekli
	
	*/
			
	Queue<Integer> queue = new PriorityQueue<Integer>();
	
	queue.offer(23); 
	queue.offer(14);
	queue.offer(7);
	queue.offer(4);
	queue.offer(1);
	queue.add(58);
	
	// Parametre olarak gönderilen değerin queue içinde olup olmadığını contains metodu ile kontrol etmek
	
	System.out.println(queue.contains(58));
	
	// priority queue yapısı ile eğer foreach yapısını kullanırsak yanlış değerler elde etmiş oluruz
	// bu veri yapısı foreache'e göre uygun bir yapı değil
	
	// Öncelik sıralasına göre sıralanmış elemanlarımdan en baştakini çağırıyorum
	
	System.out.println(queue.peek());

	while (!queue.isEmpty()) {
		System.out.println(queue.poll());
	}
	
	
	// Kendi oluşturduğumuz bir sınıfın elemanlarını Priority Queue yapısı ile kullanma 
	// Priority yapısının düzgün çalışması için yani öncelik sırasına göre işlem yapabilmesi için
	// Tıpkı TreeSet ve TreeMapler'de kullanıdığım gibi
	// Comparable ınterface'ini implement edip compareTo metodunu override etmeliyim kendi oluşturduğum sınıflar için
	
	 Queue<Player> queue_Player = new PriorityQueue<Player>();
	 
	 queue_Player.offer(new Player("Ahmet", 33));
	 queue_Player.offer(new Player("Harun", 15));
	 queue_Player.offer(new Player("Sercan", 57));
	 queue_Player.offer(new Player("Yale", 75));
	 
	 while (!queue_Player.isEmpty()) {
		System.out.println(queue_Player.poll());
	}
			
	
		}
}	
