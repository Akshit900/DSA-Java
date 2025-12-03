package PPT;

import java.util.Arrays;
public class FractionalKnapsack2 {
    public static void main(String[] args) {
        int[] weight = {5, 10, 20};
        int[] value  = {50, 60, 140};
        int capacity = 25;

        double[][] items = new double[weight.length][2]; // ratio, index
        for (int i = 0; i < weight.length; i++)
            items[i] = new double[]{(double)value[i]/weight[i], i};

        Arrays.sort(items, (a,b) -> Double.compare(b[0], a[0]));

        double total = 0;
        int rem = capacity;
        for (double[] item : items) {
            int i = (int)item[1];
            if (weight[i] <= rem) { total += value[i]; rem -= weight[i]; }
            else { total += value[i]*((double)rem/weight[i]); break; }
        }

        System.out.println("Maximum value (Fractional) = " + total);
    }
}
