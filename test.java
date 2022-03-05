import java.util.Random;
import java.util.Scanner;


public class test{
    public static void main(String args[]){

        String[] month = {"January","February","March","April","May","June","July","August","September","October",
                        "November","December"};

        //乱数生成
        Random r = new Random();
        int randomValue = random.nextInt(12);
        int mon;
        mon = randomValue + 1;
        //文字列判定(アルファベット入力の照合)
        Scanner scanner = new Scanner(System.in);

        System.out.println(mon + "月のアルファベット表記をしてください:");
        String in_m = scanner.next();

        int f_try = 13;

        int over;
        //while繰り返し条件
        while(f_try == 13) {
            if(in_m.equals(mon)) {
                System.out.println(mon + "月は" + month[r] + "です");
                System.out.println("正解です");
                System.out.println("もう一度しますか？[y:1]:");
                over = scanner.nextInt();
            }else {
                System.out.println("不正解です");
                System.out.println("もう一度しますか？[y:1]:");
                over = scanner.nextInt();
            }

            if(over != 1) {//繰り返ししないならプログラム終了
                f_try = 0;
                break;
               }

            
        }
        // }else {
        //     System.out.println("不明な操作です");
        // }
        //同一月を連続して出題しない
    }
}