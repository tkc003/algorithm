//1000�ȉ��̑f����񋓁i�R�j
//n�̕������ȉ��̂�����̑f���ł�����؂�Ȃ��B

class PrimeNumber3 {

  public static void main(String[] args) {
    int counter = 0;		//�揜�Z�̉�
    int ptr = 0;		//����ꂽ�f���̌�
    int[] prime = new int[500];	//�f�����i�[����z��prime�@�v�f��500

    prime[ptr++] = 2;		//2�͑f���@prime[0]=2�Aptr=1
    prime[ptr++] = 3;		//3�͑f��  prime[1]=3�Aptr=2

    for (int n = 5; n <= 1000; n += 2) {	//�Ώۂ͊�̂�
      boolean flag = false;			//�ϐ���flag��false����
      for(int i = 1; prime[i] * prime[i] <= n; i++) {	//prime[i]��2�悪n�ȉ��ł��邩
        counter += 2;
        if(n % prime[i] == 0) {	//����؂��Ƒf���ł͂Ȃ�
          flag = true;
          break;		//����ȏ�̌J��Ԃ��͕s�v
        }
      }
      if(!flag)	{		//�Ō�܂Ŋ���؂�Ȃ�������
        prime[ptr++] = n;	//�f���Ƃ��Ĕz��ɓo�^
        counter++;
      }
    }

    for (int i = 0; i < ptr; i++) 	//���߂�ptr�̑f����\��
      System.out.println(prime[i]);

    System.out.println("���Z���s�����񐔁F" + counter);
  }
}