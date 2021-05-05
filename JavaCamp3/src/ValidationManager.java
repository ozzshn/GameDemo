
public class ValidationManager extends Gamers {

	public void validation(Gamers gamer)
	{
		if(getNationalityId()==gamer.getNationalityId()) {
			System.out.println("Giris basarili.");
		}
		else
		{
			System.out.println("Dogrulama yapilamadi,tekrar deneyin!!");
		}
	}
}
