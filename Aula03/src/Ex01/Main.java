package Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto(1, "arroz", 25.90);
        System.out.println(p.getDados());
        p.aumentarValor(25);
        System.out.println(p.getDados());
    }
}
