package wicket.quickstart;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.markup.html.basic.Label;


public class Index extends WebPage {
    public Index() {
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