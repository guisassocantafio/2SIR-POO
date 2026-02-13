import java.util.Scanner;

public class Aluno {
    //Atributos ou variaveis de instancia (*objeto)
    int rm;
    String nome;
    String curso;
    double nota1;
    double nota2;

    public double calcularMedia(){
        double media;
        media = (nota1 + nota2) / 2;
        return media;
    }

    public String calcularSituacao(){
        if (calcularMedia() >= 6){
            return "Aprovado";
        }
        return "Reprovado";
    }

}
