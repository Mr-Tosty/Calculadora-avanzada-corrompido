/*
 * ToolBarEastState.java 10/03/23
 *
 * Copyright (c) 2007, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.sun.java.swing.plaf.nimbus;

import java.awt.*;
import javax.swing.*;

/**
 */
class ToolBarEastState extends State {
    ToolBarEastState() {
        super("East");
    }

    @Override protected boolean isInState(JComponent c) {

        JToolBar toolbar = (JToolBar)c;
        return NimbusLookAndFeel.resolveToolbarConstraint(toolbar) == BorderLayout.EAST;
               
    }
}

