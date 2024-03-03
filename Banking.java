package IndianBank;
import java.util.Scanner;

import Exceptions.InvalidBalanceException;
import Exceptions.InvalidDepositException;
import Exceptions.InvalidFundException;
public class Banking {
    Scanner s=new Scanner (System.in);
    double bal=0;
    public Banking()
    {
        bal=500;
    }
    public void deposit() throws InvalidDepositException,NumberFormatException
    {
        System.out.println("Enter the amount to be deposit:");
        double damt=s.nextDouble();
            if (damt<=0){
                InvalidDepositException ie=new InvalidDepositException();
                throw ie;
            }//d if
            else
            {
                bal=bal+damt;
                System.out.println("Amount deposited by the Customer");
                System.out.println("-------------------------");
                System.out.println("Your available Balance:"+bal);
                System.out.println("-------------------------");
            }//d else    
    }//deposit
    public void withDraw() throws NumberFormatException,InvalidFundException,InvalidBalanceException
    {
        System.out.println("Enter the amount to be withdraw from your Account:");
        double wamt=s.nextDouble();
            if (wamt<=0)
            {
                InvalidFundException ife=new InvalidFundException();
                throw ife;
            }//if
            else
            {
                if (wamt>bal)
                {
                    InvalidBalanceException ibe=new InvalidBalanceException();
                    throw ibe;
                }
                else
                {
                    bal=bal-wamt;
                    System.out.println("-------------------------");
                    System.out.println("Enjoy your Cash");
                    System.out.println("-------------------------");
                    System.out.println("Available Cash:"+bal);
                    System.out.println("-------------------------");
                }//if-else
            }//else
    }//WithDraw
    public void balEnq()
    {
        System.out.println("-------------------------");
        System.out.println("Current Net Worth:"+bal);
        System.out.println("-------------------------");
    }//balEnq
}//Banking.java
