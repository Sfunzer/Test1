public class Main {
    static String weGaanPrinten;
    static Printer deskJet1;


    public static void main(String[] args) {
        deskJet1 = new Printer();

        weGaanPrinten = deskJet1.printTask1();

        System.out.println(weGaanPrinten);


    }
}
