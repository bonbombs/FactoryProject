package Submission;

import java.util.ArrayList;
import java.util.Collection;

import DontChange.IBuilding;
import DontChange.IClassroom;
import DontChange.IComputerLab;
import DontChange.ILectureHall;
import DontChange.IRoom;

public class Building implements IBuilding{

	Collection<IRoom> rooms = new ArrayList<IRoom>();;
	Collection<IClassroom> classrooms = new ArrayList<IClassroom>();
	Collection<ILectureHall> lectureHalls = new ArrayList<ILectureHall>();;
	Collection<IComputerLab> computerLabs = new ArrayList<IComputerLab>();;
	
	@Override
	public Collection<IRoom> getRooms() {
		return this.rooms;
	}

	@Override
	public void addRoom(IRoom newRoom) {
		//Add to their specific type of room
		if(newRoom.isClassroom()) this.classrooms.add((Classroom) newRoom);
		else if(newRoom.isLectureHall()) this.lectureHalls.add((LectureHall) newRoom);
		else if(newRoom.isComputerLab()) this.computerLabs.add((ComputerLab) newRoom);
		//Add to general list of rooms
		this.rooms.add(newRoom);
	}

	@Override
	public Collection<IClassroom> getClassrooms() {
		return this.classrooms;
	}

	@Override
	public Collection<ILectureHall> getLectureHalls() {
		return this.lectureHalls;
	}

	@Override
	public Collection<IComputerLab> getComputerLabs() {
		return this.computerLabs;
	}

}
