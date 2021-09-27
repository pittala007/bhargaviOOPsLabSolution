package service;
import java.util.Random;
import model.Employee;

public class CredentialService {
	//method for generating password
	public char[] generatePassword() {
		String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters =  "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&_-+=<>?/.";
		String values = capitalletters + smallletters + numbers + specialCharacters;
		//using random method
		Random random = new Random();
		char[] password =  new char[8];
		for(int i = 0; i < 8;i ++) {
			//use of charAt() method : to get character value
			//use of nextInt() method : as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
		
		
		
	}
	//method for generating Email Address
	public String generateEmailAddress(String firstName,String lastName,String department) {
		return firstName+lastName+ "@"+ department+ ".abc.com";
	}
	public void showCredentials(Employee employee,String email,char[] generatePassword) {
		System.out.println("Dear" + employee.getFirstName()+ "your generated credentials are as follows");
		System .out.println("Email -->"+ email);
		System.out.println("Password --> 1" + "");
		System.out.println("generatedPassword");
	}
	

}


