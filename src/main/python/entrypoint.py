from com.vaadin.flow.component.button import Button
from com.vaadin.flow.component.orderedlayout import VerticalLayout
from com.vaadin.flow.component.notification import Notification
from example_component import ExampleComponent

class EntryPoint:
  def __init__(self):
    pass

  def enter_python(self):
    note = Notification("Hello dudes")
    button = Button("Click me")  
    button.addClickListener(lambda event : note.open())
    main_layout.add(button)
    vl = VerticalLayout()
    main_layout.add(vl);
    vl.add(ExampleComponent())
    