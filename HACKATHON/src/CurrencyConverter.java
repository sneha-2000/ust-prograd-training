
public class CurrencyConverter{

     final double DOLLARTORUPEES = 74.85;
     final double EUROTORUPEES= 85.69;
     final double SGDTORUPEES= 55.52;
     final double YUANTORUPEES= 11.95;

     public double rupeesToDollars(double rupees) {
        return rupees / DOLLARTORUPEES;
    }

    public double dollarsToRupees(double dollars) {
        return dollars * DOLLARTORUPEES;
    }


    public double rupeesToEuros(double rupees) {
        return rupees / EUROTORUPEES;
    }

    public double eurosToRupees(double euros) {
        return euros * EUROTORUPEES;
    }

    public double rupeesToSingaporeDollars(double rupees) {
        return rupees / SGDTORUPEES;
    }

    public double singaporeDollarsToRupees(double singaporeDollars) {
        return singaporeDollars * SGDTORUPEES;
    }

    public double rupeesToChineeseYuan(double rupees) {
        return rupees / YUANTORUPEES;
    }

    public double chineeseYuanToRupees(double yuan) {
        return yuan * YUANTORUPEES;
    }
}





















//Make a console based currency converter application with support for at least 5 currencies.
// Requirements: 1. Must be a menu driven program.
// 2. All currencies to be displayed correct upto 2 decimal places.
// 3. Each interaction of the user with the program must be logged
// in a log.txt file `log.txt` example contents - Program started.
// User selected INR User selected USD User entered amount 1400 Program stopped.
// 4. Add exception handling for when user enters invalid amount or chooses invalid option in java