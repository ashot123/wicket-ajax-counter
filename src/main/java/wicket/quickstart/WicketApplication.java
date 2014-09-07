package wicket.quickstart;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created by Ashot Karakhanyan on 18-07-2014
 */
public class WicketApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        //Application application = Application.get();
        return Index.class;
    }

    @Override
    protected void init() {
        super.init();
        // add your configuration here
    }
}
