//package renn;


import java.util.Random;
import java.util.Scanner;

public class main {

 public static void main(String[] args) {
  // TODO 自動生成されたメソッド・スタブ
  Scanner scanner=new Scanner(System.in);
  Random rand=new Random();

  String[] a= {"January","February","March","April","May","June","July","August","September","October",
    "November","December"};

  int buf=13;//前回の月を記録。
  while(true) {
   int b;//表示する月
   if(buf!=13) {
    b=rand.nextInt(11)+1;//1~11までの乱数
   }else {//一回目だけの処理
    b=rand.nextInt(12)+1;//1~12までの乱数
   }

   if(b>=buf) {//前回の月以上ならプラス１
    b++;
   }

   buf=b;

   System.out.print(b+"月:");//問題を表示
   String c=scanner.next();//解答を入力
   int g;
   if(c.equals(a[b-1])){//正解の処理
    System.out.print("正解です\n");

    System.out.print("もう一度?:YESなら1");
    g=scanner.nextInt();//繰り返し操作
   }else{
    System.out.print("不正解です");

    System.out.print("\nもう一度?:YESなら1:");
    g=scanner.nextInt();

   }

   if(g!=1) {//繰り返ししないならプログラム終了
    break;
   }

  }

 }

}
