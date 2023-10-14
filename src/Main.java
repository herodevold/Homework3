public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Double[] numbers = {1.2,2.5,7.4,-2.9,-1.7,-0.5,3.2,-6.1,-5.2,1.8,1.0,-0.9,-5.4,-6.9,3.7};
        double sum = 0;
        boolean negative = false;
        int length = 0;
        for (double valli: numbers) {
            if (valli < 0){
                negative = true;
            }
            if (negative){
                if (valli > 0) {
                    sum = sum + valli;
                    length++;
                }
            }
        }
        double ar = sum / length;
        System.out.println("Среднее арифметическое = " + ar);
    }
}