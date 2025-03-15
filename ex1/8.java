public class Main {
     public static void main(String[] args) {
          String input = "ABcAAr";
          int upperCount = 0;
          int LowerCount = 0;

          for (char c : input.toCharArray()) {
              if (Character.isUpperCase(c)) {
                  upperCount++;
              } else if (Character.isLowerCase(c)) {
                   lowerCount++;
              }
           }

           if (upperCount > lowerCount) {
               System.out.println(input.toUpperCase());
           } else if (lowerCount > upperCount) {
                System.out.println(input.toLowerCase());
           } else {
                System.out.println(input.toLowerCase());
           }
       }
}
