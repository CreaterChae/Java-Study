package ex7;

public class Product {

	int price;
	int bonuspoint;
	
	Product() {} // Product 클래스에 기본생성자가 없어서 오류 발생한 것.
	
	Product(int price) {
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
	
}

	class Tv extends Product {
		Tv() {}
		
			
			
		public String toString() {
			return "TV";
		}


	public static void main(String[] args) {
		
		Tv t = new Tv();
		
	
	}

}
