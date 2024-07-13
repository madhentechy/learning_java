interface Drawable{
    void draw();
}
//Implementation: by second user
class Rectangle1 implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}
class Triangle implements Drawable {
    public void draw() {
        System.out.println("drawing Triangle");
    }
}
//Using interface: by third user
class intershape{
    public static void main(String args[]){
        Drawable d=new Circle();
        Drawable e=new Rectangle1();
        Drawable f=new Triangle();
        d.draw();
        e.draw();
        f.draw();
    }}