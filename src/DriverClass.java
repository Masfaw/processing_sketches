import processing.core.PApplet;

public class DriverClass extends PApplet {

    public static void main(String[] args){
        PApplet.main("DriverClass");
    }


    public void settings(){
        System.out.println("This function has run");
    }

    public void setup(){
        System.out.println("Start of Setup");
        size(600,600);
        fill(200,50,240);
    }

    public void draw(){
        ellipse(mouseX,mouseY,second()*2,second()*2);
    }

}
