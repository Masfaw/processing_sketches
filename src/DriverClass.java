import igeo.IG;
import igeo.IPoint;
import processing.core.PApplet;

import java.util.ArrayList;

//import igeo.IPoint;


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
        ArrayList<IPoint> pointsList = new ArrayList<>();

        int min = -64;
        int max = 64;

        for (int i = min; i < max ; i++){
            for (int j = min; j < max ; j++ ){
                int k = i^j;
                pointsList.add(new IPoint(i,j,k)) ;

            }
        }


//        for(int i=0; i < 10; i++){
//            for(int j=0; j < 10; j++){
//                for( int k =0; k< 10; k++){
//                    new IPoint(i*10, j*10, k*10).clr(i*0.1, j*0.1, k*.1);
//
//                }
//            }
//        }

//        for(int i=0; i < 40; i++){
//
//            int ynum = IRandom.getInt(10, 40);
//            for(int j=0; j < ynum; j++){
//
//                int znum = IRandom.getInt(20-j, 40-j);
//                for(int k=0; k < znum; k++){
//
//                    double size = IRandom.get(2.5, 10.0);
//                    double x=i*10, y=j*10, z=k*2;
//                    new ISurface(x, y, z, x+size, y, z,
//                            x+size, y+size, z, x, y+size, z)
//                            .clr(k*0.05, k*0.05, 0);
//                }
//            }
//        }

//        System.out.println("Start of Setup");
//        size(600,600);
//        fill(200,50,240);
    }

    public void draw(){
//        System.out.println("in draw");

//         ellipse(mouseX,mouseY,second()*2,second()*2);
    }

}
