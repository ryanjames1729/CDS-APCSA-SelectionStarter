// Selection Starter      A+CR
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
   
      int[] ray = {3,5,1,7,6,2,8,4};
      System.out.println(Arrays.toString(ray));
      System.out.println(SelSorter.sel_sort_int(ray));
      System.out.println(Arrays.toString(ray));
      System.out.println("\n\n");
      
      Entry[] ray1 = {new Entry(3.14), new Entry(5.21), new Entry(3.66), new Entry(1.78)};
      System.out.println(Arrays.toString(ray1));
      System.out.println(SelSorter.sel_sort_Entry(ray1));
      System.out.println(Arrays.toString(ray1)); 
  }
}