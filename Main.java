public class Main {

    public static void main(String[] args)
    {
        Model model = new Model();
        Controller mainController = new Controller(model);
        model.ctrl = mainController;

        mainController.start();
    }

}
