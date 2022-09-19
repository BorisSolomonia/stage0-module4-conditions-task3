package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        double first1 = (double) first;
        double second1 = (double) second;
        double k = first1/second1;
        System.out.println(k);
        int f = (int) (first1/second1);
        if (k == f){
            System.out.println("Aliquot");
        }else {
            System.out.println("Not aliquot");
        }
    }
}
