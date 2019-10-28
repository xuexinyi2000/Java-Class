package DotComGame;

import java.util.*;

//import simpleDotComTestDrive.GameHelper;

public class DotComBust {
	//��������ʼ������
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		//����3��DotCom����ָ�����Ʋ�����ArrayList
		DotCom one = new DotCom();
		one.setName("Pets.com"); 
		DotCom two = new DotCom();
		two.setName("eToys.com"); 
		DotCom three = new DotCom();
		three.setName("Go2.com"); 
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		//�г���̵���ʾ
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com,eToys.com,Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		//��list�����е�DotCom�ظ�
		for(DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);//Ҫ��DotCom��λ��
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		
		for(DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			
			if(result.equals("hit")) {
				break;
			}
			
			if(result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
			System.out.println(result);
		}
	}
	
	private void finishGame() {
		System.out.println("All Dot Coms are dead!Your stock is now worthless.");
		if(numOfGuesses <=18) {
			System.out.println("It only took you "+numOfGuesses+" guesses.");
		}else {
			System.out.println("Took you long enough"+numOfGuesses+" guesses.");
		}
	}
	
	public static void main (String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
