/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.openhab.binding.tinkerforge.internal.types.DecimalValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotary Encoder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.RotaryEncoder#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getRotaryEncoder()
 * @model superTypes="org.openhab.binding.tinkerforge.internal.model.RotaryEncoderDevice
 *        org.openhab.binding.tinkerforge.internal.model.MSensor&lt;org.openhab.binding.tinkerforge.internal.model.MDecimalValue&gt;
 *        org.openhab.binding.tinkerforge.internal.model.CallbackListener
 *        org.openhab.binding.tinkerforge.internal.model.MTFConfigConsumer&lt;org.openhab.binding.tinkerforge.internal.model.TFBaseConfiguration&gt;"
 * @generated
 */
public interface RotaryEncoder
        extends RotaryEncoderDevice, MSensor<DecimalValue>, CallbackListener, MTFConfigConsumer<TFBaseConfiguration> {
    /**
     * Returns the value of the '<em><b>Device Type</b></em>' attribute.
     * The default value is <code>"rotary_encoder"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Device Type</em>' attribute.
     * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getRotaryEncoder_DeviceType()
     * @model default="rotary_encoder" unique="false" changeable="false"
     * @generated
     */
    String getDeviceType();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
     * @generated
     */
    void clear();

} // RotaryEncoder
