//Sas Gyula
//Az előző félév rajzos feladatának metódusokra bontása paraméterezéssel! A téglalapnál
//legyen paraméter a magasság, szélesség és az, hogy milyen jeleket rakunk belülre, de a
//keret mindig csillagokból álljon! A háromszögnél legyen paraméter a magasság!

package feladatokliraert;

public class ciklusok {
    public static void main(String[] args) {
        sorosFeladat(99);
        haromszog(5);
    }

    private static void sorosFeladat(int DB) {
        for (int i = DB; i > 0; i--) {
            System.out.println(i + "sör a falon");
            System.out.println(i + "sör");
            System.out.println("Vedd el az egyiket, add át");
        }
        System.out.println("Nincs több üveg sör a falon");
    }

    private static void haromszog(int magassag) {
        String kimenet;
        for (int i = 0; i < magassag; i++) {
            kimenet += "*" * i;
        }
    }
}
