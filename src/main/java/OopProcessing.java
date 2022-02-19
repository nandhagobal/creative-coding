import processing.core.PApplet;

public class OopProcessing extends PApplet{
    private static Ball ball3, ball1,ball2,ball4;
    public final static int WIDTH=750,HEIGHT=500;

    public static void main(String[] args) {
        ball1=new Ball(0,HEIGHT/5,50,50,1);
        ball2=new Ball(0,2*HEIGHT/5,50,50,2);
        ball3=new Ball(0,3*HEIGHT/5,50,50,3);
        ball4=new Ball(0,4*HEIGHT/5,50,50,4);
        PApplet.main("OopProcessing",args);
    }

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
//        System.out.println(ball1.getAPoint());
        ellipse(ball1.getAPoint(),ball1.getBPoint(),ball1.getLocalMax(),ball1.getLocalMin());
        ball1.incrementSpeed();
        ellipse(ball2.getAPoint(),ball2.getBPoint(),ball2.getLocalMax(),ball2.getLocalMin());
        ball2.incrementSpeed();
        ellipse(ball3.getAPoint(),ball3.getBPoint(),ball3.getLocalMax(),ball3.getLocalMin());
        ball3.incrementSpeed();
        ellipse(ball4.getAPoint(),ball4.getBPoint(),ball4.getLocalMax(),ball4.getLocalMin());
        ball4.incrementSpeed();
    }
}
