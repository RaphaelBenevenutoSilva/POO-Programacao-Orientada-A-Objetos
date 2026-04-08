package projetos.objetoconcretoeabstrato;
public class ObjetoConcretoeAbstrato {
    
    public static void main(String[] args) {
        
        Mouse m1 = new Mouse();
        m1.modelo = "Logitech G Pro";
        m1.cor = "ROSA";
        m1.dpi = 400;
        m1.clicar();
        
        Estudo sessao = new Estudo();
        sessao.assunto = "POO em java";
        sessao.tempo = 60;
        sessao.programar();
       
    }
}
