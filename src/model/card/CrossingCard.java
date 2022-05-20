package model.card;

import context.GameState;
import language.UI_Language;
import model.PlayerModel;

/**
 * 
 * 
 *�޻���,����Σ�U�ĕr���Ԅ���Ч�����ݺ�����~���3000Ԫ���ϣ��޵��o�e�ˡ�
 * 
 *
 */
public class CrossingCard extends Card{

	public CrossingCard(PlayerModel owner) {
		super(owner);
		this.name = "CrossingCard";
		this.cName = UI_Language.getLanguage().getCCD_EVENT_1();
		this.price = 120;
	}

	@Override
	public int useCard() {
		return GameState.CARD_CROSSING;
	}

}
