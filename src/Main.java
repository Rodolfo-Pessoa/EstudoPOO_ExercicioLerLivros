import Pessoa.Pessoa;
import Pessoa.Livros;

public class Main {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livros[] l = new Livros[3];

        p[0] = new Pessoa("Maria", 30, "feminino");
        p[1] = new Pessoa("João", 29, "Masculino");


        l[0] = new Livros("POO java iniciante","Guanaraba", 400, p[0]);
        l[1] = new Livros("POO java intermédio", "N.Alves", 500, p[1]);
        l[2] = new Livros("POO java avançado", "AlgaWorks", 600, p[0]);

        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
    }
}