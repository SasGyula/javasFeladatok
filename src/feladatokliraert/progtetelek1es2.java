//Sas Gyula

//Progtételek I
//Az előző félév feladatai közül az 1-3 pontok alapján létrehozott tömb, minden lépést
//metódusokba szervezve! Továbbá az összes programozói tétel elkészítése külön
//metódusban (összesen 8 metódust kell bemutatni, egyénileg választott T
//tulajdonsággal)!

//Progtételek II
//Az előző feladat tömbjében (metódussal feltöltve, generálva, kiíratva) metódusokba
//szervezve keressünk:
//• prím számot
//• tökéletes számot
//Azt is adjuk meg, hogy minden elem prím illetve minden elem tökéletes szám e!




package feladatokliraert;

import java.util.Random;
import java.util.Scanner;

public class progtetelek1es2 {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] tomb = feltoltes(5);
        bekeres(tomb);
        kiirasok(tomb);
        progtetelek(tomb);
    }

    private static void kiirasok(int[] tomb) {
        kiiras(kimenet(tomb));
        kiiras(vanE13(tomb));//eldöntés
        kiiras(primEOsszes(tomb));//eldöntés 2
        kiiras(tokeletesEOsszes(tomb));//eldöntés 2
    }
    static int[] feltoltes(int DB){
        int[] tomb = new int[DB];
        for (int i = 0; i < DB; i++) {
            tomb[i] = rnd.nextInt(-5,16);
        }
        tomb[2] = 6;
        return tomb;
    }
    static String kimenet(int[] tomb){
        String kimenet = "";
        for (int i = 0; i < tomb.length; i++) {
            kimenet += tomb[i] + " ";
        }
        return kimenet;
    }
    static String vanE13(int[] tomb){
        boolean vanE = false;
        String kimenet;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] == 13){
                vanE = true;
            }
        }
        if(vanE){
            kimenet = "Van 13as.";
        }else{
            kimenet = "Nincs 13as";
        }
        return kimenet;
    }
    static void bekeres(int[] tomb){
        System.out.print("Szám(0 vagy tömb hossza-1 között): ");
        int szam = sc.nextInt();
        while(szam > tomb.length-1 || szam < 0){
            System.out.print("Szám(0 és tömb hossza-1 között): ");
            szam = sc.nextInt();
        }
        boolean vanOsztó = false;
        for (int i = 2; i < tomb[szam]; i++) {
            if(tomb[szam] % i == 0){
                System.out.print(i + " ");
                vanOsztó = true;
            }
        }
        System.out.print("\n");
        if(!vanOsztó){
            System.out.println("Prím szám!");
        }

    }
    static void kiiras(String uzenet){
        System.out.print(uzenet + "\n");
    }
    static int primE(int [] tomb){
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            boolean primE;
            if(tomb[i] < 2){
                primE = false;
            }else{
                int j = 2;
                while(j <= Math.sqrt(tomb[i]) && tomb[i] % j !=0){
                    j++;
                }
                primE = j>Math.sqrt(tomb[i]);
            }
            if(primE){
                db++;
            }
        }
        if(db>0){
            System.out.println(db + " darab prím van benne!");
        }else{
            System.out.println("Nincs benne prím!");
        }
        return db;
    }
    static String primEOsszes(int[] tomb){
        String kimenet;
        int db = tomb.length;
        int primekSzama = primE(tomb);
        if(db == primekSzama){
            kimenet = "Az összes prím!";
        }else{
            kimenet = "Nem az összer prím!";
        }
        return kimenet;
    }
    static int tokeletesE(int[] tomb){
        boolean tokeletesE;
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            int atlag = 0;
            for (int j = 1; j < tomb[i]-1; j++) {
                if(tomb[i] % j == 0){
                    atlag += j;
                }
            }
            tokeletesE = atlag == tomb[i];
            if(tokeletesE){
                db += 1;
            }
        }
        if(db > 0){
            System.out.println(db + " darab tökéletes szám van benne!");
        }else{
            System.out.println("Nincs benne tökéletes szám!"); 
        }
        return db;
    }
    static String tokeletesEOsszes(int[] tomb){
        String kimenet;
        int db = tomb.length;
        int tokeletesEOsszes = tokeletesE(tomb);
        if(db == tokeletesEOsszes){
            kimenet = "Az összes tökéletes szám";
        }else{
            kimenet = "Nem az összes tökéletes szám";
        }
        return kimenet;
    }

    private static void progtetelek(int[] tomb) {
       //eldöntés tétel - vanE13
       //eldöntés 2 - primEÖsszes, tokeletesEOsszes
       //lineáris keresés - primE
       osszegzes(tomb);
       megszamlalas(tomb);
       minKivalasztas(tomb);
       maxKivalasztas(tomb);
       kivalasztas(tomb);
    }

    private static void osszegzes(int[] tomb) {
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        System.out.println("A tömb elemeinek összege "+osszeg);
    }

    private static void megszamlalas(int[] tomb){
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            db+=1;
        }
        System.out.println("A tömb hossza " + db);
    }

    private static void minKivalasztas(int[] tomb) {
        int min = 0;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] < min){
                min = tomb[i];
            }
        }
        System.out.println("A tömb legkisebb értéke " + min);
    }
    
    private static void maxKivalasztas(int[] tomb) {
        int max = 0;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] > max){
                max = tomb[i];
            }
        }
        System.out.println("A tömb legnagyobb értéke " + max);
    }

    private static void kivalasztas(int[] tomb) {
        boolean kettovelOszthato = false;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] % 2 == 0){
                kettovelOszthato = true;
            }
        }
        System.out.print(kettovelOszthato ? "Van kettővel oszható" : "Nincs kettővel osztható!");
    }
   
}
