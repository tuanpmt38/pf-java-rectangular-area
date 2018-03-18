public class RectangularArea {
    public static void main(String[] args) {
        float weigth,height,area;
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("Input weight:");
        weigth=sc.nextFloat();
        System.out.println("Input height:");
        height= sc.nextFloat();
        area=weigth*height;
        System.out.println("Rectangular Area:" +area);
    }
}
