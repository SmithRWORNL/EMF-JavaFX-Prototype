/**
 */
package prototype5.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EContentAdapter;
import prototype5.AbstractMeshComponent;
import prototype5.AbstractView;
import prototype5.Prototype5Package;
import prototype5.Transformation;

/**
 * The view of an AbstractMeshComponent shown to the user. The view is
 * responsible for creating, managing, and updating the datastructure(s) which
 * display the associated AbstractMeshComponent in the view's rendering engine's
 * native data types.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link prototype5.impl.AbstractViewImpl#getTransformation
 * <em>Transformation</em>}</li>
 * <li>{@link prototype5.impl.AbstractViewImpl#getPreviousTransformation
 * <em>Previous Transformation</em>}</li>
 * <li>{@link prototype5.impl.AbstractViewImpl#getAdapter <em>Adapter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractViewImpl extends MinimalEObjectImpl.Container
		implements AbstractView {
	/**
	 * The cached value of the '{@link #getTransformation()
	 * <em>Transformation</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation transformation;

	/**
	 * The cached value of the '{@link #getPreviousTransformation()
	 * <em>Previous Transformation</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPreviousTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation previousTransformation;

	/**
	 * The default value of the '{@link #getAdapter() <em>Adapter</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final EContentAdapter ADAPTER_EDEFAULT = null;

	/**
	 * The adapter which is responsible for listening for updates from other
	 * objects, usually the transformation.
	 * 
	 * @see #getAdapter()
	 * @generated
	 * @ordered
	 */
	protected EContentAdapter adapter = ADAPTER_EDEFAULT;

	/**
	 * The default constructor.
	 * 
	 * @generated NOT
	 */
	protected AbstractViewImpl() {
		super();
		transformation = new TransformationImpl();
		previousTransformation = new TransformationImpl();

		// Create an adapter set to run the update() method when a change is
		// fired.
		adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				update(notification);
			}
		};

		register(transformation);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.ABSTRACT_VIEW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject) transformation;
			transformation = (Transformation) eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prototype5Package.ABSTRACT_VIEW__TRANSFORMATION,
							oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		Transformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prototype5Package.ABSTRACT_VIEW__TRANSFORMATION,
					oldTransformation, transformation));
	}

	/**
	 * Register this object as a listener to the given transformation.
	 * 
	 * @param entity
	 *            The transformation to which this object will listen.
	 */
	public void register(EObject transformation) {

		// Add the adapter to the transformation's list of adapters.
		transformation.eAdapters().add(adapter);
	}

	/**
	 * Unregister this object as a listener to the given transformation.
	 * 
	 * @param entity
	 *            The transformation to which this object should no longer
	 *            listen.
	 */
	public void unregister(EObject transformation) {

		// Add the adapter to the transformation's list of adapters.
		transformation.eAdapters().remove(adapter);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transformation getPreviousTransformation() {
		if (previousTransformation != null
				&& previousTransformation.eIsProxy()) {
			InternalEObject oldPreviousTransformation = (InternalEObject) previousTransformation;
			previousTransformation = (Transformation) eResolveProxy(
					oldPreviousTransformation);
			if (previousTransformation != oldPreviousTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Prototype5Package.ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION,
							oldPreviousTransformation, previousTransformation));
			}
		}
		return previousTransformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transformation basicGetPreviousTransformation() {
		return previousTransformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPreviousTransformation(
			Transformation newPreviousTransformation) {
		Transformation oldPreviousTransformation = previousTransformation;
		previousTransformation = newPreviousTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Prototype5Package.ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION,
					oldPreviousTransformation, previousTransformation));
	}

	/**
	 * TODO Delete this method when done with EMF
	 * 
	 * Dummy function to prevent emf from regenerating the getter
	 * 
	 * @generated NOT
	 */
	public EContentAdapter getAdapter() {
		// Do nothing
		return null;
	}

	/**
	 * TODO Delete this method when done with EMF
	 * 
	 * Dummy function to prevent emf from regenerating the setter
	 * 
	 * @generated NOT
	 */
	public void setAdapter(EContentAdapter newAdapter) {
		// Do nothing
	}

	/**
	 * Notifies the part that the rendering engine has graphically applied the
	 * newest transformation to it.
	 * 
	 * @generated NOT
	 */
	public void synched() {
		// Update the previous transformation to the part's current status.
		previousTransformation = (Transformation) transformation.clone();
	}

	/**
	 * Creates an object which represents the part's model in a native data type
	 * for the application associated with this controller.
	 * 
	 * @generated NOT
	 */
	public Object getRepresentation() {
		// Nothing to do.
		return null;
	}

	/**
	 * The function called when the view receives an update from an object it is
	 * listening to, normally its transformation.
	 *
	 * @param notification
	 *            The message received from the observed object
	 *
	 * @generated NOT
	 */
	public void update(Notification notification) {

		// Pass the notification up to the controller.
		if (eNotificationRequired())
			eNotify(notification);
	}

	/**
	 * Refreshes the representation of the model.
	 * 
	 * @generated NOT
	 * 
	 * @param model
	 *            A reference to the view's model
	 */
	public void refresh(AbstractMeshComponent model) {
		// Nothing to do
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Prototype5Package.ABSTRACT_VIEW__TRANSFORMATION:
			if (resolve)
				return getTransformation();
			return basicGetTransformation();
		case Prototype5Package.ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION:
			if (resolve)
				return getPreviousTransformation();
			return basicGetPreviousTransformation();
		case Prototype5Package.ABSTRACT_VIEW__ADAPTER:
			return getAdapter();
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
		case Prototype5Package.ABSTRACT_VIEW__TRANSFORMATION:
			setTransformation((Transformation) newValue);
			return;
		case Prototype5Package.ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION:
			setPreviousTransformation((Transformation) newValue);
			return;
		case Prototype5Package.ABSTRACT_VIEW__ADAPTER:
			setAdapter((EContentAdapter) newValue);
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
		case Prototype5Package.ABSTRACT_VIEW__TRANSFORMATION:
			setTransformation((Transformation) null);
			return;
		case Prototype5Package.ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION:
			setPreviousTransformation((Transformation) null);
			return;
		case Prototype5Package.ABSTRACT_VIEW__ADAPTER:
			setAdapter(ADAPTER_EDEFAULT);
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
		case Prototype5Package.ABSTRACT_VIEW__TRANSFORMATION:
			return transformation != null;
		case Prototype5Package.ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION:
			return previousTransformation != null;
		case Prototype5Package.ABSTRACT_VIEW__ADAPTER:
			return ADAPTER_EDEFAULT == null ? adapter != null
					: !ADAPTER_EDEFAULT.equals(adapter);
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
		case Prototype5Package.ABSTRACT_VIEW___SYNCHED:
			synched();
			return null;
		case Prototype5Package.ABSTRACT_VIEW___GET_REPRESENTATION:
			return getRepresentation();
		case Prototype5Package.ABSTRACT_VIEW___UPDATE__NOTIFICATION:
			update((Notification) arguments.get(0));
			return null;
		case Prototype5Package.ABSTRACT_VIEW___REFRESH__ABSTRACTMESHCOMPONENT:
			refresh((AbstractMeshComponent) arguments.get(0));
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
		result.append(" (adapter: ");
		result.append(adapter);
		result.append(')');
		return result.toString();
	}

} // AbstractViewImpl
