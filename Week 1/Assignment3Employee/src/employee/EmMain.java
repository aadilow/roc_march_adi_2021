package employee;

public class EmMain {

	public static void main(String[] args) {
		//Adam
		EmployeeClass NewHire1=new EmployeeClass(4344,"Adam");
		AddressClass presA=new AddressClass(555,"dog st",92999);
		AddressClass permA=new AddressClass(777, "cat st",77007);
		ProjectClass proj1= new ProjectClass(9003,"smile","D Ltd");
		
		NewHire1.setEmail("Adam@ee.cc");
		NewHire1.setAge(64);
		NewHire1.setCity("Miami");
		NewHire1.setProj(proj1);
		NewHire1.setPermAdr(permA);
		NewHire1.setPresAdr(presA);
		
		//Eve
		AddressClass presadr= new AddressClass(555,"dog st",92999);
		AddressClass permadr= new AddressClass(777, "cat st",77007);
		ProjectClass proj2 = new ProjectClass(0000,"unassigned","unassigned");
		
		EmployeeClass NewHire2= new EmployeeClass(2044,"Eve","eve@ee.cc","Miami",64,presadr,permadr,proj2);
		
		//Cain
		EmployeeClass NewHire3 =new EmployeeClass(9549,"Cain",null,null,63,null,null,proj2);
		
	
		System.out.println(NewHire1);
		System.out.println(NewHire2);
		System.out.println(NewHire3);
		
		System.out.println(proj1);
	}

}
