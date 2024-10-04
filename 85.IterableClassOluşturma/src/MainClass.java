import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
		public static void main(String[] args) {
			
	// Kendi iterable sınıfımızı nasıl oluştururuz.
			
	/*
	Iterable Interface'i tam olarak ne işe yarıyor
	
	Collection Interface'ini Extends eden Interface'lerin Yani List , Set , Queue
	Bu Interface'leri implement eden class'lardan üretilen objelerin üzerinde ,
	for döngüsü  ve ıterator yapıları ile gezinmemizi sağlayan bunları içerisinde barındıran bir Interface
	
	Iterable bizim ıterator oluşturmamızı sağlıyor
	
	Kendi oluşturduğumuz class eğer Iterable interface'ini implement ediyorsa
	Buradaki objeleri , elemanları for döngüsü ve ıterator kullanarak bastırabiliriz.
	
		*/
			
		String[] kanallar = {"Radyo Viva","Radyo Kral","Radyo Durağı","Radyo Pop","Lider FM"};	
			
		Radyo radyo = new Radyo(kanallar);
		
// radyo objemin sahip olduğu kanallar_listesi isimli array listi bastırmak istiyorum ama foreach ile bastıramıyorum
// bu işlemi iterator ile yapmaya kalksamda yapamıyacağım 

// nedeni class'ımın ıterable interface'ini implement etmemesi
		
// çünkü bu yapılar gönderilen objeden bir iterator oluşturmaya çalışıyor , eğer iterator objesi değilse bastıramıyoruz.
		
		
	for (String s  : radyo) {
		System.out.println(s);
 	}	
	
	Integer[] rakamlar = {1,2,3,4,5,6,7,8,9};
	
	Numbers sayilar = new Numbers(rakamlar);
//	for (Integer i : sayilar) {
//		System.out.println(i);
//	}
	
	Iterator<Integer> iterator = sayilar.iterator();
	
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
		
		}
}

 class Numbers implements Iterable<Integer>{
	 
	private List<Integer> rakamlar = new LinkedList<Integer>();

	public Numbers(Integer[] rakamlar) {
		
		for (Integer i : rakamlar) {
			this.rakamlar.add(i);
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		// return  rakamlar.iterator(); // Rakamlar LinkedList'im içerisinde bir ıterator nesnesi oluşturup referansını 
									 // Döndürmüş oldum
		return new Numbers_Iterator();
	}
	
 public class Numbers_Iterator implements Iterator<Integer>{
	 // İlk iş bir index tanımlaması yapmak
	 private int index = 0; 
	 
	@Override
	public boolean hasNext() {
		if (index<rakamlar.size()) {
			return true ;
		}
		else {
			return false;
		}

	}

	@Override
	public Integer next() {
		Integer value = rakamlar.get(index);
		index++;
		return value;
	}
	 
	 
 }
	
	
}
