package view;


import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculadoraView extends JFrame{

    private JTextField primeiroNumero  = new JTextField(10);
    private JLabel adicaoLabel = new JLabel("+");
    private JTextField segundoNumero = new JTextField(10);
    private JButton calculeBotao = new JButton("Calcular");
    private JTextField calculoSolucao = new JTextField(10);

    public CalculadoraView(){

        // inicializa a view e os componentes

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(primeiroNumero);
        calcPanel.add(adicaoLabel);
        calcPanel.add(segundoNumero);
        calcPanel.add(calculeBotao);
        calcPanel.add(calculoSolucao);

        this.add(calcPanel);

        // fim da inicializacao dos componentes-----

    }

    public int getprimeiroNumero(){

        return Integer.parseInt(primeiroNumero.getText());

    }

    public int getsegundoNumero(){

        return Integer.parseInt(segundoNumero.getText());

    }

    public int getcalculoSolucao(){

        return Integer.parseInt(calculoSolucao.getText());

    }

    public void setcalculoSolucao(int solution){

        calculoSolucao.setText(Integer.toString(solution));

    }

    // se o  calculeBotao for clicado execute o metodo
    // no controller

    public void addCalculateListener(ActionListener listenForCalcButton){

        calculeBotao.addActionListener(listenForCalcButton);

    }

    // abre um popup que contem a mensagen de erro

    public void mostrarMensagenErro(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}