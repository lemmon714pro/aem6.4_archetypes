package ${package}.components.model;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;

@Model(adaptables = Resource.class)
public class SimpleComponentModel {

    private static final Logger logger = LoggerFactory.getLogger(SimpleComponentModel.class);

    @Inject
    private String text;

    @Inject
    @Named("jcr:lastModified")
    private Date lastModified;

    public SimpleComponentModel(Resource resource) {
        logger.debug(resource.getPath());
    }

    @PostConstruct
    private void init() {
        logger.debug("Entering SimpleComponentModel.afterCreated");
        if (text == null) {
            logger.debug("There is no text property in the resource");
        }
        if (lastModified == null) {
            logger.debug("There is no lastModifiedBy property in the resource");
        }
    }

    public String getText() {
        return text;
    }

    public Date getLastModified() {
        return lastModified;
    }
}
