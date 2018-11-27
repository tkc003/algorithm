//配列の要素の最大値を表示する。（値は乱数で表示）

import java.util.Random;	//乱数を使用	
import java.util.Scanner;	//読み込みを利用

class MaxOfArrayRand{	//classの作成

  static int maxOf(int[] a){	//最大値を求める
    int max = a[0];		//a[インデックス]
    for(int i = 1;i<a.length;i++)	//a(配列変数名).length＝配列構成要素数
      if(a[i] > max)
        max = a[i];
    return max;
  }

  public static void main (String[] args){	//main文
    Random rand = new Random();			//Randomクラス型の変数randを宣言
    Scanner stdIn = new Scanner(System.in);	

    System.out.println("身長の最大値を求める。");
    System.out.print("人数は：");
    int num = stdIn.nextInt();		//要素数numを読み込み

    int[] height = new int[num];	//要素数numの配列を作成

    System.out.println("身長は次のようになっております。");
    for (int i=0; i < num;i++) {
      height[i] = 100 + rand.nextInt(90);	//height[i]に代入される身長は100～189

      System.out.println("height["+ i +"]：" + height[i]);
    }
//+maxOf(height)+はここに宣言しなおしたほうが良い
    System.out.println("最大値は"+ maxOf(height) +"です。");
  }
}