import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class MainClass {
		
	public static void main(String[] args) {
		// ListIterator vs Iterator
		
		/*
		ListIterator 
		
		Sadece List Interface'i implement eden class'larda kullanılabilir. ( ArrayList , LinkedList , Vector , Stack ) 
		
		next() ve previous() metodu vardır.
		
		next() metodu ileriye doğru giderek liste içerisinde eleman döndürür.
		previous() metodu geriye doğru giderek liste içerisinde eleman döndürür.
		
		Ekstradan add metodu bulunur .
		
		
		Iterator : 
		
		Set , Queue ve List Interface'i implement eden class'larda kullanılabilir.
		
		previous() metodu burada yoktur.
		
		Biz bu sayede for döngüsü ile direkt olarak Set , List ve Queue Interfacelerini implement eden sınıfları
		direkt olarak bastırabiliyoruz , çünkü for döngüsü kendi içerisinde Iterator'ı kullanıyor
		
		
		
İkisi arasındaki temel fark kısaca ListIterator'un sadece List Interface'ini implement eden class'larda kullanılırken

Iterator ise Set , Queue ve List Interface'ini implement eden class'larda kullanılabiliyor.

Ve Iteratorımızda previous metodu bulunmaması.

		*/
	
		
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JavaScript");
		set.add("Html");
		set.add("CSS");
		set.add("Python");
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JavaScript");
		list.add("Html");
		list.add("CSS");
		list.add("Python");
		
		// Iterator oluşturalım kullanalım ( Set, List ,Queue ) 
		 
		Iterator<String> iterator1 = set.iterator(); 
// HashSet'İm içerisinde bir ıterator objesi oluşturdum ve bu objeyi Itertor ınterface tipli referansıma eşitledim
		
		
		
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		
	// Iterator<String> iterator2 = list.iterator();
		
//		while (iterator2.hasNext()) {
//			System.out.println(iterator2.next());
//		}
		
// Burada ki kodda ekrana hiç bir çıktı basılmayacak çünkü	önceki döngüde iterator ile son elemana kadar gelmiştim
// ileride bir referans olmadığı için döngü hiç çalışmayacak
		
//		while (iterator2.hasNext()) {
//			System.out.println(iterator2.next());
//		}

		System.out.println("\n********************\n");
	// Şimdi sadece List Interface'ini implement eden sınıflarda kullanabildiğimiz bir ListIterator oluşturalım 
	// ArrayList'imiz içerisinde 
		
		
	// Farkı Iterator'dan ekstradan add metodu bulunması ( bulunduğu konuma eleman ekleyebiliyoruz ) 
	// ve hasPrevious , previous metodlarına sahip olması
	ListIterator<String> listIterator = list.listIterator();
	
	// İlk olarak ileri doğru gidelim
	while(listIterator.hasNext()) {
		System.out.println(listIterator.next());
	}
	
	System.out.println("\n****************************\n");
	// Ardından geriye doğru gidiyorum
	while (listIterator.hasPrevious()) {
		System.out.println(listIterator.previous());
	}
	
	while (listIterator.hasNext()) {
		
			String value = listIterator.next();
			
			if (value.equals("Python")) {
				listIterator.remove(); // Bulunduğu konumda ki değeri kaldıracak o değerde Pyhton
			}
		
			System.out.println("\n");	
		// ArrayList'imin son halini bastırdığımda Python'ın silinmiş olduğunu görüyorum
	for (String string : list) {
		System.out.println(string);
	}		
	}
		
	}
}
