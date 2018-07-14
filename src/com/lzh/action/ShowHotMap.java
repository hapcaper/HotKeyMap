package com.lzh.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.actionSystem.EditorAction;
import com.intellij.openapi.editor.actionSystem.EditorActionManager;
import com.intellij.openapi.editor.actionSystem.TypedAction;
import com.intellij.openapi.editor.actionSystem.TypedActionHandler;
import com.intellij.openapi.keymap.impl.ui.KeymapListener;
import com.lzh.handler.HotKeyHandler;

public class ShowHotMap extends AnAction {
	static {
		final EditorActionManager editorActionManager = EditorActionManager.getInstance();
		final TypedAction typedAction = editorActionManager.getTypedAction();
		typedAction.setupHandler(new HotKeyHandler());
	}


	@Override
	public void actionPerformed(AnActionEvent e) {
		Editor editor = e.getData(CommonDataKeys.EDITOR);
		final Document document = editor.getDocument();
	}
}
