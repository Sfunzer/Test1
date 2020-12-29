public class Printer {
    final private String backSender;


    public Printer() {
        backSender = "Print print print print print blablalba";
    }

    public String printTask1 () {
        return  backSender;
    }

    public String printTask2 () {return backSender + " HELP " + backSender;}

}
