import processing.core.PApplet;

public class OopProcessing extends PApplet{
    private static Ball[] ball;
    public final static int WIDTH=750,HEIGHT=500;

    public static void main(String[] args) {
        for(int i=1;i<=4;i++) {
            ball[i-1] = new Ball(0, i*HEIGHT / 5, 50, i);
        }
        PApplet.main("OopProcessing",args);
    }

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        for(int i=0;i<4;i++) {
            ellipse(ball[i].getXPointOfBall(), ball[i].getYPointOfBall(), ball[i].getDiameter(), ball[i].getDiameter());
            ball[i].incrementSpeed();
        }
    }
}
