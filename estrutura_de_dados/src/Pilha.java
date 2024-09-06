import javax.swing.*;

public class Pilha {

    public static void main(String[] args) {
        Pilha intPilha = new Pilha(5);
        int i;
        int entrada;

        for (i = 1; i <= 5 ; i++) {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            intPilha.Empilhar(entrada);
        }
        intPilha.MostrarPilha();
        System.exit(0);
    }
    
    int topo, tamanho, vetor[];

    Pilha (int tam){
        topo = -1;
        tamanho = tam;
        vetor = new int[tam];
    }
    public boolean PilhaVazia(){
        if (topo == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean PilhaCheia(){
        if (topo >= tamanho-1){
            return true;
        }else {
            return false;
        }
    }

    public void Empilhar(int elemento){
        if (!PilhaCheia()){
            topo = topo + 1;
            vetor[topo] = elemento;
        }else {
            System.out.println("Pilha cheia");
        }
    }

    public int Desempilhar(){
        int desemplilhado = 0;
        if (PilhaVazia()){
            System.out.println("Pilha vazia");
        }else {
            desemplilhado = vetor[topo];
            topo = topo - 1;
        }
        return desemplilhado;
    }

    public void ElementoTopo(){
        if (topo >= 0){
            System.out.println("O elemento do topo é " + vetor[topo]);
        }else {
            System.out.println("Pilha vazia");
        }
    }

    public void MostrarPilha(){
        int i;

        for (i = topo; i >= 0 ; i--){
            System.out.println("Elemento " + vetor[i] + " posição " + i + " da pilha");
        }
    }
}
