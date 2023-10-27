package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("Start of Execution");

        Scanner myObj = new Scanner(System.in);
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        while(true) {
            System.out.println("--Welcome to Calculator--");
            System.out.println("Choose your operation");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = myObj.nextInt();

            if(choice==5)
            {
                logger.info("End of Execution");
                System.out.println("Thank you for using Calculator!!");
                break;
            }

            System.out.println("Enter first operand:");

            int x = myObj.nextInt();

            System.out.println("Enter second operand:");

            int y = myObj.nextInt();

            System.out.println("Result: ");
            switch(choice)
            {
                case 1:
                    System.out.println(add(x,y));
                    break;
                case 2:
                    System.out.println(sub(x,y));
                    break;
                case 3:
                    System.out.println(mul(x,y));
                    break;
                case 4:
                    System.out.println(div(x,y));
                    break;
            }


        }

    }

    public static int add(int x, int y)
    {
        logger.info("START OP: Add");
        int z = x+y;
        logger.info("END OP: Add");
        return z;
    }
    public static int mul(int x, int y) {
        logger.info("START OP: Mul");
        int z = x*y;
        logger.info("END OP: Mul");
        return z;
    }
    public static int sub(int x, int y)
    {
        logger.info("START OP: Sub");
        int z = x-y;
        logger.info("END OP: Sub");
        return z;
    }
    public static int div(int x, int y)
    {
        logger.info("START OP: Div");
        if(y==0) logger.warn("Invalid Input");
        else
        {
            int z = x/y;
            logger.info("END OP: Div");
            return z;
        }
        return 0;
    }
}