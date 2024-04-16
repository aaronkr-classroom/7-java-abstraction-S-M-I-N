
public class Bike extends TwoWheeler {
	
	// Vehicle 추상 클래스의 메소드
	public void printPrice() {
		System.out.println("가격 : 150,000원");
	}
	
	// TwoWheeler 추상 클래스의 메소드
	public void printType() {
		System.out.println("이것은 자전거 입니다.");
	}
	
	// Bike 일반 클래스의 메소드
	public void printBrand() {
		System.out.println();
	}

}
