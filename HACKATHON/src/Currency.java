import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Currency {
    public static void main(String[] args) throws IOException {

        CurrencyConverter currencyConverter=new CurrencyConverter();

        Scanner sc = new Scanner(System.in);

        Logger log = Logger.getLogger("MyLog");
        FileHandler fh;

        fh = new FileHandler("log.txt");
        log.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        log.info("*****PROGRAM HAS BEGIN*****");

        int choice; // for storing user's choice
        sc = new Scanner(System.in);

        System.out.println("***********CONVERT YOUR CURRENCY**********");
        System.out.println("1:Rupees to USD");
        System.out.println("2:USD to Rupees");
        System.out.println("3:Rupees to Euros");
        System.out.println("4: Euros to Rupees");
        System.out.println("5: Rupees to Singapore Dollars");
        System.out.println("6: Singapore Dollars To Rupees");
        System.out.println("7: Rupees to Yuan");
        System.out.println("8: Yuan to Rupees");
        System.out.println("Enter your Choice from 1-8:");


        while (true){
            System.out.println("SELECT THE CURRENCY YOU WANT:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Selected currency is: RUPEES TO USD");
                    System.out.print("Enter rupee amount: ");
                    double amountInINR = sc.nextDouble();
                    log.info("User entered amount" +amountInINR );
                    if (amountInINR < 0) {
                        throw new IllegalArgumentException("Amount can't be zero or negative...");
                    } else {
                        System.out.println(currencyConverter.rupeesToDollars((amountInINR)));
                    }
                    break;


                case 2:
                    System.out.println("Selected currency is: DOLLARS TO RUPEES");
                    double amountInUSD=sc.nextDouble();
                    log.info("User entered amount" +amountInUSD );
                    if (amountInUSD< 0) {
                    throw new IllegalArgumentException("Amount can't be zero or negative...");
                    }
                    else {
                    System.out.printf("%.2f ",currencyConverter.dollarsToRupees((amountInUSD)));
                    }
                    break;

                case 3:
                    System.out.println("Selected currency is: RUPEES TO EUROS");
                    amountInINR= sc.nextDouble();
                    log.info("User entered amount" +amountInINR);
                    if (amountInINR< 0) {
                        throw new IllegalArgumentException("Amount can't be zero or negative...");
                    }
                    else {
                        System.out.println(currencyConverter.rupeesToEuros((amountInINR)));
                    }

                    break;

                case 4:
                    System.out.println("Selected currency is: EUROS TO RUPEES");
                    double amountInEuros= sc.nextDouble();
                    log.info("User entered amount" +amountInEuros);
                    if (amountInEuros< 0) {
                        throw new IllegalArgumentException("Amount can't be zero or negative...");
                    }
                    else {
                        System.out.printf("%.2f ",currencyConverter.eurosToRupees((amountInEuros)));
                    }

                    break;

                case 5:
                    System.out.println(" Selected currency is: RUPEES TO SINGAPORE DOLLARS");
                    amountInINR= sc.nextDouble();
                    log.info("User entered amount" +amountInINR);
                    if (amountInINR< 0) {
                        throw new IllegalArgumentException("Amount can't be zero or negative...");
                    }
                    else {
                        System.out.println(currencyConverter.rupeesToSingaporeDollars((amountInINR)));
                    }

                    break;

                case 6:
                    System.out.println("Selected currency is: SINGAPORE DOLLARS TO RUPEES ");
                    double amountInSGD= sc.nextDouble();
                    log.info("User entered amount" +amountInSGD);
                    if (amountInSGD< 0) {
                        throw new IllegalArgumentException("Amount can't be zero or negative...");
                    }
                    else {
                        System.out.printf("%.2f ",currencyConverter.eurosToRupees((amountInSGD)));
                    }

                    break;

                case 7:
                    System.out.println("Selected currency is: RUPEES TO YUAN" );
                    amountInINR= sc.nextDouble();
                    log.info("User entered amount" +amountInINR);
                    if (amountInINR< 0) {
                        throw new IllegalArgumentException("Amount can't be zero or negative...");
                    }
                    else {
                        System.out.println(currencyConverter.rupeesToSingaporeDollars((amountInINR)));
                    }

                    break;

                case 8:
                    System.out.println("Selected currency is: YUAN TO RUPEES");
                    double amountInYuan= sc.nextDouble();
                    log.info("User entered amount" +amountInYuan);
                    if (amountInYuan< 0) {
                        throw new IllegalArgumentException("Amount can't be zero or negative...");
                    }
                    else {
                        System.out.printf("%.2f ",currencyConverter.eurosToRupees((amountInYuan)));
                    }

                    break;

                default : {
                    System.out.println("Please enter valid currency");
                }

            }
            log.info("*****PROGRAM HAS STOPPED*****");
        }

    }








}



