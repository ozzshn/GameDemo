
public class GamesManager implements GamesService {

	@Override
	public void add(Games game) {
    System.out.println(game.getGameName()+ " oyun sisteme eklendi.");
		
	}

	@Override
	public void delete(Games game) {
		System.out.println(game.getGameName()+ " oyun sistemden silindi.");
		
	}

	@Override
	public void update(Games game) {
		System.out.println(game.getGameName()+ " oyun guncellendi.");
		
	}

}
