package core;

import burp.IBurpExtender;
import burp.IBurpExtenderCallbacks;
import burp.ITab;
import common.Constants;
import common.PrintUtil;
import menu.Menu;

import javax.swing.*;
import java.awt.*;

public class XFFHelper implements IBurpExtender, ITab {

    private IBurpExtenderCallbacks callbacks;
    private JPanel jPanelMain;

    public XFFHelper() {
    }

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        this.callbacks = callbacks;
        callbacks.setExtensionName(Constants.EXTENSION_NAME);
        callbacks.registerContextMenuFactory(new Menu(callbacks));
        PrintUtil.print(callbacks,Constants.INTRODUCTION);
    }


    @Override
    public String getTabCaption() {
        return Constants.EXTENSION_NAME;
    }

    @Override
    public Component getUiComponent() {
        return jPanelMain;
    }
}
