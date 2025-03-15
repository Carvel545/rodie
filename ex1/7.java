import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
  public static void main (String[] args ) {
        String line = scanner.nextLine();
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(line.split(" ")));
        System.out.println(String.join(" ", uniqueWords));
  }
}
