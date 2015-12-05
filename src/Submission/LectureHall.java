package Submission;

import DontChange.DeskType;
import DontChange.ILectureHall;
import DontChange.IRoom;

public class LectureHall implements ILectureHall{
	private int roomNum;
    private int roomSize;
    private DeskType dtype;
    
    LectureHall(int roomNum, int roomSize, DeskType dtype){
    	this.roomNum = roomNum;
    	this.roomSize = roomSize;
    	this.dtype = dtype;  
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
		return true;
	}

	@Override
	public boolean isComputerLab() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Lecture Hall";
	}

	@Override
	public int getRoomNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DeskType getDeskType() {
		// TODO Auto-generated method stub
		return dtype;
	}

	@Override
	public void setDeskType(DeskType t) {
		// TODO Auto-generated method stub
		this.dtype = t;
	}

}
