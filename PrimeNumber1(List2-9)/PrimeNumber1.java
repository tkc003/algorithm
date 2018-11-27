//1000ˆÈ‰º‚Ì‘f”‚ğ—ñ‹“i‚Pj
//2‚©‚çn-1‚Ü‚Å‚Ì‚¢‚¸‚ê‚Ì®”‚Å‚àŠ„‚èØ‚ê‚È‚¢B

class PrimeNumber1 {

  public static void main(String[] args) {
    int counter = 0;		//œZ‚Ì‰ñ”

    for (int n = 2; n <= 1000; n++) {
      int i;
      for(i = 2; i < n; i++) {
        counter++;
        if(n % i == 0)		//Š„‚èØ‚ê‚é‚Æ‘f”‚Å‚Í‚È‚¢
          break;		//‚»‚êˆÈã‚ÌŒJ‚è•Ô‚µ‚Í•s—v
      }
      if(n == i)		//ÅŒã‚Ü‚ÅŠ„‚èØ‚ê‚È‚©‚Á‚½‘f”
        System.out.println(n);
    }

    System.out.println("œZ‚ğs‚Á‚½‰ñ”F" + counter);
  }
}