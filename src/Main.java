
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //2 adet vize %30 1 adet  final %40
        System.out.println("Üniversite not hesaplama formatımıza hoşgeldiniz.");
        Scanner scn = new Scanner(System.in);
        System.out.println("1.vize puanınızı giriniz : ");
        double a = scn.nextDouble();
        System.out.println("2.vize puanınızı giriniz : ");
        double b = scn.nextDouble();
        System.out.println("Final notunuzu giriniz : ");
        double c = scn.nextDouble();
        double result=(a*0.3+b*0.3+c*0.4);
        scn.nextLine();
        System.out.println("Lütfen üniversitenizin ismini giriniz :");
        String okul = scn.nextLine();
        
        if(result >= 90 && result<=100){
        System.out.println(okul +" güzel bir eğitim verdiklerini duymuştum(BAŞARILAR)");
        System.out.println("notunuz AA");
            System.out.println("toplam puanınız :"+result);
        }
        else if(result <90 && result>=85){
        System.out.println(okul +" güzel bir eğitim verdiklerini duymuştum(BAŞARILAR)");
        System.out.println("notunuz AB");
        System.out.println("toplam puanınız :"+result);

        }
             else if(result <85 && result>=80){
        System.out.println(okul +" güzel bir eğitim verdiklerini duymuştum(BAŞARILAR)");
        System.out.println("notunuz BB");
        System.out.println("toplam puanınız :"+result);

        }
             else if(result <80 && result>=75){
        System.out.println(okul +" güzel bir eğitim verdiklerini duymuştum(BAŞARILAR)");
        System.out.println("notunuz CB");
        System.out.println("toplam puanınız :"+result);

        }
             else if(result <75 && result>=70){
        System.out.println(okul +" güzel bir eğitim verdiklerini duymuştum(BAŞARILAR)");
        System.out.println("notunuz CC");
        System.out.println("toplam puanınız :"+result);

        }
             else if(result <70 && result>=65){
        System.out.println(okul +" güzel bir eğitim verdiklerini duymuştum(BAŞARILAR)");
        System.out.println("notunuz DC");
        System.out.println("toplam puanınız :"+result);

        
        }
             else if(result <65 && result>=0){
        System.out.println(okul +" kötü bir eğitim verdiklerini duymuştum(BAŞARILAR)");
        System.out.println("BAZEN HATAYI KENDİNDE ARAMAN GEREKEBİLİR BU KADAR KÖTÜ OLDUKLARINI DÜŞÜNMÜYORUM ");
        System.out.println("Ders tekrarı");
        System.out.println("toplam puanınız :"+result);

        }else if(result>100 || result<0){
            System.out.println("bir öğrencinin puanı 0'dan düşük yada 100'den büyük olamaz");
            System.out.println("toplam puanınız :"+result);

        }
             else{
                 System.out.println("HATALI YADA YANLIŞ BİR TUŞLAMA YAPTINIZ...!!!");
             }
        
    }
    
}
