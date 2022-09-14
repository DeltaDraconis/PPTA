import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                Scanner skan = new Scanner(System.in);
                System.out.println("Podaj liczbę a: ");
                int a = skan.nextInt();

                System.out.println("Podaj liczbę b: ");
                int b = skan.nextInt();
                for(int i = a; i<=b; i++){
                    if(i % 4 == 0 && i % 8 == 0 && i % 12 == 0) {
                        System.out.println("Wynik wynosi: "+ i);

                    }
                }

                }




        }
