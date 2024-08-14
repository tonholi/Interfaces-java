import iPhone.Iphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Testando funcionalidades de aparelho telefonico.
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar("998455580");
        System.out.println("-------------------------------");

        //Testando funcionalidades de navegador internet
        iphone.exibirPagina("youtube.com.br");
        iphone.atualizarPagina();
        iphone.adicionarNovaPagina();
        System.out.println("-------------------------------");

        //Testando funcionalidades de Reprodutor musical
        iphone.selecionarMusica("Bring me to life - Evanescense");
        iphone.pausar();
        iphone.tocar();
        System.out.println("-------------------------------");
    }
}