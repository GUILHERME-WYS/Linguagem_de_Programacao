public class Main {
    public static void main(String[] args) throws InterruptedException {
        int largura = 70;
        int altura = 20;
        double tempo = 0;

        // Loop principal da animação complexa
        while (true) {
            StringBuilder frame = new StringBuilder();
            
            // Limpa a tela usando o comando ANSI do terminal (mais eficiente que pular linhas)
            frame.append("\033[H\033[2J"); 

            for (int y = 0; y < altura; y++) {
                for (int x = 0; x < largura; x++) {
                    // Normaliza as coordenadas de tela entre -1.0 e 1.0
                    double nx = (x / (double) largura) * 2.0 - 1.0;
                    double ny = (y / (double) altura) * 2.0 - 1.0;

                    // Aplica uma fórmula matemática de interferência de ondas senoidais tridimensionais
                    double valorOnda = Math.sin(nx * 4.0 + tempo) * Math.cos(ny * 4.0 + tempo * 0.5);
                    valorOnda += Math.sin(Math.sqrt(nx * nx + ny * ny) * 8.0 - tempo * 1.5);
                    
                    // Mapeia o resultado matemático para um caractere com base na "luminosidade"
                    char caractere;
                    if (valorOnda > 1.2)       caractere = '@';
                    else if (valorOnda > 0.8)  caractere = '#';
                    else if (valorOnda > 0.4)  caractere = '*';
                    else if (valorOnda > 0.0)  caractere = '+';
                    else if (valorOnda > -0.4) caractere = '=';
                    else if (valorOnda > -0.8) caractere = ':';
                    else                       caractere = '.';

                    frame.append(caractere);
                }
                frame.append("\n");
            }

            // Exibe o frame renderizado de uma só vez para evitar flickering (piscadas na tela)
            System.out.print(frame.toString());

            tempo += 0.15; // Velocidade da evolução do tempo (física)
            Thread.sleep(40); // Roda a aproximadamente 25 quadros por segundo (FPS)
        }
    }
}
