package practiseTasks;

public class CydeoBatches_Switch {
    public static void main(String[] args) {
        String batch="US morning";
        String result="";

        switch(batch) {
            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result = "Class times are 7- 10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";

            default:
                result = "Invalid batch";
        }
                System.out.println(result);





        }








    }

