import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
		public static void main(String[] args) {
			
			
	/*
 Queue ( Kuyruk ) Interface'ini implement eden LinkedList Class'ı  FIFO ( Firs In , Firs Out Mantığıyla Çalışır ) 
 
 add(eleman)--> Elemanı kuyruğa ekler , ekleyemezse hata fırlatır.
 
 offer(eleman)--> Elemanı kuyruğa ekler. Eklerse true değer döner , ekleyemezse false döner
 
 remove()--> Kuyruğun en başındaki elemanı kuyruktan çıkarır , Kuyruk boş ise hata fırlatır.
 
 poll()--> Kuyruğun en başındaki elemanı kuyruktan çıkarır , Kuyruk boşsa null referans döner . 
 
 element()--> Kuyruğun en başındaki elemanı döner , Kuyruk boşsa , hata fırlatır.
 
 peek()--> Kuyruğun en başındaki elemanı döner , Kuyruk boşsa , null referans döner.
	 
	 
	// Yani kullanmamızın doğru olacağı metotlar burada Offer , Poll ,Peek metodları olacak
	*/		
			
	// LinkedList sınıfımız hem queue ınterface'ini hemde list ınterface'ini implement ediyor.
	// Eğer linkedlist objesi bir que referansına atanırsa bu seferde queue yapısı şeklinde davranıyor.
	
			// Elemanlar eklenme sırasına göre ekleniyor.
			// Tıpkı gerçek hayattaki gibi kuyruğun başındaki ilk çıkan oluyor = FIFO
			// Bir değer silinecekse FIFO yapısı kullanarak yapılıyor
		
	
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Bursa");
		queue.offer("Sivas");
		queue.offer("Hatay");
		
		// Kuyruğumun ilk eklenen elemanını peek metodu ile dönüyorum
		System.out.println(queue.peek());
		
		// Kuyruğumun en başındaki elemanı atıyorum poll metodu ile 
		
		System.out.println(queue.poll());
			
		
		// Queue muzun boş olup olmadığını kontrol edelim
		
		System.out.println(queue.isEmpty());
		
		while (!queue.isEmpty()) {
			System.out.println("Eleman çıkarılıyor : " + queue.poll());
			
		}
		}
}
