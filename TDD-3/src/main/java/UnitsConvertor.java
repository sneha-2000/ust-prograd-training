public class UnitsConvertor {
    public double convert(double value, String  from, String to) {
        if (value < 0) throw new IllegalArgumentException("value cannot be negative");

        switch (to) {
            case "cm":
                return toCentiMeter(value, from);
            case "m":
                return toMeter(value, from);
            case "km":
                return toKiloMeter(value, from);
            default:
                throw new IllegalArgumentException("units either not valid or not supported");
        }
    }

    public double toCentiMeter(double value, String unit) {
        switch (unit) {
            case "cm":
                return value;
            case "m":
                return value * 100;
            case "km":
                return value * 100_000;
            default:
                throw new IllegalArgumentException("units either not valid or not supported");
        }
    }

    public double toMeter(double value, String unit) {
        switch (unit){

            case "cm":
                return value * 0.01;
            case "m":
                return value;
            case "km":
                return value * 1000;
            default:
                throw new IllegalArgumentException("units either not valid or not supported");
        }
    }

    public double toKiloMeter(double value, String unit) {
        switch (unit) {
            case "cm":
                return value * 0.00001;
            case "m":
                return value * 0.001;
            case "km":
                return value;
            default:
                throw new IllegalArgumentException("units either not valid or not supported");
        }
    }
}


