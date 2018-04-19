import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Model {
    ChildController childCtrl;
    Controller ctrl;
    private List<Log> data;
    //private List<JLabel> jLabels;

    //Model(ChildController logController) {
    //    this.childCtrl = logController;
    //    this.data = new ArrayList<>();
    //}

    Model(//Controller logController, ChildController logChildController
           ) {
        this.data = new ArrayList<>();
    }


    void addData(String s)
    {
        this.data.add(new Log(s));
    }
/*
    void addJLabel(JLabel j)
    {
        this.jLabels.add(j);
    }
*/
    void dumpData() {
        //this.data.add(new Log("Cos tam a"));
/*
        this.data.add(new Log("Cos tam b"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
        this.data.add(new Log("Cos tam c"));
*/


    }

    List<Log> getData() {
        return data;
    }

}