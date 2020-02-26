import java.io.PrintWriter;

public class Main {
    public static void main(){
    }
    public static int sumaCyfr(int a){
        int suma = 0;
        while(a>0){
            suma += a%10;
            a = a/10;
        }
        return suma;
    }
    public static boolean czyRowneOstatniej(Trojka t){
        if(sumaCyfr(t.a) + sumaCyfr(t.b) == t.c){
            return true;
        }
        else
            return false;
    }
    public static boolean czyPierwsza(int a) {
        if (a <= 1) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static boolean czyRownyMnoznik(Trojka t){
        if(czyPierwsza(t.a) && czyPierwsza(t.b) && t.c == t.b * t.a)
            return true;
        else
            return false;
    }
    public static boolean czyTrojkatProstokatny(Trojka t){
        if(t.a*t.a + t.b*t.b == t.c*t.c || t.a*t.a == t.b*t.b + t.c*t.c || t.a*t.a + t.c*t.c == t.b*t.b)
            return true;
        else
            return false;
    }
    public static void zad63(Trojka[] t, PrintWriter pw){
        /*for(int i = 0; i<t.length - 1; i++){
            if(czyTrojkatProstokatny(t[i]) && czyTrojkatProstokatny(t[i+1]))
                pw.print(t[i]+"\n"+t[i+1]);
        }*/
        boolean poprzedniProstokatny = false;
        for(int i = 0; i<t.length; i++){
            if(czyTrojkatProstokatny(t[i])) {
                if (poprzedniProstokatny == true)
                    pw.print(t[i-1]+"\n"+t[i]);
                poprzedniProstokatny = true;
            }
            else
                poprzedniProstokatny = false;
        }
    }
    public static int[] zad664(Trojka[] t){
        int[] tab = new int[2];
        int licznik = 0;
        int najdluzszy = 0;
        int licznikCiagu = 0;
        for(int i = 0; i<t.length; i++){
            if(t[i].czyTrojkatna() == true) {
                licznik++;
                licznikCiagu++;
            }else {
                if(najdluzszy< licznikCiagu)
                    najdluzszy = licznikCiagu;
                licznikCiagu = 0;
            }
        }
        if(najdluzszy< licznikCiagu)
            najdluzszy = licznikCiagu;
        licznikCiagu = 0;
        tab[0] = licznik;
        tab[1] = najdluzszy;
        return tab;
    }
}
