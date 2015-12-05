package Submission;

import DontChange.ComputerType;
import DontChange.IComputerLab;
import DontChange.IRoom;

public class ComputerLab implements IComputerLab{

	private int roomNum;
    private int roomSize;
    private ComputerType ctype;
    
    ComputerLab(int roomNum,int roomSize, ComputerType ctype){
    	this.roomNum = roomNum;
    	this.roomSize = roomSize;
    	this.ctype = ctype;
    }

	@Override
	public int roomSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isClassroom() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLectureHall() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isComputerLab() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRoomNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ComputerType getComputerType() {
		// TODO Auto-generated method stub
		return ctype;
	}

	@Override
	public void setComputerType(ComputerType t) {
		// TODO Auto-generated method stub
		this.ctype = t;
	}
	
}
