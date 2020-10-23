public class Cyrus_Clipper {
    static float x_min;
    static float x_max;
    static float y_min;
    static float y_max;
    public Cyrus_Clipper(float x_min, float x_max, float y_min, float y_max){
        this.x_max=x_max;
        this.x_min=x_min;
        this.y_max=y_max;
        this.y_min=y_min;
    }
    public void clip(Line l){
        System.out.println("Initial values:\n\nD=( "+l.dx+", "+l.dy+")");
        System.out.println("\n___________________________________________________________________");
        if(l.x1==l.x2 && l.y1==l.y2){
            System.out.println("This is a point");
        }
        else{
            left(l);
            right(l);
            bottom(l);
            top(l);
        }
    }
    public static void left(Line l){
        float n=(-1)*l.dx;
        float t= -(l.x1-x_min)/(l.x2-l.x1);
        System.out.println("Left: ");
        common(l, n, t);
    }
    public static void right(Line l) {
        float n=(1)*l.dx;
        float t= -(l.x1-x_max)/(l.x2-l.x1);
        System.out.println("Right: ");
        common(l, n, t);
    }
    public static void bottom(Line l){
        float n=(-1)*l.dy;
        float t= -(l.y1-y_min)/(l.y2-l.y1);
        System.out.println("Bottom: ");
        common(l, n, t);
    }
    public static void top(Line l){
        float n=(1)*l.dy;
        float t= -(l.y1-y_max)/(l.y2-l.y1);
        System.out.println("Top: ");
        common(l, n, t);
    }
    public static void common(Line l, float n, float t){
        System.out.println("T= "+t);
        if(n==0){
            System.out.println("It's parallel to the line");
        }
        else{
            if(n<0){
                //System.out.println(n);
                //System.out.println(l.te);
                //System.out.println(t);
                l.max(t);
            }
            else{
                l.min(t);
            }
        }
        print(l, n, t);
    }
    public static void print(Line l, float n, float t){
        System.out.println("Ni.D= "+n);
        if(n<0){
            System.out.println("PE");
        }
        else{
            System.out.println("PL");
        }
        System.out.println("Te= "+l.te+"\nTl= "+l.tl);
        System.out.println("\n___________________________________________________________________");
    }
}
