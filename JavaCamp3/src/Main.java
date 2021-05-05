
public class Main {

	public static void main(String[] args) {
		
		Gamers gamer1 =new Gamers(1,"Ali","Gultekin","ali03","12345");
		Gamers gamer2 =new Gamers(2,"Ayse","Pekin","ayse03","52345");
		
		Games game1=new Games(1,"LOL",200,"Savas Oyunu");
		Games game2=new Games(2,"Need For Speed",400,"Yaris Oyunu");
		Games game3=new Games(3,"FIFA",600,"Futbol Oyunu");

		
		System.out.println("\n----OYUNLAR----");
		Games[] gamess= {game1,game2,game3};
		 for(Games games: gamess) {
	    	   System.out.println(games.getId()+"- "+ games.getGameName());
	    	  
	       }
		 
		System.out.println("--------");
		
		Campaigns camp1 = new  Campaigns(1, "Oyun gunu!!!");
		Campaigns camp2 = new  Campaigns(2, "Yilbasi indirimi!!");
		
		CampaignsManager campaignsManager1= new CampaignsManager();
		campaignsManager1.add(camp1);
		
		CampaignsManager campaignsManager2= new CampaignsManager();
		campaignsManager2.update(camp2);
		
		
		System.out.println("--------");
		
		GamersManager gamersManager1=new GamersManager();
		gamersManager1.gamerAdd(gamer1);
		
		GamersManager gamersManager2=new GamersManager();
		gamersManager2.gamerDelete(gamer2);
		
		System.out.println("--------");
		
		SaleManager saleManager1=new SaleManager();
		saleManager1.Sale(gamer1, game2);
		
		SaleManager saleManager2=new SaleManager();
		saleManager2.Sale(gamer2, game1);
		
		System.out.println("--------");
		
		ValidationManager check1=new ValidationManager();
		check1.validation(gamer1);
		
		ValidationManager check2=new ValidationManager();
		check2.validation(gamer2);
		
        
	}

}
