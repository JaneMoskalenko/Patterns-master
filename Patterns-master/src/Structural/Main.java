package Structural;

import Structural.Composer.*;
import Structural.Decorator.Loan;
import Structural.Decorator.LoanCandy;
import Structural.Decorator.LoanInsurance;
import Structural.Decorator.LoanRefinancingPossibility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sa on 04.07.17.
 */
public class Main {

    public static void main(String[] args) {

        HashMap<String, Number> count = new HashMap<>();

//        Loan loan = new Loan();
//        LoanInsurance loanInsurance = new LoanInsurance(loan);
//        LoanCandy loanCandy = new LoanCandy(loanInsurance);
//        LoanRefinancingPossibility loanRefPos =
//                new LoanRefinancingPossibility(loanInsurance);
//
//        loanRefPos.addConditions();


        Building building = new Building(1000);

        Yard yard = new Yard(1_000_000L);
        yard.add(building);

        District district = new District(1_500_000.53D);
        district.add(yard);

        City city = new City(53_426_147.47D);
        city.add(district);

        Area area = new Area();
        area.add(city);

        area.countEverything(count);

        for(Map.Entry mEntry : count.entrySet())
            System.out.println(mEntry.getKey() + " " + mEntry.getValue());

//            System.out.println("HEY ITS ME " + count.values().size());
    }

}
