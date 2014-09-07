package wicket.quickstart;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.markup.html.basic.Label;


public class Index extends WebPage {
    public Index() {
        // Model subclass that increases its counter every time the getObject method gets called,
        // and returns its value. For example when clicking CTRL+F5 onClick() not called
        Model<Integer> model = new Model<Integer>() {
            private int counter = 0;

            @Override
            public Integer getObject() {
                return counter++;
            }
        };
        add(new Link("link") {
            public void onClick() {
                // do nothing.
            }
        });
        add(new Label("counter", model));
    }
}