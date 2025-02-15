public class Basics {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1.
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Strudent {
    String name ;
    int age; 
    float percentage;

    void calcPercentage ( int phy, int chem, int math) {
        percentage = (phy + chem + math ) / 3;
    }
}

// Output-
// Blue
// 5
// Yellow