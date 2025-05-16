package com.github.cypressious.intellijvcslogscroll

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.vcs.log.impl.VcsProjectLog
import com.intellij.vcs.log.ui.VcsLogUiImpl
import java.awt.Rectangle

class ScrollUpAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val project = event.project ?: return
        val vcsProjectLog = VcsProjectLog.getInstance(project)
        vcsProjectLog.logManager?.logUis?.forEach { ui ->
            if (ui is VcsLogUiImpl) {
                ui.table.scrollRectToVisible(Rectangle(0, 0));
            }
        }
    }
}