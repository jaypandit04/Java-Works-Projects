import java.util.*;
class Try
{
   public static void main(String[]args)
   {
                List<Integer> signalOne = Arrays.asList(1,2,3,4,1);
                List<Integer> signalTwo =  Arrays.asList(5,4,3,4,1);
                System.out.println(updateTimes(signalOne, signalTwo));
   }
   public static int updateTimes(List<Integer> signalOne, List<Integer> signalTwo) {
    // Write your code here
                HashMap<Integer,Integer> sigone = new HashMap<Integer,Integer>();
                HashMap<Integer,Integer> sigtwo = new HashMap<Integer,Integer>();
                
                for(int i=0,j=0;i<signalOne.size() || j<signalTwo.size();i++,j++)
                {
                    sigone.put(i,signalOne.get(i)); 
                    
                     sigtwo.put(i,signalTwo.get(j)); 
                }
                
                int time = getcompare(sigone,sigtwo);
                
                return time;
    }
    public static int getcompare(HashMap<Integer,Integer> sigone, HashMap<Integer,Integer> sigtwo)
    {
        int count=0;
       
        
        HashSet<Integer> remove = new LinkedHashSet<Integer>();
        
        for(int i=0;i<sigone.size();i++)
        {
            if(sigone.get(i) == sigtwo.get(i))
            {
                remove.add(sigone.get(i));
            }   
        }
        List<Integer> store1 = new ArrayList<Integer>(remove);
       
        for(int j=0;j<store1.size();j++)
        {
                
            if(count < store1.get(j))
               count++;              
        }
        
        return count;        
  }
}