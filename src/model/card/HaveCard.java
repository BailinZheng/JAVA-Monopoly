package model.card;

import javax.swing.JOptionPane;

import context.GameState;
import language.UI_Language;
import model.PlayerModel;
import model.buildings.Building;

/**
 * 
 * 购地卡,當處在不是自己土地上的時候，可以使用購地卡，連同建築強行收購獲得此地。
 * OK
 * 
 */
public class HaveCard extends Card {

	public HaveCard(PlayerModel owner) {
		super(owner);
		this.name = "HaveCard";
		this.cName = UI_Language.getLanguage().getHC_EVENT_1();
		this.price = 50;
	}

	@Override
	public int useCard() {
		return GameState.CARD_HAVE;
	}

}
