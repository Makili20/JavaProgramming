package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();

car1.setInfo("Toyota","Camry","White",2021,35000);
        System.out.println(car1);

Car car2=new Car();
car2.setInfo("Suzuki","Forenza","Blue",2007,4000);
        System.out.println(car2);
        ArrayList<Car> carList=new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2));
        for(Car each: carList){
            System.out.println(each.brand+" : "+each.price);
        }
        System.out.println("------------------");
/*Recall:
Suzuki:2005~2008
Toyota:1995~1997
 */
        carList.removeIf(p->p.brand.equals("Suzuki")&& p.year>=2005 &&
                p.year<=2008);
        carList.removeIf(p->p.brand.equals("Toyota")&&p.year>=1995 &&
                p.year<=1997);

        System.out.println(carList);

    }
}
