//�z��̗v�f�̍ő�l��\������B�i�l�͗����ŕ\���j

import java.util.Random;	//�������g�p	
import java.util.Scanner;	//�ǂݍ��݂𗘗p

class MaxOfArrayRand{	//class�̍쐬

  static int maxOf(int[] a){	//�ő�l�����߂�
    int max = a[0];		//a[�C���f�b�N�X]
    for(int i = 1;i<a.length;i++)	//a(�z��ϐ���).length���z��\���v�f��
      if(a[i] > max)
        max = a[i];
    return max;
  }

  public static void main (String[] args){	//main��
    Random rand = new Random();			//Random�N���X�^�̕ϐ�rand��錾
    Scanner stdIn = new Scanner(System.in);	

    System.out.println("�g���̍ő�l�����߂�B");
    System.out.print("�l���́F");
    int num = stdIn.nextInt();		//�v�f��num��ǂݍ���

    int[] height = new int[num];	//�v�f��num�̔z����쐬

    System.out.println("�g���͎��̂悤�ɂȂ��Ă���܂��B");
    for (int i=0; i < num;i++) {
      height[i] = 100 + rand.nextInt(90);	//height[i]�ɑ�������g����100�`189

      System.out.println("height["+ i +"]�F" + height[i]);
    }
//+maxOf(height)+�͂����ɐ錾���Ȃ������ق����ǂ�
    System.out.println("�ő�l��"+ maxOf(height) +"�ł��B");
  }
}