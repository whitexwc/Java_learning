package test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * 游戏开发中常用的工具类
 * @author simor
 *
 */
public class GameUtil {
	private GameUtil(){}
	public static Image getImage(String path){
		URL u=GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img =null;
		try {
			img =ImageIO.read(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}

}
