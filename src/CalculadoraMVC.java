import Controller.CalculadoraController;
import model.CalculadoraModel;
import view.CalculadoraView;

public class CalculadoraMVC {
    public static void main(String[] args) {
        CalculadoraView theView = new CalculadoraView();

        CalculadoraModel theModel = new CalculadoraModel();

        CalculadoraController theController = new CalculadoraController (theView,theModel);

        theView.setVisible(true);
    }
}
