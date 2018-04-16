public class Main {

    public static void main(String[] args)
    {
        Model model = new Model();
        Controller mainController = new Controller(model);
        //ChildController childController = new ChildController(model);
        //model.childCtrl = childController;
        model.ctrl = mainController;

        mainController.start();
    }

}
