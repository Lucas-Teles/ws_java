import javax.swing.*;

public class Recursao {
    static void fatP (int n, int x, int f){
        if (x == 0 || x == 1){
            System.out.println("O fatorial de " + n + " é " + f);
        }
        else {
            fatP(n, x-1, f*x);
        }
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você deseja saber o fatorial"));
        if (n < 0){
            System.out.println("Valor inválido");
            System.exit(0);
        }
        else {
            fatP(n, n, 1);
        }
        System.exit(0);
    }
}


