package model.card;

import context.GameState;
import language.UI_Language;
import model.PlayerModel;

/**
 * 
 * 
 *嫁祸卡,遇到危險的時候自動生效，將陷害或大額租金（3000元以上）嫁禍給別人。
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
