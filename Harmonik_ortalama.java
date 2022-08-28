package patica;
public class Harmonik_ortalama {
    public static void main(String[] args) {
        int[] num={1, 2, 3, 4, 5};
        double harmonik_seri=0.0;
        for (int i = 0; i < num.length; i++) {
            harmonik_seri+=1/(num[i]);
        }
        System.out.println(num.length/harmonik_seri);
    }
}
