package lessons17.factory.buttons;

import lessons17.factory.buttons.Button;

public class HtmlButton implements Button {

        public void render() {
            System.out.println("<button>Test Button</button>");
            onClick();
        }

        public void onClick() {
            System.out.println("Click! Button says - 'Hello World!'");
        }
}
