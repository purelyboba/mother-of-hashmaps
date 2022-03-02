import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<String, HashMap<String, Integer>> hash = new HashMap<String, HashMap<String, Integer>>();

    HashMap<String, Integer> test1 = new HashMap<String, Integer>();

    test1.put("num1", 1);
    test1.put("num2", 2);
    test1.put("num3", 3);

    HashMap<String, Integer> test2 = new HashMap<String, Integer>();

    test2.put("num1", 1);
    test2.put("num2", 2);
    test2.put("num3", 3);

    hash.put("test1", test1);
    hash.put("test2", test2);

    System.out.println(hash);
  }
}
