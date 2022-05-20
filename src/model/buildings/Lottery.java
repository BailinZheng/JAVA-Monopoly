package model.buildings;

import model.PlayerModel;
import model.TextTipModel;
import context.GameState;
import control.Control;
import language.UI_Language;

/**
 * 
 * 乐透
 * 角色到达这里时，可以进行下注游戏，可能输赢奖金.
 * 
 * 
 * 
 * @author MOVELIGHTS
 * 
 */
public class Lottery extends Building {

	private PlayerModel player;
	
	public Lottery(int posX, int posY) {
		super(posX, posY);
		this.name = UI_Language.getLanguage().getLOTTERY_EVENT_1();
	}
	
	@Override
	public int getEvent() {
		return GameState.LOTTERY_EVENT;
	}
}
