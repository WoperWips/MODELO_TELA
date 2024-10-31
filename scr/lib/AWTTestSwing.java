package scr.lib;
import javax.swing.*; // Importa as classes necessárias do pacote Swing
import java.awt.*; // Importa as classes necessárias do pacote AWT

/**
 * A classe AWTTestSwing demonstra a criação de uma interface gráfica simples
 * usando componentes Swing e AWT. A interface contém um rótulo, um campo de texto
 * e três botões dispostos em um layout específico.
 */
public class AWTTestSwing {
    /**
     * O método main é o ponto de entrada da aplicação. Ele configura a janela
     * e adiciona componentes a ela.
     *
     * @param args Argumentos da linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {

        // Criação da janela principal (JFrame) com título "AWTTestSwing"
        JFrame frame = new JFrame("AWTTestSwing");
        
        // Define o comportamento padrão ao fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Define o tamanho da janela (largura, altura)
        frame.setSize(400, 200);
        
        // Define o layout da janela como BorderLayout
        frame.setLayout(new BorderLayout());

        // Criação de um rótulo (JLabel) com o texto "Label"
        JLabel label = new JLabel("Label");
        
        // Criação de um campo de texto (JTextField) com 15 colunas
        JTextField textField1 = new JTextField(15);

        // Criação de um painel superior (JPanel) para o rótulo e o campo de texto
        JPanel topPanel = new JPanel();
        // Define o layout do painel superior como FlowLayout
        topPanel.setLayout(new FlowLayout());
        
        // Adiciona o rótulo e o campo de texto ao painel superior
        topPanel.add(label);
        topPanel.add(textField1);

        // Criação de três botões (JButton)
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Criação de um painel para os botões
        JPanel buttonPanel = new JPanel();
        // Define o layout do painel de botões como FlowLayout
        buttonPanel.setLayout(new FlowLayout());
        
        // Adiciona os botões ao painel de botões
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        // Adiciona o painel superior à parte norte (NORTH) da janela
        frame.add(topPanel, BorderLayout.NORTH);
        
        // Adiciona o painel de botões ao centro (CENTER) da janela
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Torna a janela visível
        frame.setVisible(true);
    }
}
