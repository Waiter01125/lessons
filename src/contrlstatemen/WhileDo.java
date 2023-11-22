package contrlstatemen;

public class WhileDo {
    public static void main(String[] args) {
        int finalBalance = 100000;
        double currentBalanc = 0;
        int payment = 1000;
        int years = 0;
        double interestRate = 0.1;

        do {
            currentBalanc += payment;
            currentBalanc = currentBalanc + currentBalanc * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBalanc);
        } while (currentBalanc < finalBalance && years < 15);

    }
}
