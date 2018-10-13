package com.doctacloak;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HelloWorldGame extends ApplicationAdapter {
	Texture texture;
	SpriteBatch batch;

	@Override
	public void create () {
		texture = new Texture("world.png");
		FileHandle worldFile = Gdx.files.internal("world.png");
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(texture, 192, 112);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
	}
}
