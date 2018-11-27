//1000ˆÈ‰º‚Ì‘f”‚ğ—ñ‹“i‚Qj
//2‚©‚çn-1‚Ü‚Å‚Ì‚¢‚¸‚ê‚Ì‘f”‚Å‚àŠ„‚èØ‚ê‚È‚¢B

class PrimeNumber2 {

  public static void main(String[] args) {
    int counter = 0;		//œZ‚Ì‰ñ”
    int ptr = 0;		//“¾‚ç‚ê‚½‘f”‚ÌŒÂ”
    int[] prime = new int[500];	//‘f”‚ğŠi”[‚·‚é”z—ñprime@—v‘f”500

    prime[ptr++] = 2;		//2‚Í‘f”@prime[0]=2Aptr=1

    for (int n = 3; n <= 1000; n += 2) {	//‘ÎÛ‚ÍŠï”‚Ì‚İ
      int i;
      for(i = 1; i < ptr; i++) {	//‚·‚Å‚É“¾‚ç‚ê‚½‘f”‚ÅŠ„‚Á‚Ä‚İ‚éB
        counter++;
        if(n % prime[i] == 0)	//Š„‚èØ‚ê‚é‚Æ‘f”‚Å‚Í‚È‚¢
          break;		//‚»‚êˆÈã‚ÌŒJ‚è•Ô‚µ‚Í•s—v
      }
      if(ptr == i)		//ÅŒã‚Ü‚ÅŠ„‚èØ‚ê‚È‚©‚Á‚½‚ç
        prime[ptr++] = n;	//‘f”‚Æ‚µ‚Ä”z—ñ‚É“o˜^
    }

    for (int i = 0; i < ptr; i++) 	//‹‚ß‚½ptrŒÂ‚Ì‘f”‚ğ•\¦
      System.out.println(prime[i]);

    System.out.println("œZ‚ğs‚Á‚½‰ñ”F" + counter);
  }
}