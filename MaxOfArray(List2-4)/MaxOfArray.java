//�z��̗v�f�̍ő�l��\������B�i�l��ǂݍ��ށj

import java.util.Scanner;	//Scanner�̓ǂݍ���

class MaxOfArray{		//class�̍쐬

  static int maxOf(int[] a){	//�ő�l�����߂�
    int max = a[0];		//a[�C���f�b�N�X]
    for(int i = 1;i<a.length;i++)	//a(�z��ϐ���).length���z��\���v�f��
      if(a[i] > max)
        max = a[i];
    return max;
  }

  public static void main (String[] args){	//main��
    Scanner stdIn = new Scanner(System.in);	//stdIn

    System.out.println("�g���̍ő�l�����߂�B");
    System.out.print("�l���́F");
    int num = stdIn.nextInt();		//�v�f��num��ǂݍ���

    int[] height = new int[num];	//�v�f��num�̔z����쐬

    for (int i=0; i < num;i++) {
      System.out.print("height["+ i +"]�F");
      height[i] = stdIn.nextInt();
    }
//+maxOf(height)+�͂����ɐ錾���Ȃ������ق����ǂ�
    System.out.println("�ő�l��"+maxOf(height)+"�ł��B");
  }
}