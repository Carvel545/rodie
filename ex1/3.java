public class Main {
    pubic static void main (String[] args) {
        String input = "example";
        String output = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println(output);
   }
}
