public class IPhone implements NavegadorDeInternet, ReprodutorMusical, AparelhoTelefonico  {


    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
       
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Musica - " + musica);
        this.tocar();
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando a pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no navegador");

    }

    @Override
    public void ligar(String numero) {
        System.out.println("Voce esta ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
}
