package projetos.pessoas;
public class Pessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Raphael");
        p2.setNome("Maria");
        p3.setNome("Raimundo");
        p4.setNome("Marco");
        
        p1.setIdade(29);
        p2.setIdade(60);
        p3.setIdade(20);
        p4.setIdade(40);
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("TODES");
        
        p2.setCurso("Gastronomia");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
