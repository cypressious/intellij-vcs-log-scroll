package com.github.cypressious.intellijvcslogscroll

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.vcs.log.VcsLogDataKeys.VCS_LOG_UI
import com.intellij.vcs.log.ui.VcsLogUiImpl
import java.awt.Rectangle

class ScrollUpAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val ui = event.getData(VCS_LOG_UI)
        if (ui is VcsLogUiImpl) {
            ui.table.scrollRectToVisible(Rectangle(0, 0));
        }
    }
}