import java.util.*;
import java.util.stream.*;

public class CornerFill {

    public static int[] cornerFill(int[][] square) {
        if (square == null) {
            return null;
        }
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < square.length; i++) {
            if (i % 2 == 0) {
                output.addAll(getSlice(square, i));
            } else {
                output.addAll(getBackSlice(square, i));
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }

    public static List<Integer> getSlice(int[][] square, int row) {
        List<Integer> output = new ArrayList<>();
        int index = 0;
        while (index < square.length - row) {
            output.add(square[row][index++]);
        }
        while(++row < square.length) {
            output.add(square[row][index - 1]);
        }
        return output;
    }

    public static List<Integer> getBackSlice(int[][] square, int col) {
        List<Integer> output = new ArrayList<>();
        int index = square.length;
        while(--index >= col) {
            output.add(square[index][square.length - col - 1]);
        }
        col = square.length - col - 1;
        while (--col >= 0) {
            output.add(square[index + 1][col]);
        }
        return output;
    }
}