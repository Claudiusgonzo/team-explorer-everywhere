// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.client.common.ui.vcexplorer.versioncontrol.actions;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;

import com.microsoft.tfs.client.common.ui.tasks.vc.UncloakWorkingFolderTask;
import com.microsoft.tfs.client.common.ui.vc.tfsitem.TFSFolder;

public class UncloakWorkingFolderAction extends TeamViewerAction {
    private TFSFolder selectedFolder;

    @Override
    public void doRun(final IAction action) {
        final IStatus status =
            new UncloakWorkingFolderTask(getShell(), getCurrentRepository(), selectedFolder.getFullPath()).run();

        if (status.isOK()) {
            new RefreshAction().run(null);
        }
    }

    @Override
    protected void onSelectionChanged(final IAction action, final ISelection selection) {
        selectedFolder = (TFSFolder) adaptSelectionFirstElement(TFSFolder.class);
    }
}