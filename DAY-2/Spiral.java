import java.math.BigInteger;

class Spiral
{
    public static BigInteger sum(BigInteger size)
    {
        // ODD : ((N * N) / 2) + N
        // EVEN: ((N * N) / 2) + N - 1

        // Total grid size
        BigInteger output = size.multiply(size);

        // Divide by 2
        output = output.divide(BigInteger.TWO);

        // Add the original size
        output = output.add(size);

        // Add 1 if even
        if(output.mod(BigInteger.TWO) == BigInteger.ZERO)
            output = output.subtract(BigInteger.ONE);

        return output;
    }
}