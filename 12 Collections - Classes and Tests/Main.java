import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        //Collection<Integer> iac = new IntArrayCollection();
        Collection<Integer> iac = new IntLinkedCollection();
        System.out.println(iac.size() == 0);
        iac.add(1);
        System.out.println(iac.size() == 1);

        for (int i = 0; i < 200; i++) {
            iac.add(i);
        }
        System.out.println(iac.size() == 201);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(10);
        nums.add(100);
        iac.addAll(nums);

    }
}
