package com.netlify.helloapp.taxer;

public class Engine {



    public double OnePercent(double salary){

        double tax = 0.0;

       if (salary==200000){
           tax = 0.01*salary;
       }

       if (salary > 200000 && salary <= 350000){

           double restSalary = salary-200000;

            tax =  (0.01*200000)+(0.15*restSalary);
        }

        if (salary > 350000){

            double restSalary = salary-350000;

            tax = (0.16*350000)+(0.25*restSalary);
        }

       return tax;
    }



}
