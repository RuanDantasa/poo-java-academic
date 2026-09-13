public class Exercicio18 {
    public static void main(String[] args) {
        int res = potencia(3, 4);

        System.out.println("Resultado: " + res);
    }

    public static int potencia(int base, int expoente){
        if(expoente == 1){
            return base;
        }else {
            return base * potencia(base, expoente - 1);
        }
    }
}
