import java.util.Scanner;

class datatypesize {
  public static int dataTypeSize(String str) {
    return switch (str.toLowerCase()) {
      case "character" -> 2;
      case "integer"   -> 4;
      case "long"      -> 8;
      case "float"     -> 4;
      case "double"    -> 8;
      default          -> -1;
    };
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String input = sc.nextLine();
      System.out.println(dataTypeSize(input));
    }
  }
}
