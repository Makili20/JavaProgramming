package practiseTasks;

public class VoidMethod_EligibleToVote {
    public static void EligibleToVote(int number,String country){
        if((number>=21 && number<=77)&&(country.equalsIgnoreCase("USA"))){
            System.out.println("The person is eligible to vote");
        } else {
            System.out.println("The person is not eligible to vote!");
        }
    }

    public static void main(String[] args) {
        EligibleToVote(34,"Serbia");
    }
}
/*4. create a method that can check if a person is eligible to vote
Ex:
eligibleToVote(19, "USA");
output:
You are not eligible to vote!

 */