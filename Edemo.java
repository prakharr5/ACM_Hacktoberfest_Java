import java.util.Scanner;
class Edemo 
{
    public static void main(String[] args) 
    {
        int a;
        System.out.println("enter for a : ");
        Scanner input = new Scanner(System.in);
       try{
        a = input.nextInt();
        System.out.println("project has started");
        System.out.println("given a is"+a);
        int b =100;
        int list[]={7,11,21};
        System.out.println("b is :"+b);
            
                if(a==0)
                {
                    System.out.println("given a is :"+a);
                    int c = (b/a);
                    System.out.println("c is :"+c);
                }
                if(a==1)
                {
                    System.out.println("now a is "+a);
                    list[7]=123;
                    System.out.println("hi");
                }
            } catch (ArithmeticException e) {
                // TODO: handle exception
                System.out.println("error ArithmeticException is caught "+e);
            }
            /*catch (ArrayIndexOutOfBoundsException e) {
                // TODO: handle exception
                System.out.println("error ArrayIndexOutOfBoundsException is caught 1"+e);
            }*/
            catch (Exception e) {
                // TODO: handle exception
                System.out.println("error Exception is caught "+e);
            }
            System.out.println("back in main");
            System.out.println("project last line executing");
            System.out.println("project is ended");
    }
        
}
