/**
 */
package prototype5.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import prototype5.Prototype5Package;
import prototype5.VizObject;

/**
 * A class which identifies a part of a model and assigns it a series of
 * identifiers which can be used to uniquely identify it to the user.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link prototype5.impl.VizObjectImpl#getId <em>Id</em>}</li>
 * <li>{@link prototype5.impl.VizObjectImpl#getDescription <em>Description</em>}
 * </li>
 * <li>{@link prototype5.impl.VizObjectImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VizObjectImpl extends MinimalEObjectImpl.Container
		implements VizObject {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VizObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.VIZ_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prototype5Package.VIZ_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prototype5Package.VIZ_OBJECT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prototype5Package.VIZ_OBJECT__NAME, oldName, name));
	}

	/**
	 * Return a deep copy of this object.
	 * 
	 * @generated NOT
	 */
	public EObject clone() {
		// Create another VizObject and copy this object's contents into it.
		VizObject clone = new VizObjectImpl();
		clone.copy(this);
		return clone;
	}

	/**
	 * Deep copy the contents of the given VizObject into this one.
	 * 
	 * @generated NOT
	 * 
	 * @param otherObject
	 *            The object to be copied.
	 */
	public void copy(VizObject otherObject) {
		// Copy the class variables
		description = otherObject.getDescription();
		id = otherObject.getId();
		name = otherObject.getName();

		// Notify listeners of a change
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prototype5Package.VIZ_OBJECT, null, null));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Prototype5Package.VIZ_OBJECT__ID:
			return getId();
		case Prototype5Package.VIZ_OBJECT__DESCRIPTION:
			return getDescription();
		case Prototype5Package.VIZ_OBJECT__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Prototype5Package.VIZ_OBJECT__ID:
			setId((Integer) newValue);
			return;
		case Prototype5Package.VIZ_OBJECT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Prototype5Package.VIZ_OBJECT__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Prototype5Package.VIZ_OBJECT__ID:
			setId(ID_EDEFAULT);
			return;
		case Prototype5Package.VIZ_OBJECT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Prototype5Package.VIZ_OBJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Prototype5Package.VIZ_OBJECT__ID:
			return id != ID_EDEFAULT;
		case Prototype5Package.VIZ_OBJECT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
		case Prototype5Package.VIZ_OBJECT__NAME:
			return NAME_EDEFAULT == null ? name != null
					: !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case Prototype5Package.VIZ_OBJECT___CLONE:
			return clone();
		case Prototype5Package.VIZ_OBJECT___COPY__VIZOBJECT:
			copy((VizObject) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // VizObjectImpl
