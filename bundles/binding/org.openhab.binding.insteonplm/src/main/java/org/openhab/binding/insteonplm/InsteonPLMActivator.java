/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.insteonplm;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Extension of the default OSGi bundle activator.
 * 
 * @author Daniel Pfrommer
 * @author Bernd Pfrommer
 * @since 1.5.0
 */
public final class InsteonPLMActivator implements BundleActivator {

    private static Logger logger = LoggerFactory.getLogger(InsteonPLMActivator.class);
    private static BundleContext context;

    /**
     * Called whenever the OSGi framework starts our bundle
     * 
     * @param bc the bundle's execution context within the framework
     */
    @Override
    public void start(BundleContext bc) throws Exception {
        context = bc;
        logger.info("Insteon PLM binding has been started.");
    }

    /**
     * Called whenever the OSGi framework stops our bundle
     * 
     * @param bc the bundle's execution context within the framework
     */
    @Override
    public void stop(BundleContext bc) throws Exception {
        context = null;
        logger.warn("Insteon PLM binding has been stopped.");
    }

    /**
     * Returns the bundle context of this bundle
     * 
     * @return the bundle context
     */
    public static BundleContext getContext() {
        return context;
    }

    /**
     * Returns the current version of the bundle.
     * 
     * @return the current version of the bundle.
     */
    public static Version getVersion() {
        return context.getBundle().getVersion();
    }

}
