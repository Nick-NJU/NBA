package presentation.button;

import java.awt.Dimension;

import presentation.common.ImgSys;
import presentation.common.MyButton;
import presentation.main.UIController;
import presentation.panel.PanelEnum;

/**
 * 球员查询按钮
 * @author HCW
 *
 */
public class PlayerButton extends MyButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param name
	 * @param dimension
	 * @param x
	 * @param y
	 */
	public PlayerButton(String name, Dimension dimension, int x, int y) {
		super(name, dimension, x, y);
		setImg(ImgSys.player);
		setPressedImg(ImgSys.player_selected);
		setRolloverImg(ImgSys.player_selected);
	}

	@Override
	protected void enter() {
		super.enter();
	}

	@Override
	protected void click() {
		super.click();
		UIController.getInstance().jumpTo(PanelEnum.PlayerPanel);
	}
	
}
