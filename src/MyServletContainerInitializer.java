import com.me.FirstServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;
import java.util.logging.Logger;

@HandlesTypes(MyInitializer.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {
    private Logger logger = Logger.getLogger(MyServletContainerInitializer.class.getName());

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        logger.info("ServletContainerInitializer onStartup() execute.");
    }
}
