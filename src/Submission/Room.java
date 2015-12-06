package Submission;

import DontChange.IRoom;

public class Room implements IRoom{
	
	protected int roomSize;
	protected int roomNum;

	public Room (int roomSize, int roomNum){
		this.roomSize = roomSize;
		this.roomNum = roomNum;
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
		return false;
	}

	public boolean isTiered(){
		return false;
	}
	
	@Override
	public String getType() {
		return "Room";
	}

	@Override
	public int getRoomNumber() {
		return this.roomNum;
	}

}
