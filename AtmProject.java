import IndianBank.Banking;
import mop.MenuOperation;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exceptions.InvalidBalanceException;
import Exceptions.InvalidDepositException;
import Exceptions.InvalidFundException;
public class AtmProject {
    public static void main(String [] args)
    {
        Banking bo=new Banking();
        while(true)
        {
            try
            {
            Scanner s =new Scanner(System.in);
            MenuOperation.menu();
            System.out.println("Enter your need through option number:");
            int opno=s.nextInt();
            switch (opno) 
            {
                case 1:try
                {
                    bo.deposit();
                }
                catch (NumberFormatException e)
                {
                    System.out.println("values should be enter values in numbers");
                }
                catch (InvalidDepositException ide)
                {
                    System.out.println("Values should be in greater than zero");
                }
                break;
                case 2:try
                {
                    bo.withDraw();
                }
                catch (NumberFormatException nfe)
                {
                    System.out.println("Withdraw can be done only in values");
                }
                catch (InvalidBalanceException ibe)
                {
                    System.out.println("Please enter the values within balance");
                }
                catch (InvalidFundException ife)
                {
                    System.out.println("Please enter withdraw amount in greater than zero");
                }
                break;
                case 3:
                bo.balEnq();
                break;
                case 4:
                System.out.println("Thanks for using this app");
                System.exit(0);
                default:System.out.println("Please enter as within the operations");
                break;
            }//switch
            //s.close();
        }catch(NumberFormatException nfe)
        {
            System.out.println("please enter in values");
        }
        catch (InputMismatchException ih)
        {
            System.out.println("please");
        }
        }//while
    }//main
}//AtmProject
