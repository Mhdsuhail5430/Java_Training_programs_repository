package mod1.day2;

public class ClassessAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            PaintBrush obj=new PaintBrush();
            obj.doPaint(1);
	}
}

class PaintBrush{
	
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red paint");
		}
		else if(i==2){
			System.out.println("bluepaint");
			
		}
		else {
			System.out.println("greenpaint");
		}
		
	}
	
}




