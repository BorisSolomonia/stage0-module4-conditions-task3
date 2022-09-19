package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        int k = number%5;
        int f = number%11;
        if(number == 0){
            System.out.println("cannot divide by zero");
        }else if(k == f && f == 0){
            System.out.println("Dividable");
        } else {
            System.out.println("Non-dividable");
        }
    }
}
