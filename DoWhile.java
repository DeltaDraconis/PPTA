import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //do while
        /*int a = 1;
        do {
            System.out.println(a);
            a+=2;
        }
        while(a<=25);

        //zad 1
        int a = 1;
        do{

            System.out.println(a);
            a++;
        }while(a <= 100);
        //zad 2

        int a = 1000;
        do{
        System.out.print(a+", ");
            a = a + 1;

        }while(a<=1020);

        //zad 3
        int a = -30;
        do{
            a=a+1;
           if(a % 5 == 0) {
                System.out.println(a);
            }
        }while(a <=1000);

        //zad 2 i 3 w jednym
        Scanner powtorz = new Scanner(System.in);
        System.out.println("Podaj liczbę powtorzen: ");
        int a = powtorz.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println("Hello-World");

        }
        //zad 4 a
        Scanner Scanner = new Scanner(System.in);
        System.out.println("podaj początek zakresu: ");
        int p = powtorz.nextInt();

        System.out.println("podaj koniec zakresu: ");
        int k = powtorz.nextInt();

        System.out.println("podaj dzielnik: ");
        int d = powtorz.nextInt();
        for (int i = p; i <= k; i++) {
            if (i % d == 0) {
                System.out.println(i);
            }


        }*/
        //zad 4 b
        Scanner liczby = new Scanner(System.in);
        System.out.println("Podaj ilość dzielników: ");
        int d = liczby.nextInt();
        System.out.println("Podaj początek przedziału: ");
        int p = liczby.nextInt();
        System.out.println("Podaj koniec przedziału: ");
        int k = liczby.nextInt();
        for(int i = 0;i <= d;i++){
            System.out.println("Podaj dzielnik: ");
            int il = liczby.nextInt();
            }





    }
}