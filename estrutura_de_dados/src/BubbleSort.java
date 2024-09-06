public class BubbleSort {

    public static int[] Bolha(int numeros []){
        final int n = numeros.length;
        int aux;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++) {
                if (numeros[j] > numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }

        return numeros;
    }

    public static void main(String[] args) {
        int i, vet [] = {9, 7, 10, 3, 1, 5, 4, 12, 14, 11, 19, 20};

        vet = Bolha(vet);

        for (i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }

        System.exit(0);


    }

}
