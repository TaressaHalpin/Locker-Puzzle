
/*
 CIS 209: INTRODUCTION TO JAVA 
 CHAPTER 7 PROJECT 
 TARESSA HALPIN 
 11-13-17
 
 LOCKER PROBLEM: 
 A school has 100 lockers and 100 students. All lockers are closed on the first day of school. 
 As the students enter, the first student, denoted S1, opens every locker. 
 Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker. 
 Student S3 begins with the third locker and changes every third locker.
 (closes it if it was open, and opens it if it was closed)
 Student S4 begins with locker L4 and changes every fourth locker. 
 Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.

After all the students have passed through the building and changed the lockers, which lockers are open? 
  
 */

public class SchoolLockers {
    /*MAIN METHOD*/
	public static void main(String[] args)
	{
		/*BOOLEAN ARRAY LOCKERS NEW BOOLEAN ARRAY*/
		boolean[] lockers = new boolean[101];
		/*FOR LOOP: FIRST VALUE - LOCKERS.LENGTH - INCREMENT*/
		for (int firstValue = 1; firstValue < lockers.length; firstValue++)
		{
			//LOCKERS FIRSTVALUE ARRAY SET TO TRUE
			lockers[firstValue] = true;
		}
		//FOR LOOP: INT FIRST VALUE 2, LESS THAN OR EQUAL TO 100, INCREMENTATION
		for(int firstValue = 2; firstValue <= 100; firstValue++)
		{
			//NESTED FOR LOOP: SECOND VALUE SET, LESS THAN OR EQUAL TO 100, INCREMENTATION
			for(int secondValue = 1; firstValue * secondValue <= 100; secondValue++)
			{
				//LOCKERS ARRAY MULTIPLICATION - BOOLEAN TRUE OR FALSE 
				lockers[firstValue * secondValue] = (lockers)[firstValue * secondValue] == true ? false:true;
			}
		}
		//FOR LOOP: FIRST VALUE, LOCKERS.LENGTH, INCREMENTATION
		for (int firstValue = 0; firstValue < lockers.length; firstValue++)
		{ 
			//IF: LOCKERS FIRST VALUE ARRAY SET TO TRUE
			if (lockers[firstValue] == true)
				//PRINTS OUT LOCKER - FIRSTVALUE - IS OPEN 
				System.out.println("LOCKER: " + firstValue + " IS OPEN.");
		}	
	}
}
