package ${package}.core.bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator {

    private static final Logger logger = LoggerFactory.getLogger(Activator.class);

    @Override
    public void start(BundleContext bundleContext) {
        logger.debug("Entering BundleActivator.start");

        logger.debug("Leaving BundleActivator.start");
    }

    @Override
    public void stop(BundleContext context) {
        logger.debug("Entering BundleActivator.stop");

        logger.debug("Leaving BundleActivator.stop");
    }
}
