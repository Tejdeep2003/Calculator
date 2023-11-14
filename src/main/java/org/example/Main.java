package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import java.lang.Math;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        logger.info("Start of Execution");

        Scanner myObj = new Scanner(System.in);
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        while(true) {
            System.out.println("--Welcome to Calculator--");
            System.out.println("Choose your operation");

            System.out.println("1. Addition ");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. log");
            System.out.println("7. square root");
            System.out.println("8. exit");


            int choice = myObj.nextInt();
            int x, y=0;
            if(choice==8)
            {
                logger.info("End of Execution");
                System.out.println("Thank you for using Calculator!!");
                break;
            }
            else if(choice==6 || choice==7)
            {
                System.out.println("Enter first operand:");

                x = myObj.nextInt();
            }
            else
            {
                System.out.println("Enter first operand:");

                x = myObj.nextInt();

                System.out.println("Enter second operand:");

                y = myObj.nextInt();
            }
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
                case 5:
                    System.out.println(Pow(x,y));
                    break;
                case 6:
                    System.out.println(Log(x));
                    break;
                case 7:
                    System.out.println(Sqrt(x));
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

    public static int Pow(int x, int y)
    {
        logger.info("START OP: Pow");
        int z = (int) Math.pow(x,y);
        logger.info("END OP: Pow");
        return z;
    }
    public static int Log(int x)
    {
        logger.info("START OP: Log");
        int z = (int)(Math.log(x) / Math.log(2));
        logger.info("END OP: Log");
        return z;
    }

    public static int Sqrt(int x)
    {
        logger.info("START OP: Sqrt");
        int z = (int)Math.sqrt(x) ;
        logger.info("END OP: Sqrt");
        return z;
    }
}