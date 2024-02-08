public class Gcash implements PaymentType {
    public String calculatePayment(){
        String output = new String();

        output += "Gcash is your payment Type.\n" +
                    "You earned 10 energy points!";

        return output;
    }
}
