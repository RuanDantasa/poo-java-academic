public class Exercicio17 {
    public static void main(String[] args) {
        double a = 7000, b = 20000;
        int anos = 0;

        while (a < b){
            a = a + (0.35 * a);
            b = b + (0.1 * b);

            anos++;
        }

        System.out.println("Anos: " + anos);
    }
}