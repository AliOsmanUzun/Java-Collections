import java.util.Objects;

public class Player {

		private String name ; 
		
		private Integer id;
		
		public Player(String name , Integer id) {
			this.name=name;
			this.id=id;
			
			
		}

		@Override
		public String toString() { // Bu sınıftan oluşan bir nesneyi bastırdığımız zaman çalışacak olan metot
			return "İD : " + id + " İsim : " + name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Player other = (Player) obj;
			return Objects.equals(id, other.id) && Objects.equals(name, other.name);
		}

		

		
		
		
}
