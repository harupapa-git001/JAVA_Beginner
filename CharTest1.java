class CharTest1 {
    public static void main(String args[]){
        final double BMI = 22;
        double height = 1.7;
        double weight;

        weight = height * height * BMI;

        System.out.println("身長:" + height * 100 + "cm");

        System.out.println("標準体重:" + weight + "Kg");
    }
}