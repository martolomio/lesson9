/*
 * LOGOS It Academy homework
 */

package com.homework.task9;

/**
 * @since java 1.8
 * @author Martha
 * @versoin 1.2
 * */

import java.util.Scanner;

public class Main  {
	
	/**
	 * @exception ConsoleParametersException
	 * @author Mirth
	 * @see java code convention
	 */
	
	static void menu() {
		
		System.out.println("1 щоб перев≥рити чи Ї такий м≥с€ць");
		System.out.println("2 вивести вс≥ м≥с€ц≥ з данноњ пори року");
		System.out.println("3 вивести м≥с€ц≥ з одинаковою к≥льк≥стю дн≥в");
		System.out.println("4 вивести вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("5 вивести вс≥ м≥с€ц≥ €к≥ мають найменшу к≥льк≥сть дн≥в");
		System.out.println("6 вивести наступну пору року");
		System.out.println("7 вивести попередню пору року");
		System.out.println("8 вивести вс≥ м≥с€ц≥ що мають парну к≥льк≥сть дн≥в");
		System.out.println("9 вивести вс≥ м≥с€ц≥ що мають непарну к≥льк≥сть дн≥в");
		System.out.println("10 чи введений м≥с€ць з консол≥ маЇ парну к≥льк≥сть дн≥в");
	}
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Months [] month  =  Months.values();
		Seasons[] sea2 = Seasons.values();
	
		Scanner scaner = new Scanner (System.in);
		
		while (true) {
			menu();
			
			switch (scaner.next()) {
			
			//check if there is such a month
			
			case"1": {
				System.out.println("¬вед≥ть м≥с€ць");
				scaner = new Scanner (System.in);
				String months= scaner.next().toUpperCase();
			
				boolean flag = false;
				
				for (Months m : Months.values()) {
				
					if (m.name().equals(months)) {
						System.out.println("true month");
						flag = true;
					}	
				}
				if(!flag) {
					
					try {
						throw new ConsoleParametersException("Unknown season or you write wrong text");
					}catch(ConsoleParametersException e){
						System.err.println(e);
						flag = false;
					}
				}
					
				break;
				}
			
			//displays all months from this time of year
			
			case "2":{
				System.out.println("¬вед≥ть пору року");
				scaner = new Scanner (System.in);
				String seasonCs = scaner.next().toUpperCase();
			
					boolean flag = false;
					
					for (Months s : Months.values()) {
						if (s.getSeasons().name().equals(seasonCs)) {
							flag = true;
						}	
					}
					if (flag) {
						Seasons sea = Seasons.valueOf(seasonCs);
						
						for(Months s: month) {
							if(s.getSeasons().toString().equalsIgnoreCase(seasonCs)) {
								System.out.println(s);
								
								}
							}
						}else { 
							//use my Excpetion
							try {
								throw new ConsoleParametersException("Unknown season or you write wrong text");
							}catch(ConsoleParametersException e){
								System.err.println(e);
								flag = false;
							}
						}
					
					break;
					}
			
			//displays months with the same number of days
				
			case"3": {
				System.out.println("¬вед≥ть м≥с€ць");
				scaner = new Scanner (System.in);
				String months = scaner.next().toUpperCase();
		
				boolean flag = false;
				int num = 0;
			
				for (Months ms : Months.values()) {
					
					if (ms.name().equals(months)) {
						num = ms.getDays();
						System.out.println(ms.getDays());
						flag = true;
					} 
				}
				System.out.println("ћ≥с€ц≥ з такою к≥льк≥стю дн≥в: ");
				if (flag) {
					for(Months m: month) {
						if( m.getDays() == num) {
							System.out.println(m);
							
							}
						}
					}
				if(!flag) {
					System.out.println("Does not have this month");
				}
			break;
			}
			
			//displays months that have more days
			
			case"4": {
				System.out.println("м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");

			for(Months m: month) {
				if(m.getDays() >= 31) {
				System.out.println(m);
							
					}
				}
			break;
			}
			
			//displays the months that have the least number of days
			
			case"5": {
				System.out.println("м≥с€ц≥ €к≥ мають найменшу к≥льк≥сть дн≥в");

					for(Months m: month) {
						if(m.getDays() < 31) {
						System.out.println(m);
									
							}
						}
			break;
			}
			
			//displays the next season
			
			case"6": {
				System.out.println("¬вед≥ть пору року");
				scaner = new Scanner (System.in);
				String seasonCs= scaner.next().toUpperCase();
				
			
				boolean flag = false;
			
				for (Seasons s : sea2) {
					if (s.name().equals(seasonCs)) {
						flag = true;
					}	
				}
				if (flag) {
					Seasons sea = Seasons.valueOf(seasonCs);
					int ordinal = sea.ordinal();
				
						if(ordinal == (sea2.length -1)) {
							ordinal = 0;
							System.out.println(sea2[ordinal]);
						}else {
							System.out.println(sea2[ordinal+1]);
						}
					}
				else { 
					//use my Excpetion
					try {
						throw new ConsoleParametersException("Unknown season or you write wrong text");
					}catch(ConsoleParametersException e){
						System.err.println(e);
						flag = false;
					}
				}
				break;
			}
			
			//displays the previous season
			
			case"7": {
				System.out.println("¬вед≥ть пору року");
				scaner = new Scanner (System.in);
				String seasonCs= scaner.next().toUpperCase();
				
			
				boolean flag = false;
			
				for (Seasons s : sea2) {
					if (s.name().equals(seasonCs)) {
						flag = true;
					}	
				}
				if (flag) {
					Seasons sea = Seasons.valueOf(seasonCs);
					int ordinal = sea.ordinal();
				
						if(ordinal == (sea2.length +1)) {
							ordinal = 0;
							System.out.println(sea2[ordinal ]);
						}else {
							System.out.println(sea2[ordinal-1 ]);
						}
					}else {
						//use my Excpetion
						try {
							throw new ConsoleParametersException("Unknown season or you write wrong text");
						}catch(ConsoleParametersException e){
							System.err.println(e);
							flag = false;
						}
				}
				break;	
			}
			
			//this method displays even months on the console
			
			case"8": {
					for(Months m : Months.values()) {
						if(m.getDays() % 2 == 0 ) {
							System.out.println("ѕарний м≥с€ць" + m.name());
						}
					}						
			break;	
			}
			
			//this method displays even months on the console
			
			case"9": {
				for(Months m : Months.values()) {
					if(m.getDays() % 2 != 0) {
						System.out.println("Ќе парний м≥с€ць" + m.name());
					}
				}		
				break;
			}
			
			//prints whether the entered month from the console has an even number of days
			
			case"10": {
				System.out.println("¬вед≥ть м≥с€ць");
				scaner = new Scanner (System.in);
				String months= scaner.next().toUpperCase();
			
					boolean flag = false;
					
					for (Months m : Months.values()) {
						
						if (m.name().equals(months)) {
							flag = true;
						}	
					}
				
					if(flag) {	
						for (Months m : month) {
							
							if (m.name().equals(months.toString()) && m.getDays() %2 == 0) {
								System.out.println("ѕарний м≥с€ць "+ m.name().valueOf(months));
								flag = true;
							}else {
								if(m.name().equals(months.toString()) && m.getDays() %2 != 0) {
									System.out.println("Ќе парний м≥с€ць "+ m.name().valueOf(months));
									flag = true;
								}
							
							
							}
						}
						
					}	
				}
					
				
				break;
				}
			
		}
	}
}



