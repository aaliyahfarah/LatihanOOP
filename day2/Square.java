package day2;

public class Square extends Shape {
    public Square() {
        super(); 
    }

    public Square(Float side) {
        this.side = side;
    }

    public Float side;

    // public Float process(Float side) {
    //     return side * side;
    // }


    public void result(String name, String type){
        super.result(name, type);
        if(type.equalsIgnoreCase("area")){
            System.out.println(side*side); 
        }
        else if(type.equalsIgnoreCase("around")){
            System.out.println(4 * side);
        }
        else{
            System.out.println(side * side * side);
        }
    }
}

