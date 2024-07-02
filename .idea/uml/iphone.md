# Diagrama UML do iPhone

```mermaid
classDiagram
    class MusicPlayer {
        +tocar(): void
        +pausar(): void
        +selecionarMusica(musica: String): void
    }

    class Telephone {
        +ligar(numero: String): void
        +atender(): void
        +iniciarCorreioVoz(): void
    }

    class InternetBrowser {
        +exibirPagina(String url): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    class iPhone implements MusicPlayer, Telephone, InternetBrowser {
        +tocar(): void
        +pausar(): void
        +selecionarMusica(musica: String): void
        +ligar(numero: String): void
        +atender(): void
        +iniciarCorreioVoz(): void
        +exibirPagina(url: String): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }
