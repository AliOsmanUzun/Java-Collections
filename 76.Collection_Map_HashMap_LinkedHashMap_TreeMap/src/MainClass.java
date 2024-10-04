import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {
	
	
	public static void mapYazdir(Map<Integer,String> map) {
		map.put(10, "C#");
		map.put(6,"React" );
		map.put(7,"JavaScript");
		map.put(15, "Flutter");
		map.put(50, "Java");
		
		/*for(Map.Entry<Integer, String> entry : map.entrySet()){
			
			System.out.println("Anahtar : " + entry.getKey() + " Değer : " + entry.getValue());
		}*/
		
		// Bu şekildede map elemanlarını ekrana yazdırabiliriz.
		
		// map.keySet(); // keySet metodu bize map'in key değerlerini set şeklinde veriyor
		
		// foreach ve keySet metodunu kullanarak map'in değerlerini ekrana yazdırma
		
		for (Integer key : map.keySet()) {
			System.out.println("Key : " + key + " Değer : " + map.get(key));
		}
	}
	
	public static void main(String[] args) {
		
		
		// Bu 3 koleksiyonun arasındaki fark
		// HashSet , LinkedHashSet , TreeSet arasındaki farkla aynı
		
		// HashMap elemanları sırasız olarak  ve key value olacak şekilde tutuyor , 
		// hash table çalışma mantığını ile çalışıyor. Null anahtar olabilir 
		
		// LinkedHashMap'de ise elemanları eklenme sırasına göre ve key value şeklinde tutuyor 
		// Bu koleksiyonda hash table çalışma mantığı ile elemanları depoluyor. Null anahtar olabilir
		
		// TreeMap'de elemanlar tree ( ağaç ) yapısı ile depolanıyor ve doğal sıralama ile sıralanıyorlar.
		// Burada sıralanma şekli key'e göre yapılıyor key değerine göre doğal olarak sıralanıyorlar kısaca 
		// Yine elemanlar key ve value olacak şekilde tutuluyor.
		// Null Anahtar olamaz.
		
		
		Map<Integer,String> hashmap = new HashMap<Integer,String>();
		
		Map<Integer, String> linkedhash_map = new LinkedHashMap<Integer,String>();

		Map<Integer, String> treemap = new TreeMap<Integer,String>();
		
		System.out.println("******************************\n");
		mapYazdir(hashmap);
		System.out.println("\n******************************\n");
		
		System.out.println("\n******************************\n");
		mapYazdir(linkedhash_map);
		System.out.println("\n******************************\n");
		
		System.out.println("\n******************************\n");
		mapYazdir(treemap);
		System.out.println("\n******************************\n");
		
		hashmap.put(10, "C#");
		hashmap.put(6,"React" );
		hashmap.put(7,"JavaScript");
		hashmap.put(15, "Flutter");
		hashmap.put(50, "Java");
		
		
		// Values metodu 
		// Bu metod bir map'deki değerlerin tamamını içeren bir  Collection objesi döndürür. 
		// Collection , Map içinde bulunan tüm değerleri içerir , ancak bu değerlerin sıralanması Map'in implementasyonuna bağlıdır
		// Burada önemli noktalardan biride collection generic değerini map içerisindeki value ile aynı tipte olması.
		
		Collection<String> values = hashmap.values();
		// hashmap'ten values metodu ile bir Collection döndürdüm String tipli 
		// Bu collection objesi hashmap içerisindeki tüm değerleri , value'ları içerisinde tutuyor
		
		for (String s : values) {
			System.out.println(s);
		}
		
	
	}
}
