package day4;

class Trainee{
	//instance variables
	public int traineeId;
	public String traineeName;
	public char gender;
	public long phoneNo;
	//instance method
	public void display_details(){
		System.out.println("Trainee details are: "+traineeId+" "+traineeName);
		System.out.println("---"+gender+" "+phoneNo);
	}
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee tobj = new Trainee(); //tobj is refernce variable
		tobj.traineeId = 1109059;
		tobj.traineeName = "Pranav Goyal";
		tobj.gender = 'M';
		tobj.phoneNo = 9460533315L;
		tobj.display_details();
		
	}

}
