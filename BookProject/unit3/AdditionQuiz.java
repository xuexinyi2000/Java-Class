package unit3;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(System.currentTimeMillis()%10);//�������������
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		//currentTimeMillis()��������õ�������1970��1��1����㵽Ŀǰ������һ���������ĵĺ�������ע�����ﷵ��ֵΪlong�ͣ�int�治����
		
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + number1 + " + " + number2 +"?");
		
		int answer = input.nextInt();
		
		System.out.println(
			number1 + " + " + number2 + " = " + answer + " is " +
			(number1+number2 == answer));//boolean���ʽ
		
		input.close();
	}

}
