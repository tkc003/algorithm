//1000�ȉ��̑f����񋓁i�Q�j
//2����n-1�܂ł̂�����̑f���ł�����؂�Ȃ��B

class PrimeNumber2 {

  public static void main(String[] args) {
    int counter = 0;		//���Z�̉�
    int ptr = 0;		//����ꂽ�f���̌�
    int[] prime = new int[500];	//�f�����i�[����z��prime�@�v�f��500

    prime[ptr++] = 2;		//2�͑f���@prime[0]=2�Aptr=1

    for (int n = 3; n <= 1000; n += 2) {	//�Ώۂ͊�̂�
      int i;
      for(i = 1; i < ptr; i++) {	//���łɓ���ꂽ�f���Ŋ����Ă݂�B
        counter++;
        if(n % prime[i] == 0)	//����؂��Ƒf���ł͂Ȃ�
          break;		//����ȏ�̌J��Ԃ��͕s�v
      }
      if(ptr == i)		//�Ō�܂Ŋ���؂�Ȃ�������
        prime[ptr++] = n;	//�f���Ƃ��Ĕz��ɓo�^
    }

    for (int i = 0; i < ptr; i++) 	//���߂�ptr�̑f����\��
      System.out.println(prime[i]);

    System.out.println("���Z���s�����񐔁F" + counter);
  }
}