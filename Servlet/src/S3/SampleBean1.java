package S3;
import java.io.Serializable;

public class SampleBean1 implements Serializable{
	private String userName;
	private String userPass;

	public SampleBean1(){
	}
	public SampleBean1(String name,String pass){
		userName = name;
		userPass = pass;
	}
	public void setuserName(String name){
		userPass = name;
	}
	public void setuserPass(String pass){
		userPass = pass;
	}
	public String getuserName(){
		return userName;
	}
	public String getuserPass(){
		return userPass;
	}
}
