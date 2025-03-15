import java.util.Arrays;

public class Main {
  public static void main(String[] args)
       int[] memory = new int[3];
       Arrays.fill(memory, Integrer.MAX_VALUE);

       int input = 2;
        if (memory[0] == Integer.MAX_VALUE) {
               memory[0] == input ;
       } else if (memory[1] == Integer.MAX_VALUE) {
                 memory[1] = input;
       } else if (memory[2] == Integer.MAX_VALUE) {
                memory[2] = input;
       } else {
             Arrays.sort(memory);
             memory[0] = input
        }

        System.out.println(Arrays.toString(memory));
    }
}
        
  
