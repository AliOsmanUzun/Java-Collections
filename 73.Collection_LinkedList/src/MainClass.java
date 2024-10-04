import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		// LinkedList Nedir ?
		
		// LinkedList'te veriler , değerler ArrayList'deki gibi sıralı bir şekilde tutulmaz
		// Zincire benzer şekildedirler düğüm şeklinde yani bunlara node adı veriliyor.
		// İlk önce objenin değeri ve sonra sahip olduğu referans yer alır bu referans diğer objeyi gösterir.
		// Bu son objeye kadar böyle gider ve son objeden sonra bir obje olmadığı için referansı null değer gösterir. 
		// Bu referanslar sayesinde LinkedList içerisinde rahatça dolaşabilir , ekleme ve çıkarma işlemleri yapabilirim
		// En büyük avantajlarından birisi bir eleman ekleneceği veya çıkaralacağı zaman
		// ArrayListlere göre daha hızlı ve etkili şekilde çalışırlar.
		// Dezavantajı ise her objenin ayrı ayrı bir referansı olduğu için bellekte daha çok alan kaplar ArrayListe göre 
		
		// AbstractSequentialList class verilerin sıralı değilde , referanslar ile birbirini göstermesini sağlayan class'ımız
		// LinkedList'in çalışma mantığını , yapısını belirleyen sınıf aslında  
		
		// LinkedList ve ArrayList arasındaki farklar , avantajlar , dezavantajlar
		
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>(); // İki sınıfda List Interface'i implement ediyorlar.
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
//		zamanHesapla("LinkedList", linkedList);

//		zamanHesapla("ArrayList", arrayList);
		
		// Liste'nin sonuna doğru bir ekleme olduğu zaman ArrayList daha hızlı şekilde çalışıyor LinkedList'e göre
		
		
		
		zamanHesapla("LinkedList",linkedList );
		
		zamanHesapla("ArrayList", arrayList);
		
		// Liste'nin sadece ilk indexine , yani baş kısmına doğru ekleme yaptık 
		// Burada LinkedList , ArrayList'e göre çok daha hızlı bir şekilde çalıştı
		
		
		// İki durumunda açıklaması 
		
		// İlk durumda listenin sonuna doğru ekleme yapıyorduk 
		// Burada ArrayList yeni bir bölme açıp bellekte direkt olarak o veriyi ekliyor  bu böyle devam ediyor.
		
	// LinkedList'de ise ilk önce node  oluşturuluyor sonra  önceki objenin referansı yeni oluşturlan objenin değerine 
	// eşitleniyor 
	// Bu çok azda olsa performans kaybına neden oluyor arraylist'e göre.
		
	// İkinci durumda ise listenin başına doğru ekleme yaptık ( orta doğru ekleme yapsak yine aynı mantıkda çalışır ) 
		
// ArrayList başa doğru ekleme yaptığımız zaman yeni eklenen elemanları geriye doğru kaydırıyor bütün şekilde teker teker
// Her yeni değer eklendiğinde alta  bir bölme açıyor  ve üstteki değerleri alta doğru kaydırıyor. 
// Kısaca ArrayList başa ve orta kısma değer eklendiği zaman performans kaybı yaşıyor
		
// LinkedList ise değerleri referans ile tuttuğu için yeni bir ekleme yaptığımız zaman baş veya orta kısma 
// Sadece ilk iki indexdeki elemanı değiştiriyor , oradaki referansları koparıyor ve yeni elemanları ekliyor
// Sadece referansların gösterdiği objeler değişiyor 
	
	}
	
	public static void zamanHesapla(String veri_tipi , List<Integer> list  ) {
		
		// List'in sonuna değer ekleme işlemi yapacağız çok sayıda performans bakımından hangisi daha iyi ve hızlı 
		
		long baslangic ;
		long bitis ;
		
		baslangic = System.currentTimeMillis(); // Başlangıç süresini almamı sağlıyor , for döngüsü başlamadan önceki zamanı
		for(int i = 0 ; i<100000000 ; i++) {
			
			 // list.add(i);
			
			// Bu seferde liste'nin sadece ilk indexine yani başa doğru ekleme yapalım
			list.add(0,i);
		}
		
		bitis = System.currentTimeMillis();
		
		System.out.println(veri_tipi + " ekleme süresi : " + (bitis-baslangic) + " ms");
		
	}
}
