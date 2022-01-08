package com.bridgelabz;

public class PowerofTwo {

        public static void main(String args[])
        {
            int b=Integer.parseInt(args[0]);
            int n=Integer.parseInt(args[1]);
            int p=1;
            int year=0;
            boolean leap=false;
            //  int p=Integer.parseInt(args[2]);
            for(int i=1;i<=n;i++)
            {
                p=p*b;
            }
            System.out.println("value of power is:: "+p);
            year=p;
            if (year % 4 == 0) {

                // if the year is century
                if (year % 100 == 0) {

                    // if year is divided by 400
                    // then it is a leap year
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }

                // if the year is not century
                else
                    leap = true;
            }

            else
                leap = false;

            if (leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
            // System.out.println("value of power is::");
        }
    }

