public class JavaProgram
{
    public static void main(String args[])
  {
    int first, second, subtract,addition;
    float devide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();
    subtract = first - second;
    System.out.println("Difference = " + subtract);
 }
}

