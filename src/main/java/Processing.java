import processing.core.PApplet;
public class Processing extends PApplet {
    int width = 700;
    int height = 500;
    int x=0;
    int y=0,z=0,w=0;
    public static void main(String[] args) {
        PApplet.main("Processing",args);
    }
    public void settings(){
        super.settings();
        size(width, height);
    }
//    public void draw(){
//        ellipse(w,height/5,50,50);
//        ellipse(x,2*height/5,50,50);
//        ellipse(y,3*height/5,50,50);
//        ellipse(z,4*height/5,50,50);
//        w+=1;
//        x+=2;
//        y+=3;
//        z+=4;
//    }
}
