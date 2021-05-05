
public class CampaignsManager implements CampaignService{

	@Override
	public void add(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+"  kampanya sisteme eklenmistir");
		
	}

	@Override
	public void delete(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+"  kampanya sistemden silinmistir");
		
	}

	@Override
	public void update(Campaigns campaign) {
		System.out.println(campaign.getCampaignName()+"  kampanya guncellenmistir");
		
	}

}
