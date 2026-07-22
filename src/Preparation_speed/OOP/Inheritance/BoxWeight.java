package Preparation_speed.OOP.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//Call the parent class constructor.
        //used to initialise value present in parent class.
        this.weight = weight;
    }
}
