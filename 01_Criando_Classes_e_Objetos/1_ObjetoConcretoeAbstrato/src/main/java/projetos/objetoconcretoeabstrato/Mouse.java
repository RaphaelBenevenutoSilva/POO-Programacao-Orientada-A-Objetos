package projetos.objetoconcretoeabstrato;
public class Mouse {
    public String modelo;
    public int dpi;
    public String cor;
    
    public void clicar() {
        if (this.dpi > 0) {
            System.out.printf("Cliquei com o %s (%s)\n", modelo, cor);
        } else {
            System.out.println("ERRO: Mouse sem DPI configurado");
        }
        
    }
    
    
}
