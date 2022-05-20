package model.card;

import javax.swing.JOptionPane;

import context.GameState;
import language.UI_Language;
import model.PlayerModel;
import model.buildings.Building;

/**
 * 
 * �Ӹǿ�,��ǰ���ݼӸ�һ��
 * OK
 * 
 */
public class AddLevelCard extends Card {

	public AddLevelCard(PlayerModel owner) {
		super(owner);
		this.name = "AddLevelCard";
		this.cName = UI_Language.getLanguage().getADDLC_EVENT_1();
		this.price = 30;

	}

	@Override
	public int useCard() {
		return GameState.CARD_ADDLEVEL;
	}

}