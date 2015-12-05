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
	    IClassroom r114 = new Classroom(114, 35, DeskType.SWINGOUT);
	    ILectureHall r116 = new LectureHall(116, 90,  DeskType.LONGTABLES);
	    IClassroom r202 = new Classroom(202,35, DeskType.LONGTABLES);
	    ILectureHall r218 = new LectureHall(218, 90, DeskType.LONGTABLES);
	    IComputerLab r230 = new ComputerLab(230, 40, ComputerType.WINDOWS);
	    higgins.addRoom(r114);
	    higgins.addRoom(r116);
	    higgins.addRoom(r202);
	    higgins.addRoom(r218);
	    higgins.addRoom(r230);
	    
	    return higgins;
	}
	public static IBuilding createFuller(){
		// Fill in driver code here
	    Building fuller = new Building();
	    IComputerLab f021 = new ComputerLab(021, 25, ComputerType.WINDOWS);
	    ILectureHall f100 = new LectureHall(100, 102, DeskType.SWINGOUT);
	    ILectureHall f200 = new LectureHall(200, 196, DeskType.SWINGOUT);
	    IComputerLab f222 = new ComputerLab(222, 27,ComputerType.LINUX);
	    IClassroom f311 = new Classroom(311, 38, DeskType.LONGTABLES);
	    IClassroom f320 = new Classroom(320,65, DeskType.SWINGOUT);
	    fuller.addRoom(f021);
	    fuller.addRoom(f100);
	    fuller.addRoom(f200);
	    fuller.addRoom(f222);
	    fuller.addRoom(f311);
	    fuller.addRoom(f320);
	    
	    return fuller;
	}
	
	public static IBuilding createSalisbury(){
		// Fill in driver code here
		return null;
	}
}
