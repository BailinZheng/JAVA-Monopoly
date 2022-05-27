package model;

import java.awt.Color;
import java.awt.Graphics;

import ui.JPanelGame;
import ui.TextTip;
import control.Control;
import language.UI_Language;

/**
 * 
 * 文字提示更新
 * 
 * @author MOVELIGHTS
 * 
 */
public class TextTipModel extends Tick implements Port{
	
	private PlayerModel player = null;
	
	private String tipString = UI_Language.getLanguage().getTTM_EVENT_1();
	
	public TextTipModel (){
	}

	public  String getTipString() {
		return tipString;
	}

	public void setTipString(String tipString) {
		this.tipString = tipString;
	}
	
	
	/**
	 * 
	 * 开始游戏设置
	 * 
	 */
	public void startGameInit (){}

	@Override
	public void updata(long tick) {
		this.nowTick = tick;
	}

	
	public PlayerModel getPlayer() {
		return player;
	}

	/**
	 * 显示文字提示
	 * 
	 * 
	 * */
	public void showTextTip(PlayerModel player,String str, int time) {
		this.player = player;
		this.setTipString(str);
		this.setStartTick(this.nowTick);
		this.setNextTick(this.nowTick + time * Control.rate);
	}
}
