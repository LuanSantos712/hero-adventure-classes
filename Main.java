class Heroi {
    String nome;
    int idade;
    String tipo;

    // Construtor da classe
    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método responsável pelo ataque
    public void atacar() {
        String ataque;

        if (tipo.equalsIgnoreCase("mago")) {
            ataque = "magia";
        } else if (tipo.equalsIgnoreCase("guerreiro")) {
            ataque = "espada";
        } else if (tipo.equalsIgnoreCase("monge")) {
            ataque = "artes marciais";
        } else if (tipo.equalsIgnoreCase("ninja")) {
            ataque = "shuriken";
        } else {
            ataque = "ataque desconhecido";
        }

        System.out.println(
            tipo + " atacou usando " + ataque
        );
    }
}

public class Main {
    public static void main(String[] args) {

        // Criação dos objetos
        Heroi heroi1 = new Heroi("Aragorn", 35, "guerreiro");
        Heroi heroi2 = new Heroi("Merlin", 70, "mago");
        Heroi heroi3 = new Heroi("Bruce", 30, "monge");
        Heroi heroi4 = new Heroi("Hanzo", 25, "ninja");

        // Armazenamento dos objetos em um array
        Heroi[] herois = {
            heroi1, heroi2, heroi3, heroi4
        };

        // Laço de repetição para executar os ataques
        for (Heroi heroi : herois) {
            heroi.atacar();
        }
    }
}
