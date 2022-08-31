package patica;

import java.util.Arrays;

public class Harmonik_seri {
    public static void main(String[] args) {
        double[] num={1, 2, 3, 4, 5};
        double harmonik_seri=0.0;
        for (int i = 0; i < num.length; i++) {
            harmonik_seri+= 1/(num[i]);
        }
        System.out.println(Arrays.toString(num)+" dizisindeki sayıların harmonik serisi: "+harmonik_seri);
    }
}
