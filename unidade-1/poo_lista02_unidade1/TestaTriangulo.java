package poo_lista02_unidade1;

public class TestaTriangulo {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        Triangulo t3 = new Triangulo();

        t1.inicializaTriangulo(3, 4, 5, null);
        t2.inicializaTriangulo(3, 4, 5, null);

        t3 = t1;

        System.out.println("Perimetro de t1: " + t1.calculaPerimetro());
        System.out.println("Perimetro de t2: " + t2.calculaPerimetro());
        System.out.println("Perimetro de t3: " + t3.calculaPerimetro());

        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
    }
}
