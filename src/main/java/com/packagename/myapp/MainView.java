package com.packagename.myapp;

import java.io.InputStream;

import org.python.core.PyInstance;
import org.python.util.PythonInterpreter;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView() {
    	// These are required to have the components available
    	Button b = new Button();
    	Notification n = new Notification();
    	
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.set("main_layout", this);
        InputStream res = this.getClass().getClassLoader().getResourceAsStream("entrypoint.py");
        interpreter.execfile(res);
        PyInstance pi = (PyInstance) interpreter.eval("EntryPoint()");
        pi.invoke("enter_python");
    }
}
