package DotComGame;

import java.util.*;

public class DotCom {
	//DotCom��ʵ������
	private ArrayList<String> locationCells;//����λ�õ�ArrayList
	private String name;//DotCom������
	
	//����DotComλ�õ�setter����
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		//ʹ�õ�indexOf()�����������Ҳ��У����������������λ�ã����򷵻�-1
		int index = locationCells.indexOf(userInput);
		if(index >= 0) {
			locationCells.remove(index);//ɾ�������е�Ԫ��
			
			if(locationCells.isEmpty()) {
				result = "kill";
				System.out.println("Ouch! You sunk "+name+"  : (");
			}else {
				result = "hit";
			}
		}
		return result;
	}
}
