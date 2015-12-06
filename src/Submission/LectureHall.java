package Submission;

import DontChange.DeskType;
import DontChange.ILectureHall;
import DontChange.IRoom;

public class LectureHall extends Room implements ILectureHall{
    private DeskType dtype;
    
    LectureHall(int roomNum, int roomSize, DeskType dtype){
    	super(roomNum, roomSize);
    	this.dtype = dtype;  
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
		return true;
	}

	@Override
	public boolean isComputerLab() {
		return false;
	}
	
	@Override
	public boolean isTiered(){
		return true;
	}

	@Override
	public String getType() {
		return "Lecture Hall";
	}

	@Override
	public int getRoomNumber() {
		return this.roomNum;
	}

	@Override
	public DeskType getDeskType() {
		return this.dtype;
	}

	@Override
	public void setDeskType(DeskType t) {
		this.dtype = t;
	}

}
