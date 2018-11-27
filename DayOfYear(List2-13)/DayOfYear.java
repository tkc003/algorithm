import java.util.Scanner;

class DayOfYear {

  //�e���̓���
  static int[][] mdays ={
    {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},  //���N
    {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},  //�[�N
  };

  //--- ����year�N�͉[�N���i�[�N�F1/���N�F0�j---//
  static int isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
  }

  //--- ����y�Nm��d���̔N���̌o�ߓ��������߂� ---//
  static int dayOfYear(int y, int m, int d) {
    int days = d;

    for(int i = 1; i < m; i++)
      days += mdays[isLeap(y)][i - 1];
    return days;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int retry;                             //������x�H

    System.out.println("�N���̌o�ߓ��������߂܂��B");

    do{
      System.out.print("�N�F"); int year  = stdIn.nextInt();  //�N
      System.out.print("���F"); int month = stdIn.nextInt();  //��
      System.out.print("���G"); int day   = stdIn.nextInt();  //��

      System.out.printf("�N����%d���ڂł��B\n", dayOfYear(year, month, day));
      System.out.printf("������x���܂����i1�c�͂�/0�c�������j�F");
      retry = stdIn.nextInt();
    }while (retry == 1);
  }
}