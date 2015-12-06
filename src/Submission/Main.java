package Submission;

import DontChange.DeskType;
import DontChange.ComputerType;
import DontChange.IBuilding;
import DontChange.IClassroom;
import DontChange.IComputerLab;
import DontChange.ILectureHall;

public class Main {
	public static IBuilding createHiggins(){
		// Fill in driver code here
	    Building higgins = new Building();
	    RoomFactory higginsRF = new RoomFactory();
	    higgins.addRoom(higginsRF.getRoom(114, 35, DeskType.SWINGOUT));
	    higgins.addRoom(higginsRF.getRoom(116, 90, DeskType.LONGTABLES));
	    higgins.addRoom(higginsRF.getRoom(202, 35, DeskType.LONGTABLES));
	    higgins.addRoom(higginsRF.getRoom(114, 35, DeskType.LONGTABLES));
	    higgins.addRoom(higginsRF.getRoom(114, 35, ComputerType.WINDOWS));
	    
	    return higgins;
	}
	public static IBuilding createFuller(){
		// Fill in driver code here
	    Building fuller = new Building();
	    RoomFactory fullerRF = new RoomFactory();
	    fuller.addRoom(fullerRF.getRoom(021, 25, ComputerType.WINDOWS));
	    fuller.addRoom(fullerRF.getRoom(100, 102, DeskType.SWINGOUT));
	    fuller.addRoom(fullerRF.getRoom(200, 196, DeskType.SWINGOUT));
	    fuller.addRoom(fullerRF.getRoom(222, 27,ComputerType.LINUX));
	    fuller.addRoom(fullerRF.getRoom(311, 38, DeskType.LONGTABLES));
	    fuller.addRoom(fullerRF.getRoom(320, 65, DeskType.SWINGOUT));
	    
	    return fuller;
	}
	
}
