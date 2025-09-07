public class Main {
    public static void main(String[] args) {
        Autenticavel usuario = new Usuario("Bernardo", "123456");
        Autenticavel admin = new Administrador("Manga", "admin69");

        System.out.println("Usuario senha certa: " + usuario.autenticar("123456"));
        System.out.println("Usuario senha errada: " + usuario.autenticar("senha_errada"));
        System.out.println("Admin senha certa: " + admin.autenticar("admin69"));
        System.out.println("Admin senha errada: " + admin.autenticar("senha_errada"));
    }
}