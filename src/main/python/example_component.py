from  com.vaadin.flow.component.button import Button
from com.vaadin.flow.component.orderedlayout import VerticalLayout


class ExampleComponent(VerticalLayout):
    def __init__(self):
      button = Button("Example button")
      self.add(button)
