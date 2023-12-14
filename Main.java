import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //1: Bir dizideki en büyük sayıyı bulan bir Java programı yazın.
        int[] dizi={25,31,2,54,89,32,78,6,98};
        Arrays.sort(dizi);
        System.out.println("En büyük sayı : " +dizi[dizi.length-1]);






        //2: Bir dizideki en küçük sayıyı bulan bir Java programı yazın.
        /*int[] dizi={25,31,2,54,89,32,78,6,98};
        Arrays.sort(dizi);
        System.out.println("En büyük sayı : " +dizi[0]);*/







        //3: Bir dizideki sayıların toplamını hesaplayan bir Java programı yazın.
       /* int toplam=0;
        int[] dizi={25,31,2,54,89,32,78,6,98};
        for (int i=0; i<dizi.length; i++){
            toplam+=dizi[i];
        }
        System.out.println("Dizideki sayının toplamı : "+toplam);*/







        //4: Bir dizideki sayıların ortalamasını hesaplayan bir Java programı yazın.
        /*int toplam=0;
        int[] dizi={25,31,2,54,89,32,78,6,98};
        int diziSayisi=dizi.length;
        for (int i=0; i<dizi.length; i++){
            toplam+=dizi[i];
        }
        System.out.println("Dizideki sayının toplamı : "+((float)toplam/diziSayisi));*/





        //5: Bir dizide belirli bir sayının kaç kez geçtiğini bulan bir Java programı yazın.
        /*int belirliSayi=32;
        int toplam=0;
        int[] dizi={25,32,31,2,54,89,32,78,6,32,98};
        for (int i=0; i<dizi.length; i++){
           if (belirliSayi==dizi[i]){
               toplam++;
           }
        }
        System.out.println("Dizideki belirli bir sayının kaç kez geçtiği : "+toplam);*/






        //6: Bir diziyi tersine çeviren bir Java programı yazın.
        /*int[] dizi={25,32,31,2,54,89,32,78,6,32,98};
        for (int i=dizi.length-1; i>=0; i--){
            System.out.print(dizi[i]+" ");
        }*/





        //BİRLEŞTİRME YAPAMADIM
        //7: İki diziyi birleştiren ve yeni bir dizi oluşturan bir Java programı yazın.
        /*int[] dizi1={10,12,14,16};
        int[] dizi2={18,20,22,24};*/







        //8: Bir diziyi küçükten büyüğe sıralayan bir Java programı yazın.
        /*int[] dizi={25,31,2,54,89,32,78,6,98};
        Arrays.sort(dizi);
        System.out.println("Küçükten büyüğe sıralama : ");
        for (int l : dizi){
            System.out.print(l+" ");
        }*/






        //9: Bir diziyi büyükten küçüğe sıralayan bir Java programı yazın.
        /*int[] dizi={25,31,2,54,89,32,78,6,98};
        Arrays.sort(dizi);
        System.out.println("Büyükten küçüğe sıralama : ");
        for (int i=dizi.length-1; i>=0; i--) {
            System.out.print(dizi[i] + " ");
        }*/





        //10:Bir dizideki tek sayıları bulan bir Java programı yazın.
       /* int[] dizi={25,31,2,54,89,32,78,19,6,3,98};
        System.out.println("Tek sayılar : ");
        for (int sayi : dizi){
            if (sayi%2==1) {
                System.out.print(sayi+" ");

            }
        }*/





        //11:Bir dizideki çift sayıları bulan bir Java programı yazın.
        /*int[] dizi={25,31,2,54,89,32,78,19,6,3,98};
        System.out.println("Çift sayılar : ");
        for (int sayi : dizi){
            if (sayi%2==0) {
                System.out.print(sayi+" ");
            }
        }*/






        //12:Bir diziyi kopyalayan bir Java programı yazın.
       /* int[] dizi={25,31,2,54,89,32,78,19,6,3,98};
        int[] kopyaDizi=new int[dizi.length];
        System.arraycopy(dizi,0 ,kopyaDizi,0 ,dizi.length);
        for (int k : kopyaDizi){
            System.out.print(k+" ");
        }*/







        //13:İki diziyi karşılaştıran ve aynı elemanlara sahip olup olmadığını kontrol eden bir Java programı yazın.
        /*int[] dizi1={10,12,14,16};
        int[] dizi2={10,12,14,16};
        if (Arrays.equals(dizi2,dizi1)){
            System.out.println("Dizi içeriği aynıdır.");
        }
        else {
            System.out.println("Dizi içeriği aynı değildir.");
        }*/





        //15:Bir dizideki elemanları ekrana yazdıran bir Java programı yazın.
        /*String[] eleman={"Jamshid","Mustafa","Saliha","Mehmet"};
        for (String e : eleman){
            System.out.print(e+" ");
        }*/





        Scanner scanner = new Scanner(System.in);
        //16:Bir diziyi belirli bir elemana göre arayan bir Java programı yazın.
       /* String[] eleman = {"S", "N", "E", "T", "S", "A", "L", "E"};
        System.out.println("Aramak istediğin elemanı gir.(orn:E)");
        String belirliEleman = scanner.nextLine();
        boolean var = false;
        for (String dizi : eleman) {
            if (belirliEleman.equals(dizi)) {
                var = true;
                break;
            } }
        if (var) {
            System.out.println("Aradğınız eleman bulunmaktadır.");
        } else {
            System.out.println("Aradığınız eleman bulunmamaktadır.");
        }*/







        //BİRLEŞTİRME YAPAMADIM
        //20: İki diziyi birleştirip, tekrar eden elemanları çıkaran bir Java programı yazın.
       /* String[] eleman = {"S", "N", "E", "T", "S", "A", "L", "E"};
        String yeniDizi="";
        for (String tekrar : eleman){
            if (yeniDizi.indexOf(tekrar)==-1){
                yeniDizi+=tekrar;
            }
        }
        System.out.println(yeniDizi);*/





        // ANLAMADIM
        //21:Bir diziyi belli bir değere göre filtreleyen bir Java programı yazın.


    }
}

