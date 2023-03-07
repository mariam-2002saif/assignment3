import java.util.ArrayList;

public class HW4 {
    public static void main(String[] args) {
        ArrayList<Integer> m=new ArrayList();
        ArrayList<Integer> l=new ArrayList();
        m.add(1);
        l.add(1);
        l.add(2);
        m.add(3);
        if(m.equals(l))
            System.out.println("equals");
        else System.out.println(" not equals");
    }
}
