public class TestFibnacci {
 
    public static void main(String[] args) {
        int[] array1 = new int[]{};
        array1 = Fibnacci(12);
         
        for(int i=0;i<array1.length;i++)
        {
            System.out.println("The "+(i+1)+" Month and the Rabbit Number :"+array1[i]);
        }
         
    }
  
    public static int[] Fibnacci(int month){
        int[] array = new int[month];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i<array.length;i++)
        {
            array[i] = array[i-2] + array[i-1];
        }
         
        return array;
    }
 
}