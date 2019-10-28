package DotComGame;

import java.util.*;

public class DotCom {
	//DotCom的实例变量
	private ArrayList<String> locationCells;//保存位置的ArrayList
	private String name;//DotCom的名称
	
	//更新DotCom位置的setter方法
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		//使用到indexOf()方法！如果玩家猜中，这个方法返回它的位置，否则返回-1
		int index = locationCells.indexOf(userInput);
		if(index >= 0) {
			locationCells.remove(index);//删除被猜中的元素
			
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
