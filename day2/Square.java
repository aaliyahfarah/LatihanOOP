package day2;

public class Square extends Shape {
    public Square() {
        super(); 
    }

    public Square(Float side) {
        this.side = side;
    }

    public Float side;

    public Float process(String type, Float side) {
        if(type.equalsIgnoreCase("area")){
            return side*side; 
        }
        else if(type.equalsIgnoreCase("around")){
            return 4 * side;
        }
        else{
            return side * side * side;
        }
    }


    public void result(String name, String type){
        super.result(name, type);
        if(type.equalsIgnoreCase("area")){
            System.out.println(process(type, side));
        }
    }
}

