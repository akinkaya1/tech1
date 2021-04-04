package logicalOperators;

public class JobApply {
    public static void main(String[] args) {
        boolean java = true;
        boolean selenium = true;
        boolean experience = true;
        boolean cucumber = true;
        boolean singer = true;

        //if applicants is singer than hire them right away
        boolean firstApplicant = singer; // hired if singer

        //if applicants know java+selenium hire them and offer 90k
        boolean secondApplicant = (singer) || (java && selenium);

        //if applicants know java+selenium+cucumber hire them and offer 100k
        boolean thirdApplicant = (singer) || (java && selenium && cucumber);

        //if applicants know java+selenium+cucumber + has experience hire them and offer 110k
        boolean fourthApplicant = (singer) || (java && selenium && cucumber && experience);
    }
}
