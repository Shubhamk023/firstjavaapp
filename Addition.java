public class Addition{
	public static int add(int x, int y){
		int add=x+y;
		return add;
	}
	
	
	public static int add(int x, int y, int z){
		int add = x+y+z;
		return add;
	}
	
	public static float add(float x, float y){
		float add=x+y;
		return add;
	}
	
	public static void main(String[]args){
		int x = 5;
		int y = 4;
		int z = 3;
		float a = 4.5f;
		float b = 5.5f;
		
		int add = add(x,y);
		System.out.println("add of two num "+add );
		
		add = add(x,y,z);
		System.out.println("add of three num "+add );
		
		float add1 = add(a,b);
		System.out.println("add of two num "+add1 );
		
	}
}	