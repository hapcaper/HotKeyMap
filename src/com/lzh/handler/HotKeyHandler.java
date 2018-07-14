package com.lzh.handler;

import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.actionSystem.TypedActionHandler;
import com.intellij.openapi.ui.Messages;
import com.lzh.KeyRecord;
import org.jetbrains.annotations.NotNull;

public class HotKeyHandler implements TypedActionHandler {
	@Override
	public void execute(@NotNull Editor editor, char c, @NotNull DataContext dataContext) {
		Messages.showInfoMessage("", String.valueOf(c));

		switch (c) {
			case KeyRecord.A:

				break;


		}
	}
}
