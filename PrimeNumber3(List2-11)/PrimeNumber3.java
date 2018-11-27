//1000ˆÈ‰º‚Ì‘f”‚ğ—ñ‹“i‚Rj
//n‚Ì•½•ûªˆÈ‰º‚Ì‚¢‚¸‚ê‚Ì‘f”‚Å‚àŠ„‚èØ‚ê‚È‚¢B

class PrimeNumber3 {

  public static void main(String[] args) {
    int counter = 0;		//æœZ‚Ì‰ñ”
    int ptr = 0;		//“¾‚ç‚ê‚½‘f”‚ÌŒÂ”
    int[] prime = new int[500];	//‘f”‚ğŠi”[‚·‚é”z—ñprime@—v‘f”500

    prime[ptr++] = 2;		//2‚Í‘f”@prime[0]=2Aptr=1
    prime[ptr++] = 3;		//3‚Í‘f”  prime[1]=3Aptr=2

    for (int n = 5; n <= 1000; n += 2) {	//‘ÎÛ‚ÍŠï”‚Ì‚İ
      boolean flag = false;			//•Ï”–¼flag‚Éfalse‚ğ‘ã“ü
      for(int i = 1; prime[i] * prime[i] <= n; i++) {	//prime[i]‚Ì2æ‚ªnˆÈ‰º‚Å‚ ‚é‚©
        counter += 2;
        if(n % prime[i] == 0) {	//Š„‚èØ‚ê‚é‚Æ‘f”‚Å‚Í‚È‚¢
          flag = true;
          break;		//‚»‚êˆÈã‚ÌŒJ‚è•Ô‚µ‚Í•s—v
        }
      }
      if(!flag)	{		//ÅŒã‚Ü‚ÅŠ„‚èØ‚ê‚È‚©‚Á‚½‚ç
        prime[ptr++] = n;	//‘f”‚Æ‚µ‚Ä”z—ñ‚É“o˜^
        counter++;
      }
    }

    for (int i = 0; i < ptr; i++) 	//‹‚ß‚½ptrŒÂ‚Ì‘f”‚ğ•\¦
      System.out.println(prime[i]);

    System.out.println("œZ‚ğs‚Á‚½‰ñ”F" + counter);
  }
}