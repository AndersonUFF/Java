import java.util.*;

public class main {
    public static void main(String[] args){
        Pilha p = new Pilha();
        int info;
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um valor");
            info = read.nextInt();
            p = p.pilha_push(info,p);
        }
        System.out.println();
        System.out.println("Pilha antes do pop");
        p.imprimePilha(p);
        System.out.println();
        p = p.pilha_pop(p);
        System.out.println("Pilha depois do pop");
        p.imprimePilha(p);
    }
}
