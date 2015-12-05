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
		// TODO Auto-generated method stub
		return roomSize;
	}

	@Override
	public boolean isClassroom() {
		// TODO Auto-generated method stub
		return true;
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
		return "Classroom";
	}

	@Override
	public int getRoomNumber() {
		// TODO Auto-generated method stub
		return roomNum;
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
