import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

@SuppressWarnings("unused")
public class MainClass {
		
	
	
	public static void main(String[] args) {
		
// Vektörler ve Stackler  , Java'da veri yapıları olarak kullanılır ve her ikisi de  elemanları birer liste gibi
// saklamak için kullanılır.
		
		
		
/* Vektörler Nedir ?
		
Vektör java'da util içindeki bir sınıftır
	
Vektörler , dinamik bir array gibi ( arraylist ).Yani eleman ekleyebilir çıkarabilir ve boyutunu dinamik olarak , 
arttırabilir

Bir vektör oluşturulduğunda başlangıçta bir kapasite belirtilir.Bu kapasite dolduğunda,vektör otomatik olarak, 
kapasitesini arttırır.

add() metodu ile vektöre eleman ekleyebilir , get() metodu ilede bu elemanları çağırabilirim.
		
*/
	
/*		
Stack ( Yığınlar ) 
	
Stack sınıfıda , Java.util paketi içerisinde bulunan bir sınıftır.

 Stack , Last - In , First - Out  mantığıyla çalışır , yani son giren ilk çıkar .
 Bu stack'e eklenen son elemanın ilk olarak çıkarılacağı demek kısaca 
 
 En çok kullanılan iki metod push(),peek() ve pop() metodlarıdır.
 
 push() : Stack'e yeni bir eleman ekler 
 pop() : Stack'ten en üstteki elemanı çıkarır ve bu elemanı döndürür.
 peek() : Stack'ten en üstteki elemanı çıkarmaz , sadece döndürür.
 
 
 STACK LIFO MANTIĞIYLA ÇALIŞIR
 
 
		
		
		
*/		

 // Zaten bu iki sınıfta List Interface'ini implement ediyor , yani çalışma mantıkları bir liste mantığında
 // Ayrıca Stack somut sınıfı Vector somut sınıfını extends ( miras alıyor )  ediyor.
		
/*
	Vektörün arraylist'ten en büyük farklarından birisi
	
	İçerisinde synchronized anahtar kelimesinin kullanıldığı metotlar tanımlanmış olması
	Bu thread'ler konusu ile bağlantılı bir konu 
	Peki bu anahtar kelimenin ne gibi bir faydası var 
	Eğer farklı threadler bir arraylist üzerinde uğraşıyorsa ve arraylist üzerinde uğraştığı metod , 
	synchronized değilse bu threadler burada karışıklığa neden olabiliyor.
	
	Kısaca threade işlemlerinde arraylistler yerine daha güvenli olan bu işlem için
	Vektör somut sınıfını kullanıyoruz
	
	Ancak ArraListlere göre biraz daha performans olarak yavaştır.
		
		
		
*/		
		Vector<String> vector = new Vector<String>();
		
		vector.add("Ahmet");
		vector.add("Cengizhan");
		vector.add("Oğuz");
		
//		for (String v : vector) {
//			System.out.println(v);
//		}
		
		// Yada bu vector üzerinde bir list iterator objesi oluşturup onu kullanabiliriz
		
		
//		ListIterator<String> iterator = vector.listIterator();
//		
//		 while (iterator.hasNext()) { // İlerledikçe ileride obje referansı varsa true değer döndürecek {
//			
//			 System.out.println(iterator.next()); // next ile'de ileri gidip objenin değerini döndürüyorduk
//		}
		
		// Bu vector üzerinde gezinmek için bir yapımız daha var 
		// Enumeration ınterface'i bu yapı ile beraber element metodu'nu kullanıyorum.
		
		
		Enumeration<String> enumeration = vector.elements();
		
		// Enumeration yapısının kullanımıda Iterator'e benziyor while yapısı ile kullanılıyor yine 
		
		while(enumeration.hasMoreElements()) { // daha element var mı vector içerisinde element varsa true yoksa false
		
			System.out.println(enumeration.nextElement());
		}
		
		// Vector'un içindeki sadece ilk elemanı ve son elemanı almak içinde özel metodlarımızda var
		
		System.out.println(vector.firstElement());
		
		System.out.println(vector.lastElement());
		
		
		System.out.println("\n********************\n");
		
		
		Stack<String> stack = new Stack<String>();
		
		// Vector sınıfını miras aldığı için add metodunu kullanabilirim 
		
		stack.push("Java");
		stack.push("Javascript");
		stack.push("Pyhton");
		stack.push("Go");
		
//		Enumeration<String> enumeration2 = stack.elements();
//		
//		while(enumeration2.hasMoreElements()) {
//			
//			System.out.println(enumeration2.nextElement());
//		}
		
		// Stack'deki last in - first out mantığı 
		
		// Bunun için pop ve peek metotlarını kullanıyoruz
		// Pop son eklenen elemanı stack'ten çıkartıyor ve değerini döndürüyor
		// Peek ise son eklenen elemana hiç dokunmuyor , sadece değerini döndürüyor
		
		// Peek
		
		System.out.println(stack.peek());
		
		// empty metodu eğer stack'in içerisi dolu ise false boş ise true değer döndürüyor
		
		System.out.println(stack.empty());
		
		// ! işareti ile kullandığımız kodun vereceği değerin tam tersi şekilde çalışmasını ve ona göre haraket edilmesini istediğimi belirtiyorum
		
		while(!stack.empty()) {
		// ! işaretni kullandığım için eğer empty metodu false değer döndürürse true değer döndürmüş sayılacak
		System.out.println("Eleman çıkarılıyor : " + stack.pop());
		}
		
	}
}
