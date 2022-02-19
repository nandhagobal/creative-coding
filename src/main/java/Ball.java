
public class Ball {
    private float aPoint,bPoint,localMax,localMin;
    private float speed;
    public Ball(float aPoint,float bPoint,float localMax,float localMin,float speed) {
        this.aPoint=aPoint;
        this.bPoint=bPoint;
        this.localMax=localMax;
        this.localMin=localMin;
        this.speed=speed;
    }
    public void incrementSpeed(){
        aPoint+=speed;
    }
    public float getAPoint() {
        return aPoint;
    }

    public float getBPoint() {
        return bPoint;
    }

    public float getLocalMax() {
        return localMax;
    }

    public float getLocalMin() {
        return localMin;
    }
}
