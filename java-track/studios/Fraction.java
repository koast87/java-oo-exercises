
public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public String add(Fraction other){
		Fraction answer = new Fraction(this.numerator, this.denominator);
		if(denominator == other.denominator){
			answer.numerator = numerator + other.numerator;
			return answer.numerator + "/" + answer.denominator;
		}
		else{
			this.numerator *= other.denominator;
			other.numerator *= denominator;
			this.denominator *= other.denominator;
			answer.numerator = numerator + other.numerator;
			answer.denominator = denominator;
			return answer.numerator + "/" + answer.denominator;
		}
	}
	
	public String mult(Fraction other){
		Fraction answer = new Fraction(this.numerator, this.denominator);
		answer.numerator = numerator * other.numerator;
		answer.denominator = denominator * other.denominator;
		return answer.numerator + "/" + answer.denominator;
	}
	
	public String rec(){
		Fraction answer = new Fraction(this.numerator, this.denominator);
		Fraction f1 = new Fraction(numerator,denominator);
	
		answer.numerator = f1.numerator * f1.denominator;
		answer.denominator = f1.numerator * f1.denominator;
	
		return answer.numerator + "/" + answer.denominator;
	}
	
	public String simplify(){
		Fraction answer = new Fraction(this.numerator,this.denominator);
		int i = 1;
		int j = 1;
		
		while(i != 0 && j != 0){
			int k = 2;
			
			i = numerator % k;
			j = denominator % k;
			
			if(j == 0 && i == 0){
				answer.numerator = numerator / k;
				answer.denominator = denominator / k;
				
			}
			else{
				k++;
			}
		}
		return answer.numerator + "/" + answer.denominator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(2,3);
		Fraction f2 = new Fraction(5,4);
		
		
		System.out.println(f1.mult(f2));
		System.out.println(f1.rec());
		System.out.println(f1.simplify());
		System.out.println(f1.add(f2));
	}

	}