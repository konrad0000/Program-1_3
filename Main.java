import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int liczba1, liczba2, suma;
    System.out.println("Wprowadź dwie liczby");
    Scanner wpisz = new Scanner(System.in);
    liczba1 = wpisz.nextInt();
    liczba2 = wpisz.nextInt();
    System.out.println("Otrzymana suma to : " +(liczba1+liczba2));
    
  }
}
  