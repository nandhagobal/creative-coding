import processing.core.PApplet;
public class Processing extends PApplet {
    int width = 700;
    int height = 500;
    int speedOfBall1=0,speedOfBall2=0,speedOfBall3=0,speedOfBall4=0;
    public static void main(String[] args) {
        PApplet.main("Processing",args);
    }
    public void settings(){
        super.settings();
        size(width, height);
    }
    public void draw(){
        ellipse(speedOfBall1++,height/5,50,50);
        ellipse(speedOfBall2++,2*height/5,50,50);
        ellipse(speedOfBall3++,3*height/5,50,50);
        ellipse(speedOfBall4++,4*height/5,50,50);
    }
}
