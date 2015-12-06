package Submission;

import DontChange.*;

public class RoomFactory {

	public IRoom getRoom(int roomNum, int roomSize, DeskType deskType ){
		if((roomSize >= 15) && (roomSize <= 60)) {
			return new Classroom(roomNum, roomSize, deskType);
		}
		else if(roomSize >= 61 && roomSize<= 200) {
			return new LectureHall(roomNum, roomSize, deskType);
			
		}
		else {
			return new Room(roomNum, roomSize);
		}
	}
	
	public IRoom getRoom(int roomNum, int roomSize, ComputerType computerType){
		if(roomSize >= 25 && roomSize <= 40) {
			return new ComputerLab(roomNum, roomSize, computerType);
		}
		else return new Room(roomNum, roomSize);
	}

}
