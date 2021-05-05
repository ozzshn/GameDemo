
public class SaleManager implements SaleService{

	@Override
	public void Sale(Gamers gamer, Games game) {
		System.out.println(game.getGameName()+" oyunu " + gamer.getNickName()+ " kullaniciya satilmistir");
	}

	
}
