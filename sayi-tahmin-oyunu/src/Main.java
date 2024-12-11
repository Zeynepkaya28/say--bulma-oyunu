import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("tahmin aralığının alt sınırını girin:");
        int altSinir=klavye.nextInt();
        System.out.println("tahmin aralığının üst sınırını giriniz:");
        int ustsinir=klavye.nextInt();

        Random sayi=new Random();
        int hedefSayi= sayi.nextInt(ustsinir-altSinir)+altSinir;

        System.out.println(altSinir+" "+ustsinir+""+" "+"arasında bir sayı tuttum.Bilebilecek misin? Bakalım.");
        int tahmin=0;
        int denemeSayisi=0;

        while (tahmin!=hedefSayi) {
            System.out.println("tahmininizi giriniz:");
            Scanner klavye1=new Scanner(System.in);
            tahmin=klavye1.nextInt();
            denemeSayisi++;

            if (tahmin<hedefSayi) {
                System.out.println("daha büyük bir sayı giriniz.");}
            else if (tahmin>hedefSayi) {
                System.out.println("daha küçük bir sayı giriniz.");}
            else {
                System.out.println("tebrikler"+" "+denemeSayisi+" "+"denemede doğru sayıyı buldunuz.");}
        }
    }
}