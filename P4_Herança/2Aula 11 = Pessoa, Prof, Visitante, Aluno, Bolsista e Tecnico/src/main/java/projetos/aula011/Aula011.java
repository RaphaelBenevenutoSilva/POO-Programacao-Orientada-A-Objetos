package projetos.aula011;

public class Aula011 {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.PagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Juca");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.PagarMensalidade();
        System.out.println(b1.toString());
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Raphael");
        t1.setRegistroProfissional(3);
        t1.praticar();
        System.out.println(t1.toString());
        
        Professor p1 = new Professor();
        p1.setNome("Carlos");
        p1.setEspecialidade("Medicina");
        p1.setSalario(10000);
        p1.receberAumento(2000);
        System.out.println(p1.toString());
        
        
        
        
    }
}
