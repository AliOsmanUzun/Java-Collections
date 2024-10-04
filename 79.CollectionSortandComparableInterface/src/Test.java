import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
		public static void main(String[] args) {
			
		// Listleri sıralama 
			
//		List<String> list_string = new ArrayList<String>();
//		
//		list_string.add("Java");
//		list_string.add("C++");
//		list_string.add("Pyhton");
//		list_string.add("Php");
//		list_string.add("Go");
		
	// Bunlar sırasız şekilde eklendi yani doğal sıralı şekilde eklenmedi , bizim ekleme sıramıza göre eklendiler.
		
// Doğal sıralı şekilde eklenmelerini istiyorsam Collection FrameWork'unde bulunan Collections classı kullanacağım.

// Collections sınıfı içerisinde bulunan sort static metodunu kullanıyorum
// Bu metod List içerisine eklediğim değerleri sıralı hale getiriyor
		
//		Collections.sort(list_string);
//		
//		for (String a : list_string) {
//			System.out.println(a); 
//		}
			
		// Student cinsin'den nesneler alan bir arraylist oluşturalım
			
	
			
		List<Student> list_student = new ArrayList<Student>();
		
		list_student.add(new Student("Yakup", 47));
		list_student.add(new Student("Bekir", 24));
		list_student.add(new Student("Basri", 13));
		list_student.add(new Student("Oğuz", 58));
		
		// Oluşturduğumuz sınıfın objelerini sıralamak için yine sort metodunu kullanabilir miyiz peki
		
		Collections.sort(list_student); // Java burada hata veriyor
		
		//  Bu hatayı diğer sınıflarda ( String , Integer ) almamamızın nedeni bu sınıfların 
		// Comparable sınıfını implement etmeleri ve oradaki compareTo metodunu kullanmaları kendi sınıfları için
		// compareTo metodu nesnelerin içeriğini karşılaştırıyor ve ona göre sıralama yapıyor list içerisinde 
		
		// karşılaştırdığımız nesne , parametre olarak girilen nesne'den büyükse  pozitif değer dönüyor
		// karşılaştırdığımız nesne , parametre olarak girilen nesne ile eşitse 0 değerini dönüyor 
		// karşılaştırdığımız nesne , parametre olarak girilen nesneden küçükse negatif değer dönüyor
		
		// Bu metodu kendi oluşturduğum sınıfların objelerini kıyaslamak için kullanmak istiyorsam
		// Comparable ınterface'ini implement etmeli ve compareTo metodunu override etmeliyim.
		
		for (Student f : list_student) {
			System.out.println(f);
		}
		
		Student ogrenci = new Student("Murat", 58);
		
		System.out.println(ogrenci.compareTo(new Student("Mehmet", 25) )); 
		// 1 dönecek oluşturduğum nesnem parametre olarak girilen nesneden id değeri olarak daha büyük
		// sınıfımdaki compareTo metodunu id değerine göre küçükten büyüğe doğru sıralama yapması için kodladım
		
		
		Set<Student> treeset = new TreeSet<Student>();
		
		treeset.add(new Student("Yakup", 47) );
		treeset.add(new Student("Bekir", 38));
		treeset.add(new Student("Kadri", 11));
		treeset.add(new Student("Gürkan", 53));
		
		for (Student s : treeset) {
			System.out.println(s);
		}
		
			
		
			
			
		}
}
