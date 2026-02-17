import java.time.*;

public class Lab6Submission {
	public static void Main(String[] args) {
		Ar_UList myArUList = new Ar_UList();
		LocalDateTime t1 = LocalDateTime.now();
		//Execute putItem 250000 times on Ar_UList
		for(int i=1; i<=250000; i++) {
			myArUList.putItem(i);
		}
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println("Ar_UList PutItem Duration: " + Duration.between(t1, t2).toMillis());
		LocalDateTime t3 = LocalDateTime.now();
		for(int i=1; i<=250000; i++) { //Searching instead of adding
			myArUList.getItem(i);
		}
		LocalDateTime t4 = LocalDateTime.now();
		System.out.println("Ar_UList GetItem Duration: " + Duration.between(t3, t4));
		
		Ar_SList myArSList = new Ar_SList();
		
		LocalDateTime t5 = LocalDateTime.now();
		for(int i=1; i<=250000; i++) {
			myArSList.putItem(i);
		}
		LocalDateTime t6 = LocalDateTime.now();
		System.out.println("Ar_SList PutItem Duration: " + Duration.between(t5, t6));
		
		LocalDateTime t7 = LocalDateTime.now();
		for(int i=1; i<=250000; i++) { //Searching instead of adding
			myArSList.getItem(i);
		}
		LocalDateTime t8 = LocalDateTime.now();
		System.out.println("Ar_Slist GetItem Duration: " + Duration.between(t7, t8));
		
		
		
	}
	
}
