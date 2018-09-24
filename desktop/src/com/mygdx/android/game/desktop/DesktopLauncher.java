package com.mygdx.android.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.math.MathUtils;
import com.mygdx.android.game.MyAndroidGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title= "测试";
		config.width= 800;
		config.height= 480;
		new LwjglApplication(new MyAndroidGdxGame(), config);
	}
}
