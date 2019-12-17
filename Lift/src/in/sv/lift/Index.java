package in.sv.lift;

public class Index {
	public static void main(String[] args) {
//		String floor;
//		short floorNo;
//		char liftArr[];
//		char liftBlock[][] = createArray();
//		int index = liftBlock.length - 1;
//		
//		System.out.println("F  ===== ===== =====");
//		
//		for (int i = index; i >= 0; i--) {
//			floorNo = (short) (i);
//			liftArr = liftBlock[i];
//			floor = floorFormation(floorNo, liftArr[0], liftArr[0], liftArr[0]);
//			System.out.println(floor);
//		}
//		
//		System.out.println("F  ===== ===== =====");
		
//		System.out.println("F  ===== ===== =====");
//		System.out.println("5)  | |   | |   | |");
//		System.out.println("4)  | |   | |   | |");
//		System.out.println("3)  | |   | |   | |");
//		System.out.println("2)  | |   |D|   | |");
//		System.out.println("1)  |U|   | |   |N|");
//		System.out.println("F  ===== ===== =====");
		Lift liftSys = new Lift();
		short liftNo = 1;
		short floorNo = 2;
		liftSys.move(liftNo, floorNo);
	}
	
	public static char[][] createArray() {
		char liftBlock[][] = new char[5][3];
		liftBlock[0][0] = 'N';
		liftBlock[1][0] = ' ';
		liftBlock[2][0] = ' ';
		liftBlock[3][0] = ' ';
		liftBlock[4][0] = ' ';
		
		liftBlock[0][1] = 'N';
		liftBlock[1][1] = ' ';
		liftBlock[2][1] = ' ';
		liftBlock[3][1] = ' ';
		liftBlock[4][1] = ' ';
		
		liftBlock[0][2] = 'N';
		liftBlock[1][2] = ' ';
		liftBlock[2][2] = ' ';
		liftBlock[3][2] = ' ';
		liftBlock[4][2] = ' ';
		return liftBlock;
	}
	
	public static String floorFormation(short floorNo, char lift1, char lift2, char lift3) {
		String output;
		output = floorNo + ")  |" + lift1 + "|   |" + lift2 +"|   |" + lift3 + "|";
		return output;
	}
}
