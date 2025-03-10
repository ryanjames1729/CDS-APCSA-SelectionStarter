public class SelSorter
{
   public static String sel_sort_int(int[] stuff)
   {
      int count = 0;
      int swap = 0;
      int loop = 0;
      for(int i=0; i< stuff.length-1; i++)
      {
         count++;
         int min = i;
         for(int j = i+1; j< stuff.length; j++)
         {
            loop++;
            if(stuff[j] < stuff[min])
            {
               count++;
               min = j;   
            } 		
         }
         if(min != i) 
         {
            swap += 3;
            int temp = stuff[min];
            stuff[min] = stuff[i];
            stuff[i] = temp;   	
         }
         
      }
      return "Conditional Checks= "+loop+"\nComparison SE's= "+count+"\nSwap SE's= " +swap;
   }
   
   public static String sel_sort_Entry(Entry[] stuff)
   {
      int count = 0;
      int swap = 0;
      int loop = 0;
      for(int i=0; i< stuff.length-1; i++)
      {
         count++;
         int min = i;
         for(int j = i+1; j< stuff.length; j++)
         {
            loop++;
            if(stuff[j].compareTo(stuff[min]) < 0)
            {
               count++;
               min = j;   
            } 		
         }
         if(min != i) 
         {
            swap += 3;
            Entry temp = stuff[min];
            stuff[min] = stuff[i];
            stuff[i] = temp;   	
         }
         
      }
      return "Conditional Checks= "+loop+"\nComparison SE's= "+count+"\nSwap SE's= " +swap;
   }
}
 