package day23_CustomMethod_Return;

public class WarmUpTasks {
    public static void main(String[] args) {
        initials("Cydeo", "School");
        System.out.println("--------------------");
        domain("marijana.makili@gmail.com");
        System.out.println("----------------");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("-----------");
        nameOfMonth(13);
        System.out.println("-----------------");
        nameOfDay(5);
        System.out.println("------------");
        daysInMonth(6);
        System.out.println("----------");
        ageGroup(34);
    }

    //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial= " + initial);


    }

    //2. Create a method that can display the domain of the email
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    //3. Create a method that can display the name of the month based on
    //the given number to the method
    public static void nameOfMonth(int num) {
        String name = "";
        if (num >= 1 && num <= 12) {
            name = (num == 1) ? "January" : (num == 2) ? "Feb" : (num == 3) ? "Mar" : (num == 4) ? "Apr" : (num == 5) ? "May"
                    : (num == 6) ? "Jun" : (num == 7) ? "July" : (num == 8) ? "Aug" : (num == 9) ? "Sep"
                    : (num == 10) ? "Oct" : (num == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }
        System.out.println("Month name is: " + name);
    }

    //4. Create a method that can print the name of the day based on the
    // given number to the method
    public static void nameOfDay(int num){
        String dayName="";
        if(num>=1 && num<=7){
            dayName=(num==1)?"Mon":(num==2)?"Tue":(num==3)?"Wed":(num==4)?"Thur"
                    :(num==5)?"Friday":(num==6)?"Sat":"Sun";
        }else{
            dayName="Invalid";
        }
        System.out.println("dayName = " + dayName);
    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){
        String days="";
        if(number>=1 && number<=12){
            days=(number==1)?"31":(number==2)?"28":(number==3)?"31":(number==4)?"30":(number==5)?"31"
                    :(number==6)?"30":(number==7)?"31":(number==8)?"31":(number==9)?"30":(number==10)?"31"
                    :(number==11)?"30":"31";
        }else{
            days="Invalid";
        }
        System.out.println("days = " + days);

    }

/* Create a class called AgeGroups, and write a program that can define
the age groups of a person
             age groups are:
                    infant (1 - 2)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult
(40 - 49),
                    Middle-Aged Adult (50 -
54),
                    Very Young Senior Citizen
(55 - 64),
                    Young Senior Citizen (65
- 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)

 */

    public static void ageGroup(int age){
        String result="";
        if(age>=1 && age<=100){
            if (age <= 2) {
                result = "Infant";
            } else if (age <= 5) {
                result = "Toddler";
            } else if (age <= 9) {
                result = "Kid";
            } else if (age <= 12) {
                result = "Pre-Teen";
            } else if (age <= 17) {
                result = "Teenager";
            } else if (age <= 20) {
                result = "Young Adult";
            } else if (age <= 39) {
                result = "Adult";
            } else if (age <= 49) {
                result = "Young Middle-Aged Adult";
            } else if (age <= 54) {
                result = "Middle-Aged Adult";
            } else if (age <= 64) {
                result = "Very Young Senior Citizen";
            } else if (age <= 74) {
                result = "Young Senior Citizen";
            } else if (age <= 84) {
                result = "Senior Citizen";
            } else {
                result = "Old Senior Citizen";
            }

        }else{
            result="Invalid";
        }
        System.out.println("result = " + result);
    }




}





/*Warmup tasks:
1. Create a method that can display the initials of the person
2. Create a method that can display the domain of the email
3. Create a method that can display the name of the month based on
the given number to the method
4. Create a method that can print the name of the day based on the
given number to the method
5. Create a method that can print how many days a month has

 */