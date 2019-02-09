/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.tinkerforge.internal.model;

import com.tinkerforge.BrickletIndustrialQuadRelay;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MIndustrial Quad Relay Bricklet</b></em>'.
 *
 * @author Theo Weiss
 * @since 1.4.0
 *        <!-- end-user-doc -->
 *
 *        <p>
 *        The following features are supported:
 *        </p>
 *        <ul>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelayBricklet#getDeviceType
 *        <em>Device Type</em>}</li>
 *        </ul>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMIndustrialQuadRelayBricklet()
 * @model superTypes="org.openhab.binding.tinkerforge.internal.model.MDevice&lt;org.openhab.binding.tinkerforge.internal.model.MTinkerBrickletIndustrialQuadRelay&gt;
 *        org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder&lt;org.openhab.binding.tinkerforge.internal.model.MIndustrialQuadRelay&gt;"
 * @generated
 */
public interface MIndustrialQuadRelayBricklet
        extends MDevice<BrickletIndustrialQuadRelay>, MSubDeviceHolder<MIndustrialQuadRelay> {

    /**
     * Returns the value of the '<em><b>Device Type</b></em>' attribute.
     * The default value is <code>"bricklet_quad_relay"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Device Type</em>' attribute.
     * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMIndustrialQuadRelayBricklet_DeviceType()
     * @model default="bricklet_quad_relay" unique="false" changeable="false"
     * @generated
     */
    String getDeviceType();

} // MIndustrialQuadRelayBricklet
