// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.workitem.query.qe;

/**
 * @since TEE-SDK-10.1
 */
public interface QEQueryConnection {
    public QEQueryConnectionType getType();

    public int getStartRow();

    public int getEndRow();
}
