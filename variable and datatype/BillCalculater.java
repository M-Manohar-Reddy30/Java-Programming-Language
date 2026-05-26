import java.util.*;

public class BillCalculater {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat(); 
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        float gst = total/100*18;

        float TotalCost = total+gst;
        System.out.println(TotalCost);
    }
}
