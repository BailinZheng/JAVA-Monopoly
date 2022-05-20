package model.card;

import javax.swing.JOptionPane;

import context.GameState;
import language.UI_Language;
import model.PlayerModel;
import model.buildings.Building;

/**
 * 
 * 换屋卡,停留在有房屋的土地上時，可以使用換屋卡，交換視野內房屋。
 * 
 * 
 */
public class ChangeCard extends Card {

	public ChangeCard(PlayerModel owner) {
		super(owner);
		this.name = "ChangeCard";
		this.cName = UI_Language.getLanguage().getCC_EVENT_1();
		this.price = 70;
	}

	@Override
	public int useCard() {
		return GameState.CARD_CHANGE;
	}

}
