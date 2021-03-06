package employee;

public class ProjectClass {
	
	private int projectid;
	private String projectname;
	private String clientname;
	
	public ProjectClass(int projectid,String projectname,
			String clientname){
		this.projectid=projectid;
		this.projectname=projectname;
		this.clientname=clientname;
	}
	
	public String toString() {
		return "[PID= " +projectid + ", Project Name: " +projectname +", Client Name: " +clientname + "]";
	}
}
