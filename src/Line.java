public class Line {
    float x1;
    float y1;
    float x2;
    float y2;
    float te;
    float tl;
    float dx;
    float dy;
    public Line(float x1, float y1, float x2, float y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.te=0;
        this.tl=1;
        this.dx=x2-x1;
        this.dy=y2-y1;
    }
    public void max(float t){
        if(t>this.te){
            this.te=t;
        }
    }
    public void min(float t){
        if(t<this.tl){
            this.tl=t;
        }
    }
}
