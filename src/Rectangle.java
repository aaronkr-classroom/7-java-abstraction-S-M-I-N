
public class Rectangle extends shape {
	double length; // 높이
	double width; // 너비
	
	public Rectangle (String color, double length, double width) {
		super(color); // 부모 클래스의 생성자 호출
		System.out.println("Circle 클래스의 생성자 호출");
		this.length = length;
		this.width = width;
	}
	
	// 추상 메소드를 정의
	double area() {
		return length * width;
	}
	
	public String toString() {
		return "사각형 색상은 " + super.getColor() + "그리고 면적은 " + area();
	}

}
