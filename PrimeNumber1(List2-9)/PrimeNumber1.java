//1000�ȉ��̑f����񋓁i�P�j
//2����n-1�܂ł̂�����̐����ł�����؂�Ȃ��B

class PrimeNumber1 {

  public static void main(String[] args) {
    int counter = 0;		//���Z�̉�

    for (int n = 2; n <= 1000; n++) {
      int i;
      for(i = 2; i < n; i++) {
        counter++;
        if(n % i == 0)		//����؂��Ƒf���ł͂Ȃ�
          break;		//����ȏ�̌J��Ԃ��͕s�v
      }
      if(n == i)		//�Ō�܂Ŋ���؂�Ȃ������f��
        System.out.println(n);
    }

    System.out.println("���Z���s�����񐔁F" + counter);
  }
}