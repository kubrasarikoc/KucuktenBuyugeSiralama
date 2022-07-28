import java.util.Scanner;

public class KücüktenBüyüge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.println("1. Sayıyı Giriniz : ");
        a = input.nextDouble();
        System.out.println("2. Sayıyı Giriniz : ");
        b = input.nextDouble();
        System.out.println("3. Sayıyı Giriniz :");
        c = input.nextDouble();

        if (a<c && a<b){
            if (b<c) {
                System.out.println("a<b<c");
                }else {
                    System.out.println("a<c<b");
                }
        }else if (b<a && b<c){
            if (a<c) {
                    System.out.println("b<a<c");
                }if (a>c){
                        System.out.println("b<c<a");
                    }
        } else{
            if (b<a){
                System.out.println("c<b<a");
            }else{
                System.out.println("c<a<b");
            }
        }
    }
}

