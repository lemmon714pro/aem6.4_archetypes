package ${package}.core.bundle;

import java.util.List;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognifide.slice.api.context.ContextScope;
import com.cognifide.slice.api.injector.InjectorRunner;
import com.cognifide.slice.commons.SliceModulesFactory;
import com.cognifide.slice.core.internal.context.SliceContextScope;
import com.cognifide.slice.cq.module.CQModulesFactory;
import com.cognifide.slice.validation.ValidationModulesFactory;
import com.google.inject.Module;

public class Activator implements BundleActivator {

    private static final String BUNDLE_NAME_FILTER = "com\\.yurishchev\\.${appsFolderName}\\..*";

    private static final String BASE_PACKAGE = "${package}";

    private static final String INJECTOR_NAME = "${appsFolderName}";

    private static final Logger logger = LoggerFactory.getLogger(Activator.class);

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        logger.debug("Entering BundleActivator.start");
        final ContextScope scope = new SliceContextScope();
        final InjectorRunner injectorRunner =
            new InjectorRunner(bundleContext, INJECTOR_NAME, scope);
        logger.debug("Configuring Injector - {}, for bundles - {}",
                     INJECTOR_NAME, BUNDLE_NAME_FILTER);
        List<Module> sliceModules = SliceModulesFactory.createModules(
            bundleContext, INJECTOR_NAME, BUNDLE_NAME_FILTER, BASE_PACKAGE);
        List<Module> cqModules = CQModulesFactory.createModules();
        List<Module> validationModules = ValidationModulesFactory.createModules();

        injectorRunner.installModules(sliceModules);
        injectorRunner.installModules(cqModules);
        injectorRunner.installModules(validationModules);
        logger.debug("Starting injector runner");
        injectorRunner.start();
        logger.debug("Leaving BundleActivator.start");
    }

    @Override
    public void stop(BundleContext context) throws Exception {

    }
}
