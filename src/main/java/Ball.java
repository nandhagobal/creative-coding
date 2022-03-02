
public class Ball {
    private float xPointOfBall,yPointOfBall,diameter;
    private float speed;
    public Ball(float xPointOfBall,float yPointOfBall,float diameter,float speed) {
        this.xPointOfBall=xPointOfBall;
        this.yPointOfBall=yPointOfBall;
        this.diameter=diameter;
        this.speed=speed;
    }

    public float getXPointOfBall() {
        return xPointOfBall;
    }

    public float getYPointOfBall() {
        return yPointOfBall;
    }

    public float getDiameter() {
        return diameter;
    }

    public void incrementSpeed(){
        xPointOfBall+=speed;
    }


}
