package Submission;

import DontChange.ComputerType;
import DontChange.IComputerLab;
import DontChange.IRoom;

public class ComputerLab extends Room implements IComputerLab{

    private ComputerType ctype;
    
    ComputerLab(int roomNum,int roomSize, ComputerType ctype){
    	super(roomNum, roomSize);
    	this.ctype = ctype;
    }

	@Override
	public int roomSize() {
		return this.roomSize;
	}

	@Override
	public boolean isClassroom() {
		return false;
	}

	@Override
	public boolean isLectureHall() {
		return false;
	}

	@Override
	public boolean isComputerLab() {
		return true;
	}

	@Override
	public String getType() {
		return "Computer Lab";
	}

	@Override
	public int getRoomNumber() {
		return this.roomNum;
	}

	@Override
	public ComputerType getComputerType() {
		return this.ctype;
	}

	@Override
	public void setComputerType(ComputerType t) {
		this.ctype = t;
	}
	
}
