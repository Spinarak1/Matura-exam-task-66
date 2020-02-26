public class Trojka {
    public int a;
    public int b;
    public int c;
    public Trojka(){}
    public Trojka(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean czyTrojkatna(){
        if(a + b > c && a + c > b && b + c > a)
            return true;
        else
            return false;
    }
    @Override
    public String toString(){
        return ""+a+" "+b+" "+c;
    }
}
