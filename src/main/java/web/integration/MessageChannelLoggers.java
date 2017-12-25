package web.integration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import web.domain.MimeMessageMeta;

@Configuration
public class MessageChannelLoggers {

    private final Log logger = LogFactory.getLog(MessageChannelLoggers.class);

    /**
     * A {@code ServiceActivator} with no {@code outputChannel} will simply perform the side effect.
     */
    @ServiceActivator(inputChannel = "emailChannel")
    public void emailChannelLogger(MimeMessageMeta meta) {
        logger.info("Received: " + meta);
    }
}
