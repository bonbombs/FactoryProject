package Submission;

import DontChange.DeskType;
import DontChange.IClassroom;

public class Classroom implements IClassroom {
    
	private int roomNum;
    private int roomSize;
    private DeskType dtype;
    
    Classroom(int roomNum, int roomSize, DeskType dtype){
        this.roomNum = roomNum;
    	this.roomSize = roomSize;
        this.dtype = dtype;
        
    }

	@Override
	public int roomSize() {
		return this.roomSize;
	}

	@Override
	public boolean isClassroom() {
		return true;
	}

	@Override
	public boolean isLectureHall() {
		return false;
	}

	@Override
	public boolean isComputerLab() {
		return false;
	}

	@Override
	public String getType() {
		return "Classroom";
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
