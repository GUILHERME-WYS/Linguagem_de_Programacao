public class Dezoito {
    public static void main(String[] args) {
        String[] nomes = {
            "Latigo Daqui Silva",
            "César Telo",
            "Bispo de Paris",
            "Antônio Morrendo das Dores",
            "Rolando Escada Abaixo Santos",
            "Amazonas Rio do Brasil Pimpão",
            "Amim Amou Amado Pinto",
            "Amado Amoroso",
            "Inocêncio Coitadinho",
            "Maria Privada de Jesus",
            "Zélia TocaFundo Pinto"
        };

        boolean encontrado = false;

        for (String nome : nomes) {
            if (nome.equals("Bispo de Paris")) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado!");
        }
    }
}
