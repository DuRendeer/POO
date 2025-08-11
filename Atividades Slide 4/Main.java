public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Turma da Monica");
        livro.setAutor("Mauricio de Souza");
        livro.setAno(1973);
        System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " (" + livro.getAno() + ")");
        
        Aluno aluno = new Aluno();
        aluno.setNome("Bernardo");
        aluno.adicionarNota(8.5);
        System.out.println("Aluno " + aluno.getNome() + ", Nota: " + aluno.consultarNota());
        aluno.retirarNota(1.5);
        System.out.println("Nota apos reducao: " + aluno.consultarNota());
        
        Animal animal = new Animal();
        animal.mudarNome("TsaTsa");
        animal.setEspecie("Cachorro");
        System.out.println(animal.consultarDados());
    }
}