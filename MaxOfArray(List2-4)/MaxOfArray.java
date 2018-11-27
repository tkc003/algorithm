//配列の要素の最大値を表示する。（値を読み込む）

import java.util.Scanner;	//Scannerの読み込み

class MaxOfArray{		//classの作成

  static int maxOf(int[] a){	//最大値を求める
    int max = a[0];		//a[インデックス]
    for(int i = 1;i<a.length;i++)	//a(配列変数名).length＝配列構成要素数
      if(a[i] > max)
        max = a[i];
    return max;
  }

  public static void main (String[] args){	//main文
    Scanner stdIn = new Scanner(System.in);	//stdIn

    System.out.println("身長の最大値を求める。");
    System.out.print("人数は：");
    int num = stdIn.nextInt();		//要素数numを読み込み

    int[] height = new int[num];	//要素数numの配列を作成

    for (int i=0; i < num;i++) {
      System.out.print("height["+ i +"]：");
      height[i] = stdIn.nextInt();
    }
//+maxOf(height)+はここに宣言しなおしたほうが良い
    System.out.println("最大値は"+maxOf(height)+"です。");
  }
}