package Controller;

import model.CalculadoraModel;
import view.CalculadoraView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// O controller cordena as interacoes
// entre a view e o model

public class CalculadoraController {

    private CalculadoraView theView;
    private CalculadoraModel theModel;

    public CalculadoraController(CalculadoraView theView, CalculadoraModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // informa a view que quando o botao calcular
        // for clicado executa o metodo actionPerformed
        // do calculateListener
        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            int primeiroNumero, segundoNumero = 0;

            // coloca as interacoes da view em um bloco try catch
            // para caso os nomes nao serem devidamente inseridos
         

            try{

                primeiroNumero = theView.getprimeiroNumero();
                segundoNumero = theView.getsegundoNumero();

                theModel.addDoisNumeros(primeiroNumero, segundoNumero);

                theView.setcalculoSolucao(theModel.getcalculadoraValor());

            }

            catch(NumberFormatException ex){

                System.out.println(ex);

                theView.mostrarMensagenErro("Introduza dois numeros inteiros");

            }

        }

    }

}
