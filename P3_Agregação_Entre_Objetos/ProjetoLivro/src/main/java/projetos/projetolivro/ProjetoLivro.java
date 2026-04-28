package projetos.projetolivro;
public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Raphael", 29, "Masculino");
        
        l[0] = new Livro("Harry potter", "J.K", 256, p[0]);
        
        l[0].abrir();
        l[0].folhear(256);
        System.out.println(l[0].detalhes());
        
    }
}
