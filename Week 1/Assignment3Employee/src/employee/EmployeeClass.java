package employee;

public class EmployeeClass {
	
		
		private int id;
		private String name;
		private String city;
		private int age;
		private String email;
		private AddressClass presentadr;
		private AddressClass permanentadr;
		private ProjectClass project;
		
		public EmployeeClass(int id, String name) {
			this.id=id;
			this.name=name;
		}
		
		public EmployeeClass(int id, String name, String email, String city, int age){
			
			this(id,name);
			
			this.email=email;
			this.age=age;
			this.city=city;	
		}
		
		public EmployeeClass(int id, String name, String email, String city, int age,
				AddressClass presentadr, AddressClass permanentadr) {
			
			this(id,name,email,city,age);
			
			this.presentadr=presentadr;
			this.permanentadr=permanentadr;
			
		}
		
		public EmployeeClass(int id, String name, String email, String city, int age,
				AddressClass presentadr, AddressClass permanentadr, ProjectClass project) {
			
			this(id,name,email,city,age,presentadr,permanentadr);
			this.project=project;
			
		}
		
		public void setEmail(String email) {
			this.email=email;
		}
		
		public void setAge(int age) {
			this.age=age;
		}
		
		public void setCity(String city) {
			this.city=city;
		}
		
		public void setPresAdr(AddressClass presentadr) {
			this.presentadr=presentadr;
		}
		
		public void setPermAdr(AddressClass permanentadr) {
			this.permanentadr=permanentadr;
		}
		
		public void setProj(ProjectClass project) {
			this.project=project;
		}
		
		@Override  //annotation
		public String toString() {
			return "Employee [id: " + id + ", name: " + name + ", email: " + email + ", city: " + city + ", age: " + age + ", Present Address: "
					+ presentadr + ", Permanent Address: " + permanentadr +", Project: " +project + "]";
		}
	}
	

