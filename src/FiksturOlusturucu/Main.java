package FiksturOlusturucu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<String> teamSet = new HashSet<String>();
		
		while(true) {
			System.out.print("Takým giriniz (Çýkmak için 0 a basýnýz): ");
			String team = sc.next();
			
			if (team.equals("0")) {
				break;
			}
			
			teamSet.add(team);
		}
		
		if (teamSet.size() % 2 != 0) {
			teamSet.add("Bay");
		}
		
		List<String> teamList = new ArrayList<String>();
		
		// Takýmlarý rastgele karýþtýrýyoruz 
		while (0 < teamSet.size()) {
			int index = (int) Math.random()*teamSet.size();
			teamList.add((String) teamSet.toArray()[index]);
			teamSet.remove(teamSet.toArray()[index]);
		}
		
		Map<String, List<List<String>>> matches = new LinkedHashMap<String, List<List<String>>>();
		
		// Haftalýk oynanacak maçlarý yerleþtir!
		for (int i=0; i<teamList.size() / 2; i++) {
            String round = String.valueOf(i + 1);
            matches.put(round, new ArrayList<List<String>>());
        }
       
		// Haftalýk fikstürde oynanacak maçlarý eþleþtiriyoruz
		for (int i=0; i<teamList.size() -1 ; i++) {
	            List<String> homeTeam = new ArrayList<>();
	            List<String> awayTeam = new ArrayList<>();
	            
	            for (int j=0; j<teamList.size() / 2; j++) {
	                homeTeam.add(teamList.get(j));
	                awayTeam.add(teamList.get((teamList.size() - 1) - j));
	            }
	            
	            String round = String.valueOf(i + 1);
	            matches.get(round).add(homeTeam);
	            matches.get(round).add(awayTeam);
	            
	            List<String> newTeams = new ArrayList<>();
	            
	            newTeams.add(teamList.get(0));
	            newTeams.add(teamList.get((teamList.size() - 1)));
	            
	            for (int k=1; k<teamList.size() - 1; k++) {
	                newTeams.add(teamList.get(k));
	            }
	            
	            teamList = newTeams;
	        }
		
		
		 for(int i=0; i<2*teamList.size() - 1; i++) {
	            System.out.println("Hafta - " + (i+1));
	            for(int j=0; j<teamList.size()/2; j++) {
	                String result = (i < teamList.size() -1 ) ? 
	                		matches.get(String.valueOf(i + 1)).get(0).get(j) + " vs " +  matches.get(String.valueOf(i + 1)).get(1).get(j) 
	                		: matches.get(String.valueOf(i + 1 - teamList.size() -1 )).get(1).get(j) + " vs " +  matches.get(String.valueOf(i + 1 - teamList.size() -1 )).get(0).get(j);
	                System.out.println(result);
	            }
	            System.out.println();
	        }
	}
	
	

}
