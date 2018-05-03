import igeo.IG;
import processing.core.PApplet;
//import igeo.IPoint;
import igeo.*;


public class DriverClass extends PApplet {

    public static void main(String[] args){
        PApplet.main("DriverClass");
    }


    public void settings(){
        System.out.println("This function has run");
    }

    public void setup(){
        size( 480, 360, IG.GL );
        System.out.println("in Setup");


        for(int i=0; i < 10; i++){
            for(int j=0; j < 10; j++){
                new IPoint(i*10, j*10, 0).clr(i*0.1, j*0.1, 0);
            }
        }


//        System.out.println("Start of Setup");
//        size(600,600);
//        fill(200,50,240);
    }

    public void draw(){
//        System.out.println("in draw");

//         ellipse(mouseX,mouseY,second()*2,second()*2);
    }

}
