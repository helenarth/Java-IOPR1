
public class SimpleRetangle {
	double height = 1; 
	double width = 1; 

public static void main(String[] args) {
	
	
	SimpleRetangle retangle1 = new SimpleRetangle(0, 0 );
	SimpleRetangle retangle2 = new SimpleRetangle(4, 50	);
	
	SimpleRetangle retangle3 = new SimpleRetangle(4.5, 25.9);
	
	System.out.println("The perimeter of the first box is: " +retangle1.getPerimeter() + "\n");
    System.out.println("The perimeter of the second box is: " +retangle2.getPerimeter() + "\n");
    System.out.println("The perimeter of the third box is: " +retangle3.getPerimeter() + "\n");
           
   System.out.println("The area of the first box is: " +retangle1.getArea() + "\n");
   System.out.println("The area of the second box is: " +retangle2.getArea() + "\n");
   System.out.println("The area of the third box is: " +retangle3.getArea() + "\n");
}


	



public SimpleRetangle(double h , double w) {
	
	this.height = h;
	this.width = w;
	
}

public void setWidth ( double w)
{
	
	width  = w;
	
}

public void setHeight ( double h)
{
	
	
	height = h;
	
	
	}


public double getWidth(){
   return width;
}

public double getHeight(){
   return height;
}
	
public double getArea(){
    return width * height;
            
 }
public double getPerimeter(){
    return (2*height)+(2*width);
 }


}
