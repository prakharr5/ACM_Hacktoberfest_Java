public class s {
    int d1;
    int d2;
    s(int a, int b)
    {
        d1 = a;
        d2 = b;
    }
}

class rectangles extends s
{
    rectangles(int a, int b)
    {
        super(a, b);
    }
    int arear = (d1*d2);

}
class triangles extends s
{
    triangles(int a, int b)
    {
        super(a, b);
    }
    int areat = ((d1*d2)/2);

}
    public static void main(String[] args)
    {
        System.out.println("area of rectangles : " + arear);
        System.out.println("area of rectangles : " + areat);
    }
