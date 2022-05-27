package model.buildings;

import java.util.List;

import model.LandModel;
import model.PlayerModel;
import model.TextTipModel;

import context.GameState;
import control.Control;
import language.AlleSprachen;
import language.German;
import language.UI_Language;

/**
 * 
 * 监狱 玩家到这里可以入狱或者发生其他事件
 * 
 * 
 * @author MOVELIGHTS
 * 
 */
public class Prison extends Building {

	private String[] events = { UI_Language.getLanguage().getPRISON_EVENT_1(), UI_Language.getLanguage().getPRISON_EVENT_2(), UI_Language.getLanguage().getPRISON_EVENT_3(),  };

	private PlayerModel player;

	public Prison(int posX, int posY) {
		super(posX, posY);
		this.name = UI_Language.getLanguage().getPRISON_EVENT_4() ;
	}

	public String[] getEvents() {
		return events;
	}

	@Override
	public int getEvent() {
		return GameState.PRISON_EVENT;
	}
}
