package poo_lista02_unidade1;


// Classe Maior
public class Maior {
    public static int maxI(int a, int b){
        return (a > b) ? a : b;
    }

    public static int maxI(int a, int b, int c){
        return maxI(maxI(a,b), c);
    }

    public static int maxI(int a, int b, int c, int d){
        return maxI(maxI(a,b, c), d);
    }

    public static int maxI(int a, int b, int c, int d, int e){
        return maxI(maxI(a,b, c, d), e);
    }

    public static double maxD(double a, double b){
        return ((a > b) ? a : b);
    }

    public static double maxD(double a, double b, double c){
        return maxD(maxD(a,b), c);
    }

    public static double maxD(double a, double b, double c, double d){
        return maxD(maxD(a,b, c), d);
    }

    public static double maxD(double a, double b, double c, double d, double e){
        return maxD(maxD(a,b, c, d), e);
    }


    // TestaMaior
    public static void main(String[] args) {

        System.out.println(Maior.maxI(1, 2, 3, 6, 5));
        System.out.println(Maior.maxD(2.0, 3.0, 4.0, 5.0, 6.0));
    }

}