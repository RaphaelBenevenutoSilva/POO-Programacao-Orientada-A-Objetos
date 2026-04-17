package projetos.aula011;

public class Tecnico extends Aluno {

    private int registroProfissional;

    public void praticar() {
        int s = 5;
        int r = s - this.registroProfissional;       
        
        System.out.printf("\nAinda restam %d anos para se forma como tecnico, ao total são %d anos de curso\n", r, s);
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTecnico{" + "Registro Profissional = " + registroProfissional + " anos" + '}';
    }
    
}
