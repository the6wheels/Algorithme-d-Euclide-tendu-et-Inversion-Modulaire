package TP2;

import java.math.BigInteger;
import java.util.Scanner;



/** Class ExtendedEuclid **/

public class ExtendedEuclid

{

    /** Function to solve **/

    public void solve(long a, long b)

    {

    	BigInteger R = BigInteger.valueOf(a),Rr = BigInteger.valueOf(b), U = BigInteger.ONE, V = BigInteger.ZERO, Vv = BigInteger.ONE, Uu = BigInteger.ZERO;
    	
        while (Rr != BigInteger.ZERO)

        {
        	
        	
        	
        	
        	BigInteger q = R.divide(Rr);

        	BigInteger rs = R;

        	BigInteger us = U;
        	
        	BigInteger vs = V;

            R = Rr;

            U = Uu;
            
            V = Vv;
           
            Rr = rs.subtract(q.multiply(Rr));;

            Uu = us.subtract(q.multiply(Uu));
            
            Vv = vs.subtract(q.multiply(Vv));
                      

        }

        System.out.println("Rest  r : "+ R +"\nRoot1 u :"+ U + "\nRoot2 v = " + V);

    }

    /** Main function **/

    public static void main (String[] args) 

    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Extended Euclid Algorithm Test\n");

        /** Make an object of ExtendedEuclid class **/

        ExtendedEuclid ee = new ExtendedEuclid();

 

        /** Accept two integers **/

        System.out.println("Enter a b of ax + by = gcd(a, b)\n");
        System.out.println("\nEnter a = ");
        
        long a = scan.nextLong();

        System.out.println("\nEnter b = ");
        
        long b = scan.nextLong();

        /** Call function solve of class ExtendedEuclid **/

        ee.solve(a, b);  
        
        scan.close();

    }

}