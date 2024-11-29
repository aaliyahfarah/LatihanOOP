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

    public Float process(Float r, String type){
        if(type.equalsIgnoreCase("area")){
            return phi * r * r; 
        }
        else if(type.equalsIgnoreCase("around")){
            return 4 * phi * r;
        }
        else{
            return (4/3) * phi * r * r * r;
        }
    }

    public void result(String name, String type){
        super.result(name, type);
        System.out.println(process(r, type));
    }
}
