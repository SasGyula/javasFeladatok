//Sas Gyula
//Az előző félév feladati alapján metódusokba szervezve az összes feladatot, a bekérést is!

package feladatokliraert;

import java.util.Arrays;
import java.util.Scanner;
public class valtozokElagazasok {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("A: ");
        double a = bekeres();
        System.out.print("B: ");
        double b = bekeres();
        System.out.print("C: ");
        double c = bekeres();
        fuggvenyek(a, b, c);
    }

    private static void fuggvenyek(double a, double b, double c) {
        sorbarak(a, b, c);
        relacio(a, b);
        csere(a,b);
        oszthatosag(a, b);
        kor(a);
        haromszog(a,b);
        haromszog2(a, b, c);
        matek(a, b, c);
    }
    static double bekeres(){
        double a = sc.nextDouble();
        return a;
    }
    static void sorbarak(double a, double b, double c){
        double[] szamok = {a, b, c};
        Arrays.sort(szamok);
        for (int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + " ");
        }
    }
    static void relacio(double a, double b){
        if(a < b){
            System.out.println("\n" + a + " < " + b);
        }else if(a > b){
            System.out.println("\n" + a + " > " + b);
        }else{
            System.out.println("\n" + a + " = " + b);
        }
    }
    static void csere(double a, double b){
        double csere = a;
        a = b;
        b = csere;
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
    static void oszthatosag(double a, double b){
        int c = (int) a;
        int d = (int) b;
        if(c % d == 0){
            System.out.println(c+ " osztható " + d +"-val/vel");
        }else{
            System.out.println(c+ " nem osztható " + d +"-val/vel");
        }
    }
    static void kor(double a){
        double kerulet = 2 * Math.PI * a;
        double terulet = Math.PI * a * a;
        System.out.printf("A kör kerülete: %.2f \n" , kerulet);
        System.out.printf("A kör területe: %.2f \n" , terulet);
    }
    static void haromszog(double a, double b){
        double c = Math.sqrt(a * a + b * b);
        System.out.printf("Az átfogó %.2f \n" , c);
    }
    static void haromszog2(double a, double b, double c){
        if(a + b > c && a + c > b && b + c > a){
            System.out.println("Szerkezthető háromszöget ad");
        }else{
            System.out.println("Nem ad szerkezthető háromszöget");
        }
    }
    static void matek(double a, double b, double c){
        double[] szamok = {a, b, c};
        double atlag = 0;
        double mertaniKozep = 1;
        for (int i = 0; i < szamok.length; i++) {
            atlag += szamok[i];
            mertaniKozep *= szamok[i];
        }
        atlag = atlag/ szamok.length;
        mertaniKozep = Math.pow(mertaniKozep, 1.0 / szamok.length);
        System.out.printf("A számok számtani közepe %.2f \n" , atlag);
        System.out.printf("A számok mértani közepe %.2f \n" , mertaniKozep);
    }
//    static void monogram(){
//        String vezeteknev = sc.nextLine();
//        String keresztnev = sc.nextLine();
//        
//    }
}
