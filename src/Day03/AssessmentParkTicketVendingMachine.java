package Day03;

public class AssessmentParkTicketVendingMachine {

    private int height;

    public AssessmentParkTicketVendingMachine(int height) {
        this.height = height;
    }

    public static String isEligibleForRide(AssessmentParkTicketVendingMachine userName) {
        try {
            if (userName.height < 120) {
                throw new NotEligibleForRide("Not Eligible. Height should be above 120.");
            }
        } catch (NotEligibleForRide e) {
            throw new RuntimeException(e);
        }

        return "Eligible";
    }

    public static void main(String[] args) {
        AssessmentParkTicketVendingMachine kid1 = new AssessmentParkTicketVendingMachine(110);

        AssessmentParkTicketVendingMachine kid2 = new AssessmentParkTicketVendingMachine(170);

        //System.out.println( isEligibleForRide(kid1) );

        System.out.println(isEligibleForRide(kid2));
    }
}
