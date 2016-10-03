

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public int perimeter(){
		int perimeter = length + length + width + width;
		return perimeter;
	}
	
	public int area(){
		int area = length * width;
		return area;
	}
	
	public String compare(Rectangle other){
		if(this.area() > other.area()){
			return "area is bigger";
		}
		else{
			return "area is smaller";
		}
	}
	
	public boolean square(){
		if(length == width){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(5,4);
		Rectangle rec2 = new Rectangle(5,5);
		
		System.out.println(rec1);
		System.out.println(rec1.area());
		System.out.println(rec1.perimeter());
		System.out.println(rec1.compare(rec2));
		System.out.println(rec1.square());
		System.out.println(rec2.square());

	}

}

