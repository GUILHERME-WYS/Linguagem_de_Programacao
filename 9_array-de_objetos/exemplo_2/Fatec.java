public class Fatec {
    public static void main(String[] args) {
        Aluno pessoa_1 = new Aluno("number_01","number_01@gmail.com");
        Aluno pessoa_2 = new Aluno("number_02", "number_02@gmail.com");
        Aluno pessoa_3 = new Aluno("number_03", "number_03@gmail.com");
        Aluno pessoa_4 = new Aluno("number_04", "number_04@gmail.com");

        Aluno [] fatec = {pessoa_1, pessoa_2, pessoa_3, pessoa_4};

        for(Aluno item: fatec){
            System.out.println("\no nome do aluno eh: " + item.nome);
            System.out.println("\no email do aluno eh: " + item.email);
        }
    }
    
}
