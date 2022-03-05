class Kata2 {
    public static void main(String[] args) {
        int i = 39;
        byte b = 4;
        float f = 3.4f;
        double d = 3.14;

        b = (byte)i;
        System.out.println("iの" + i + "、int型をbの" + b + "、byte型に代入しました");

        f = (float)d;
        System.out.println("dの" + d + "、double型をfの" + f + "、float型に代入しました");

        i = (int)f;
        System.out.println("fの" + f + "、float型をiの" + i + "、int型に代入しました");
    }
}