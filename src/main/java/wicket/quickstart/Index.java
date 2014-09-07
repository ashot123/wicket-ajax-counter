package wicket.quickstart;


import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.ajax.markup.html.AjaxLink;
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

        final Label label = new Label("counter", model);

        // to be able to update the component when the request is returned to the client browser.
        // If we don’t, Wicket will not know how to update the markup in the client.
        label.setOutputMarkupId(true);
        add(new AjaxFallbackLink("link") {
            public void onClick(AjaxRequestTarget target) {
                if (target != null) {
                    // target is only available in an Ajax request
                    target.add(label);
                }
            }
        });

        add(label);
    }
}