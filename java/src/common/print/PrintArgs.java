package common.print;

public class PrintArgs{

	public static void main(String[] args){
		String str = "";
		for(String arg : args){
			str += arg + ", ";
		}
		if(!str.isEmpty()){
			str = str.substring(0, str.length() - 2);
			System.out.println(str);
		}else{
			System.out.println("No Args");
		}
	}
}
