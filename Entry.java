public class Entry implements Comparable
{
   private double iceThickness;
   
   public Entry(double thick)
   {
      iceThickness = thick;
   }
   
   public double getThickness()
   {
      return iceThickness;
   }
   
   public int compareTo(Object obj)
   {
      Entry arg = (Entry)(obj);
      if(this.getThickness() > arg.getThickness())
         return 1;
      if(this.getThickness() < arg.getThickness())
         return -1; 
      return 0;  
   }
   
   public String toString()
   {
      return "" + iceThickness;
   }
   
}