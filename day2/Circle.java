package day2;


public class Circle extends Shape{
    public Circle(){
        super();
    }

    public Circle(Float r) {
        this.r = r;
    }

    public final Float phi = 3.14f;
    public Float r;

    public void result(String name, String type){
        super.result(name, type);
        if(type.equalsIgnoreCase("area")){
            System.out.println(phi * r * r); 
        }
        else if(type.equalsIgnoreCase("around")){
            System.out.println(4 * phi * r);
        }
        else{
            System.out.println( (4/3) * phi * r * r * r);
        }
    }
}
