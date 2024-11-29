package day2;

public class Triangle extends Shape {
    public Triangle(){
        super();
    }

    public Triangle(Float base, Float height) {
        this.base = base;
        this.height = height;
    }    

    public Triangle(Float side) {
        this.side = side;
    }
    
    public Triangle(Float base, Float height, Float prismHeight) {
        this.base = base;
        this.height = height;
        this.prismHeight = prismHeight;
    }

    public Float base, height, side, prismHeight;

    public Float process(Float base, Float height) {
        return 0.5f * base * height;
    }

    public Float process(Float side) {
        return 3f * side;
    }

    public Float process(Float base, Float height, Float prismHeight){
        return ((base * height) / 2) * prismHeight;
    }

    public void result(String name, String type){
        super.result(name, type);
        if(type.equalsIgnoreCase("area")){
            System.out.println(process(base, height));
        }
        else if(type.equalsIgnoreCase("around")){
            System.out.println(process(base, height, prismHeight));
        }
        else{
            System.out.println(process(base, height, prismHeight));
        }
    }
}

