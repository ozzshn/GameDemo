
public class GamersManager implements GamersService {

	@Override
	public void gamerAdd(Gamers gamer) {
		System.out.println(gamer.getNickName() +"  adli kullanici sisteme eklenmistir");

	}

	@Override
	public void gamerDelete(Gamers gamer) {
		
		System.out.println(gamer.getNickName() +"  adli kullanici sistemden silinmistir");	
	}

	@Override
	public void gamerUpdate(Gamers gamer) {
	
		System.out.println(gamer.getNickName() +"  adli kullanici bilgileri guncellenmistir");
	}

}
