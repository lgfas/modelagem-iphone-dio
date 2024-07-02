public class Iphone implements MusicPlayer, Telephone, InternetBrowser {

    @Override
    public void tocar() {
        // Implementação do método tocar
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        // Implementação do método pausar
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação do método selecionarMusica
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        // Implementação do método ligar
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        // Implementação do método atender
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação do método iniciarCorreioVoz
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação do método exibirPagina
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação do método adicionarNovaAba
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        // Implementação do método atualizarPagina
        System.out.println("Atualizando página");
    }
}
