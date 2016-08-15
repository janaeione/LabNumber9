	import java.text.DecimalFormat;
	
	public class Circle {
				
		

			   
			   private static int circleCount;
			   private double radius;
			   
			   	public Circle (double radius){
				   this.radius = radius;
				   Circle.circleCount++;
				   
			   }
			   
			   public double getCircumference(){
				   return (2 * Math.PI * radius);
				   
			   }
			   
			   public String getFormattedCircumference (){
				   return formatNumber(getCircumference());
				   
			  }
			   
			  public double getArea (){
				  return (Math.PI * radius * radius);
				  
			  }
			  
			  public String getFormattedArea (){
				  return formatNumber (getArea());
			  }
			  
			  private String formatNumber (double x){
				  return new DecimalFormat ("##.##").format(x);
				  
			  }
			  
			  public static int getObjectCount(){
				  return Circle.circleCount;
			  }
			  }

