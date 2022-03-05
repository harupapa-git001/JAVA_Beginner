class Kata1 {
    public static void main(String[] args) {
        int i = 39;
        byte b = 4;
        short s = 10;
        char c = 'あ';
        float f = 3.4f;
        double d = 3.14;

        i = b;
        System.out.println("bの" + b + "、byte型をiの" + i + "、int型に代入しました");

        s = b;
        System.out.println("bの" + b + "、byte型をsの" + s + "、short型に代入しました");

        f = c;
        System.out.println("cの" + c + "、char型をfの" + f + "、float型に代入しました");

        d = f;
        System.out.println("fの" + f + "、float型をiの" + d + "、double型に代入しました");
    }
}