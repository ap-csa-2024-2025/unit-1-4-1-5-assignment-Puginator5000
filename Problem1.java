public class Problem1
{
  public static void main(String[] args)
  {
    int number = 24;

    for (int i = 0; i < 4; i++) {
        System.out.println("Number is now " + number++);
    }
    for (int j = 0; j < 4; j++) {
      System.out.println("Number is now " + number--);
  }
  }
}

