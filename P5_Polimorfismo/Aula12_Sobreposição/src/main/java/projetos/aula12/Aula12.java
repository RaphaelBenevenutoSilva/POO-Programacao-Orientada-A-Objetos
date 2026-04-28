package projetos.aula12;

public class Aula12 {

    public static void main(String[] args) {
        // Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        c.locomover();
        k.locomover();
        c.locomover();
        k.emitirSom();

    }
}
