import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        double kg, boy, indeks;

        System.out.print("Kilonuzu Giriniz: ");
        kg = input.nextDouble();

        System.out.print("Boyunuzu Metre Cinsinden giriniz: ");
        boy = input.nextDouble();

        indeks = kg / (boy * boy);

        if(indeks <= 18.5 ){
            System.out.println("Normal Değrlerin Altındasınız Kilo Almalısınız! " + "Vücut Kitle İndeksiniz: " + indeks);
        } else if(indeks <= 24.9){
            System.out.println("Kilonuz Gayet İyi Duruda! " + "Vücut Kitle İndeksiniz: " + indeks);
        }else{
            System.out.println("Kilo Vermelisiniz! " + "Vücut Kitle İndeksiniz: " + indeks);
        }

        //System.out.println(indeks);
    }
}
