package poo_lista02_unidade1;
public class Triangulo {
    double lado1, lado2, lado3;
    String descricao = "";

    void inicializaTriangulo(double l1, double l2, double l3, String desc){
        lado1 = l1; lado2 = l2; lado3 = l3;
        descricao = desc;
    }

    double calculaPerimetro(){
        return (lado1 + lado2 + lado3);
    }
}
