### Desafio proposto

Responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo as funcionalidades com Reprodutor musical, aparelho telefônico e navegador de internet e então implementar em Java.

## UML

```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class Iphone {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet

```