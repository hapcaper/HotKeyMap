package com.lzh.handler;

import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.actionSystem.TypedActionHandler;
import com.intellij.openapi.ui.Messages;
import com.lzh.KeyStore;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class HotKeyHandler implements TypedActionHandler {
	private static KeyStore keyStore = KeyStore.getInstance();
//	static {
//		keyStore.init();
//	}

	@Override
	public void execute(@NotNull Editor editor, char c, @NotNull DataContext dataContext) {
		Messages.showInfoMessage("", String.valueOf(c));
		c  = Character.toUpperCase(c);
		keyStore.storeKey(c);

	}


}
