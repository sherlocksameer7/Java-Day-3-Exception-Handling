package com.project.concept;

import java.io.IOException;

public class Checking_Err_Exception {

    public static void main(String[] args)
    {

//        int a = 21;
//
//        if (a>18)
//        {
//            throw new ArithmeticException("Not Eligible to Vote !! ");
//        }
//        else
//        {
//
//        }
        try
        {
//            int x = 10;
//            int y = 0;
//            int z = x/y;
            String a = null;
            System.out.println(a.length());  // For finding length with null value !!! , It is an Exception Statement...
        }


        catch (ArithmeticException e)  // Define an Exception or else we give *** catch (Exception e) Alone!!!
        {                              // For that situation we use sout(e) Only !!! ***
            System.out.println("Divide by ZERO is NOT Possible !!! ");   // Specifies the Exception what it is !!!
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Value");
        }
        catch (Exception e)  // Never use this in Top of all the Catches, If the code is undergoes nothing in the exception.
                             // So, it is used in below of the Exceptions !!!
        {
            System.out.println(e);
        }


        finally
        {

            System.out.println("Harman International");  // Whenever the exception happens but, we want ro print this statement.
                                                        // This finally is used to print that statement !!!
        }
    }
}
