//1000以下の素数を列挙（３）
//nの平方根以下のいずれの素数でも割り切れない。

class PrimeNumber3 {

  public static void main(String[] args) {
    int counter = 0;		//乗除算の回数
    int ptr = 0;		//得られた素数の個数
    int[] prime = new int[500];	//素数を格納する配列prime　要素数500

    prime[ptr++] = 2;		//2は素数　prime[0]=2、ptr=1
    prime[ptr++] = 3;		//3は素数  prime[1]=3、ptr=2

    for (int n = 5; n <= 1000; n += 2) {	//対象は奇数のみ
      boolean flag = false;			//変数名flagにfalseを代入
      for(int i = 1; prime[i] * prime[i] <= n; i++) {	//prime[i]の2乗がn以下であるか
        counter += 2;
        if(n % prime[i] == 0) {	//割り切れると素数ではない
          flag = true;
          break;		//それ以上の繰り返しは不要
        }
      }
      if(!flag)	{		//最後まで割り切れなかったら
        prime[ptr++] = n;	//素数として配列に登録
        counter++;
      }
    }

    for (int i = 0; i < ptr; i++) 	//求めたptr個の素数を表示
      System.out.println(prime[i]);

    System.out.println("除算を行った回数：" + counter);
  }
}