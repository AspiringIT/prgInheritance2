
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        //Create an arrayList.
        ArrayList arr = new ArrayList();
        CruiseShip Cs = new CruiseShip();
        arr.add(Cs);
        for (int i=0; i<arr.size(); i++) {
            String curr = arr.get(i).toString();

            System.out.println(curr);

        }

    }
}