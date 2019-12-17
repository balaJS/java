package in.sv.lift;

public class Lift {
	private char lifts[][];
	private char status;
	private short currentFloor;
	private short sequence[];
	public Lift() {
		String floor;
		short floorNo;
		char liftArr[];
		this.setLifts();
		char liftBlock[][] = this.getLifts();
		short index = (short) (liftBlock.length - 1);
		
		System.out.println("F  ===== ===== =====");
		for (short i = index; i >= 0; i--) {
			floorNo = (short) (i + 1);
			liftArr = liftBlock[i];
			floor = floorFormation(floorNo, liftArr[0], liftArr[0], liftArr[0]);
			System.out.println(floor);
		}
		System.out.println("F  ===== ===== =====");
	}
	
	protected void setLifts() {
		this.lifts = this.createArray();
	}
	
	protected char[][] getLifts() {
		return this.lifts;
	}
	
	protected void setSequence(short seq[]) {
		this.sequence = seq;
	}
	
	protected short[] getSequence() {
		return this.sequence;
	}
	
	public void setLift(short floorNo, short liftNo, char operation) {
		this.lifts[floorNo][liftNo] = operation;
	}
	
	public char getLift(short floorNo, short liftNo) {
		return this.lifts[floorNo][liftNo];
	}
	
	protected void setStatus(char status) {
		this.status = status;
	}
	
	protected char getStatus() {
		return this.status;
	}
	
	public char getCurrentStatus(short liftNo) {
		for (int i = 0; i < this.lifts.length; i++) {
			if (this.lifts[i][liftNo] != ' ') {
				this.setStatus(this.lifts[i][liftNo]);
				break;
			}
		}
		return this.getStatus();
	}
	
	protected void setCurrentFloor(short floorNo) {
		this.currentFloor = floorNo;
	}
	
	protected short getCurrentFloor() {
		return this.currentFloor;
	}
	
	public short _getCurrentFloor(short liftNo) {
		for (int i = 0; i < this.lifts.length; i++) {
			if (this.lifts[i][liftNo] != ' ') {
				this.setCurrentFloor((short) (i + 1));
				break;
			}
		}
		return this.getCurrentFloor();
	}
	
	private static String floorFormation(short floorNo, char lift1, char lift2, char lift3) {
		String output;
		output = floorNo + ")  |" + lift1 + "|   |" + lift2 +"|   |" + lift3 + "|";
		return output;
	}
	
	private char[][] createArray() {
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
	
	public void move(short liftNo, short floorNo) {
		short currentFloor = _getCurrentFloor(liftNo);
		char getCurrentStatus = getCurrentStatus(liftNo);
//		will write lifting moving logic here.
		System.out.println("currentFloor + getCurrentStatus => " + currentFloor + " , " + getCurrentStatus);
	}
}
