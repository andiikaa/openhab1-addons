/**
 */
package org.openhab.binding.tinkerforge.internal.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openhab.binding.tinkerforge.internal.TinkerforgeErrorHandler;
import org.openhab.binding.tinkerforge.internal.model.DigitalActor;
import org.openhab.binding.tinkerforge.internal.model.LoadCellLedV2;
import org.openhab.binding.tinkerforge.internal.model.MBrickletLoadCellV2;
import org.openhab.binding.tinkerforge.internal.model.MSubDeviceHolder;
import org.openhab.binding.tinkerforge.internal.model.ModelPackage;
import org.openhab.binding.tinkerforge.internal.types.HighLowValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tinkerforge.BrickletLoadCellV2;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Cell Led V2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.LoadCellLedV2Impl#getLogger <em>Logger</em>}</li>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.LoadCellLedV2Impl#getUid <em>Uid</em>}</li>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.LoadCellLedV2Impl#isPoll <em>Poll</em>}</li>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.LoadCellLedV2Impl#getEnabledA <em>Enabled A</em>}</li>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.LoadCellLedV2Impl#getSubId <em>Sub Id</em>}</li>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.LoadCellLedV2Impl#getMbrick <em>Mbrick</em>}</li>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.LoadCellLedV2Impl#getDigitalState <em>Digital
 * State</em>}</li>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.impl.LoadCellLedV2Impl#getDeviceType <em>Device
 * Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCellLedV2Impl extends MinimalEObjectImpl.Container implements LoadCellLedV2 {
    /**
     * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getLogger()
     * @generated
     * @ordered
     */
    protected static final Logger LOGGER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getLogger()
     * @generated
     * @ordered
     */
    protected Logger logger = LOGGER_EDEFAULT;

    /**
     * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUid()
     * @generated
     * @ordered
     */
    protected static final String UID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUid()
     * @generated
     * @ordered
     */
    protected String uid = UID_EDEFAULT;

    /**
     * The default value of the '{@link #isPoll() <em>Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isPoll()
     * @generated
     * @ordered
     */
    protected static final boolean POLL_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isPoll() <em>Poll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isPoll()
     * @generated
     * @ordered
     */
    protected boolean poll = POLL_EDEFAULT;

    /**
     * The default value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getEnabledA()
     * @generated
     * @ordered
     */
    protected static final AtomicBoolean ENABLED_A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnabledA() <em>Enabled A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getEnabledA()
     * @generated
     * @ordered
     */
    protected AtomicBoolean enabledA = ENABLED_A_EDEFAULT;

    /**
     * The default value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSubId()
     * @generated
     * @ordered
     */
    protected static final String SUB_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSubId()
     * @generated
     * @ordered
     */
    protected String subId = SUB_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getDigitalState() <em>Digital State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDigitalState()
     * @generated
     * @ordered
     */
    protected static final HighLowValue DIGITAL_STATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDigitalState() <em>Digital State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDigitalState()
     * @generated
     * @ordered
     */
    protected HighLowValue digitalState = DIGITAL_STATE_EDEFAULT;

    /**
     * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceType()
     * @generated
     * @ordered
     */
    protected static final String DEVICE_TYPE_EDEFAULT = "loadcell_led";

    /**
     * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDeviceType()
     * @generated
     * @ordered
     */
    protected String deviceType = DEVICE_TYPE_EDEFAULT;

    private BrickletLoadCellV2 tinkerforgeDevice;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected LoadCellLedV2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.LOAD_CELL_LED_V2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Logger getLogger() {
        return logger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLogger(Logger newLogger) {
        Logger oldLogger = logger;
        logger = newLogger;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOAD_CELL_LED_V2__LOGGER, oldLogger,
                    logger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getUid() {
        return uid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setUid(String newUid) {
        String oldUid = uid;
        uid = newUid;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOAD_CELL_LED_V2__UID, oldUid, uid));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isPoll() {
        return poll;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPoll(boolean newPoll) {
        boolean oldPoll = poll;
        poll = newPoll;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOAD_CELL_LED_V2__POLL, oldPoll, poll));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AtomicBoolean getEnabledA() {
        return enabledA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setEnabledA(AtomicBoolean newEnabledA) {
        AtomicBoolean oldEnabledA = enabledA;
        enabledA = newEnabledA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOAD_CELL_LED_V2__ENABLED_A, oldEnabledA,
                    enabledA));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getSubId() {
        return subId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSubId(String newSubId) {
        String oldSubId = subId;
        subId = newSubId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOAD_CELL_LED_V2__SUB_ID, oldSubId,
                    subId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MBrickletLoadCellV2 getMbrick() {
        if (eContainerFeatureID() != ModelPackage.LOAD_CELL_LED_V2__MBRICK)
            return null;
        return (MBrickletLoadCellV2) eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public MBrickletLoadCellV2 basicGetMbrick() {
        if (eContainerFeatureID() != ModelPackage.LOAD_CELL_LED_V2__MBRICK)
            return null;
        return (MBrickletLoadCellV2) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMbrick(MBrickletLoadCellV2 newMbrick, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newMbrick, ModelPackage.LOAD_CELL_LED_V2__MBRICK, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMbrick(MBrickletLoadCellV2 newMbrick) {
        if (newMbrick != eInternalContainer()
                || (eContainerFeatureID() != ModelPackage.LOAD_CELL_LED_V2__MBRICK && newMbrick != null)) {
            if (EcoreUtil.isAncestor(this, newMbrick))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newMbrick != null)
                msgs = ((InternalEObject) newMbrick).eInverseAdd(this, ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES,
                        MSubDeviceHolder.class, msgs);
            msgs = basicSetMbrick(newMbrick, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOAD_CELL_LED_V2__MBRICK, newMbrick,
                    newMbrick));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public HighLowValue getDigitalState() {
        return digitalState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDigitalState(HighLowValue newDigitalState) {
        HighLowValue oldDigitalState = digitalState;
        digitalState = newDigitalState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOAD_CELL_LED_V2__DIGITAL_STATE,
                    oldDigitalState, digitalState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void turnDigital(HighLowValue state) {
        try {
            logger.debug("led got {}", state);
            if (state == HighLowValue.HIGH) {
                logger.debug("switching led on");
                tinkerforgeDevice.setInfoLEDConfig(BrickletLoadCellV2.INFO_LED_CONFIG_ON);
            } else {
                logger.debug("switching led off");
                tinkerforgeDevice.setInfoLEDConfig(BrickletLoadCellV2.INFO_LED_CONFIG_OFF);
            }
        } catch (TimeoutException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_TIMEOUT_EXCEPTION, e);
        } catch (NotConnectedException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_NOT_CONNECTION_EXCEPTION, e);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void fetchDigitalValue() {
        try {
            HighLowValue value = tinkerforgeDevice.getInfoLEDConfig() == BrickletLoadCellV2.INFO_LED_CONFIG_ON
                    ? HighLowValue.HIGH
                    : HighLowValue.LOW;
            setDigitalState(value);
        } catch (TimeoutException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_TIMEOUT_EXCEPTION, e);
        } catch (NotConnectedException e) {
            TinkerforgeErrorHandler.handleError(this, TinkerforgeErrorHandler.TF_NOT_CONNECTION_EXCEPTION, e);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void init() {
        setEnabledA(new AtomicBoolean());
        logger = LoggerFactory.getLogger(LoadCellLedV2Impl.class);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void enable() {
        tinkerforgeDevice = getMbrick().getTinkerforgeDevice();
        fetchDigitalValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void disable() {
        tinkerforgeDevice = null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.LOAD_CELL_LED_V2__MBRICK:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetMbrick((MBrickletLoadCellV2) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.LOAD_CELL_LED_V2__MBRICK:
                return basicSetMbrick(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ModelPackage.LOAD_CELL_LED_V2__MBRICK:
                return eInternalContainer().eInverseRemove(this, ModelPackage.MSUB_DEVICE_HOLDER__MSUBDEVICES,
                        MSubDeviceHolder.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.LOAD_CELL_LED_V2__LOGGER:
                return getLogger();
            case ModelPackage.LOAD_CELL_LED_V2__UID:
                return getUid();
            case ModelPackage.LOAD_CELL_LED_V2__POLL:
                return isPoll();
            case ModelPackage.LOAD_CELL_LED_V2__ENABLED_A:
                return getEnabledA();
            case ModelPackage.LOAD_CELL_LED_V2__SUB_ID:
                return getSubId();
            case ModelPackage.LOAD_CELL_LED_V2__MBRICK:
                if (resolve)
                    return getMbrick();
                return basicGetMbrick();
            case ModelPackage.LOAD_CELL_LED_V2__DIGITAL_STATE:
                return getDigitalState();
            case ModelPackage.LOAD_CELL_LED_V2__DEVICE_TYPE:
                return getDeviceType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelPackage.LOAD_CELL_LED_V2__LOGGER:
                setLogger((Logger) newValue);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__UID:
                setUid((String) newValue);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__POLL:
                setPoll((Boolean) newValue);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__ENABLED_A:
                setEnabledA((AtomicBoolean) newValue);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__SUB_ID:
                setSubId((String) newValue);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__MBRICK:
                setMbrick((MBrickletLoadCellV2) newValue);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__DIGITAL_STATE:
                setDigitalState((HighLowValue) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ModelPackage.LOAD_CELL_LED_V2__LOGGER:
                setLogger(LOGGER_EDEFAULT);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__UID:
                setUid(UID_EDEFAULT);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__POLL:
                setPoll(POLL_EDEFAULT);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__ENABLED_A:
                setEnabledA(ENABLED_A_EDEFAULT);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__SUB_ID:
                setSubId(SUB_ID_EDEFAULT);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__MBRICK:
                setMbrick((MBrickletLoadCellV2) null);
                return;
            case ModelPackage.LOAD_CELL_LED_V2__DIGITAL_STATE:
                setDigitalState(DIGITAL_STATE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ModelPackage.LOAD_CELL_LED_V2__LOGGER:
                return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
            case ModelPackage.LOAD_CELL_LED_V2__UID:
                return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
            case ModelPackage.LOAD_CELL_LED_V2__POLL:
                return poll != POLL_EDEFAULT;
            case ModelPackage.LOAD_CELL_LED_V2__ENABLED_A:
                return ENABLED_A_EDEFAULT == null ? enabledA != null : !ENABLED_A_EDEFAULT.equals(enabledA);
            case ModelPackage.LOAD_CELL_LED_V2__SUB_ID:
                return SUB_ID_EDEFAULT == null ? subId != null : !SUB_ID_EDEFAULT.equals(subId);
            case ModelPackage.LOAD_CELL_LED_V2__MBRICK:
                return basicGetMbrick() != null;
            case ModelPackage.LOAD_CELL_LED_V2__DIGITAL_STATE:
                return DIGITAL_STATE_EDEFAULT == null ? digitalState != null
                        : !DIGITAL_STATE_EDEFAULT.equals(digitalState);
            case ModelPackage.LOAD_CELL_LED_V2__DEVICE_TYPE:
                return DEVICE_TYPE_EDEFAULT == null ? deviceType != null : !DEVICE_TYPE_EDEFAULT.equals(deviceType);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == DigitalActor.class) {
            switch (derivedFeatureID) {
                case ModelPackage.LOAD_CELL_LED_V2__DIGITAL_STATE:
                    return ModelPackage.DIGITAL_ACTOR__DIGITAL_STATE;
                default:
                    return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == DigitalActor.class) {
            switch (baseFeatureID) {
                case ModelPackage.DIGITAL_ACTOR__DIGITAL_STATE:
                    return ModelPackage.LOAD_CELL_LED_V2__DIGITAL_STATE;
                default:
                    return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == DigitalActor.class) {
            switch (baseOperationID) {
                case ModelPackage.DIGITAL_ACTOR___TURN_DIGITAL__HIGHLOWVALUE:
                    return ModelPackage.LOAD_CELL_LED_V2___TURN_DIGITAL__HIGHLOWVALUE;
                case ModelPackage.DIGITAL_ACTOR___FETCH_DIGITAL_VALUE:
                    return ModelPackage.LOAD_CELL_LED_V2___FETCH_DIGITAL_VALUE;
                default:
                    return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ModelPackage.LOAD_CELL_LED_V2___TURN_DIGITAL__HIGHLOWVALUE:
                turnDigital((HighLowValue) arguments.get(0));
                return null;
            case ModelPackage.LOAD_CELL_LED_V2___FETCH_DIGITAL_VALUE:
                fetchDigitalValue();
                return null;
            case ModelPackage.LOAD_CELL_LED_V2___INIT:
                init();
                return null;
            case ModelPackage.LOAD_CELL_LED_V2___ENABLE:
                enable();
                return null;
            case ModelPackage.LOAD_CELL_LED_V2___DISABLE:
                disable();
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (logger: ");
        result.append(logger);
        result.append(", uid: ");
        result.append(uid);
        result.append(", poll: ");
        result.append(poll);
        result.append(", enabledA: ");
        result.append(enabledA);
        result.append(", subId: ");
        result.append(subId);
        result.append(", digitalState: ");
        result.append(digitalState);
        result.append(", deviceType: ");
        result.append(deviceType);
        result.append(')');
        return result.toString();
    }

} // LoadCellLedV2Impl