/**
 */
package prototype5.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;

import prototype5.AbstractController;
import prototype5.AbstractMeshComponent;
import prototype5.AbstractView;
import prototype5.Prototype5Package;
import prototype5.Transformation;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Abstract Controller</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prototype5.impl.AbstractControllerImpl#getDisposed <em>Disposed</em>}</li>
 *   <li>{@link prototype5.impl.AbstractControllerImpl#getModel <em>Model</em>}</li>
 *   <li>{@link prototype5.impl.AbstractControllerImpl#getView <em>View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractControllerImpl extends MinimalEObjectImpl.Container implements AbstractController {
	/**
	 * The default value of the '{@link #getDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDisposed()
	 * @generated
	 * @ordered
	 */
	protected static final AtomicBoolean DISPOSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDisposed()
	 * @generated
	 * @ordered
	 */
	protected AtomicBoolean disposed = DISPOSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected AbstractMeshComponent model;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected AbstractView view;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractControllerImpl() {
		super();
	}

	/**
	 * Constructor for an AbstractController with its associated model and view.
	 * 
	 * @param model
	 *            The model to be managed.
	 * @param view
	 *            The model's view.
	 */
	public AbstractControllerImpl(AbstractMeshComponent model, AbstractView view) {
		super();

		// Initialize the class variables
		this.model = model;
		this.view = view;
		disposed = new AtomicBoolean();
		disposed.set(false);

		// Set the model's listener
		EContentAdapter modelAdapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				modelUpdate(notification);
			}
		};

		model.eAdapters().add(modelAdapter);

		// Set the view's listener
		EContentAdapter viewAdapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				viewUpdate(notification);
			}
		};

		view.eAdapters().add(viewAdapter);
	}

	/**
	 * The function called when the controller receives an update from the model
	 * or any of its data fields.
	 * 
	 * This function is intended to be overridden by subclasses, and does
	 * nothing on its own.
	 * 
	 * @generated NOT
	 * 
	 * @param notification
	 *            The received update from the model.
	 */
	public void modelUpdate(Notification notification) {

		// Pass the notification to listeners.
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, notification.getEventType(), notification.getFeatureID(null),
					notification.getOldValue(), notification.getNewValue()));

	}

	/**
	 * The function called when the controller receives an update from the view
	 * or any of its data fields.
	 * 
	 * This function is intended to be overridden by subclasses, and does
	 * nothing on its own.
	 * 
	 * @generated NOT
	 * 
	 * @param notification
	 */
	public void viewUpdate(Notification notification) {

		// Pass the notification to listeners
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, notification.getEventType(), notification.getFeatureID(null),
					notification.getOldValue(), notification.getNewValue()));
	}

	/**
	 * Alerts the view to refresh itself based on changes in the model
	 * 
	 * @generated NOT
	 */
	public void refresh() {
		view.refresh(model);
	}

	/**
	 * Informs the controller that the graphics engine's rendering of the part
	 * has been synchronized with the controller's state.
	 * 
	 * @generated NOT
	 */
	public void synched() {
		view.synched();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.ABSTRACT_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicBoolean getDisposed() {
		return disposed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposed(AtomicBoolean newDisposed) {
		AtomicBoolean oldDisposed = disposed;
		disposed = newDisposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.ABSTRACT_CONTROLLER__DISPOSED, oldDisposed, disposed));
	}

	/**
	 * Set the the controller as being disposed.
	 * 
	 * @newDisposed Whether or not the controller is disposed.
	 */
	public void setDisposed(boolean newDisposed) {
		boolean oldDisposed = disposed.getAndSet(newDisposed);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.ABSTRACT_CONTROLLER__DISPOSED,
					oldDisposed, disposed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMeshComponent getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (AbstractMeshComponent)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Prototype5Package.ABSTRACT_CONTROLLER__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMeshComponent basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(AbstractMeshComponent newModel) {
		AbstractMeshComponent oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.ABSTRACT_CONTROLLER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractView getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject)view;
			view = (AbstractView)eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Prototype5Package.ABSTRACT_CONTROLLER__VIEW, oldView, view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractView basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(AbstractView newView) {
		AbstractView oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.ABSTRACT_CONTROLLER__VIEW, oldView, view));
	}

	/**
	 * Adds an entity to the model.
	 * 
	 * @generated NOT
	 */
	public void addEntity(VizObject newEntity) {
		model.addEntity(newEntity);
	}

	/**
	 * Dispose the controller and its resources.
	 * 
	 * @generated NOT
	 */
	public void dispose() {
		setDisposed(true);
	}

	/**
	 * Gets a list of all the part's children entities.
	 * 
	 * @generated NOT
	 */
	public EList<VizObject> getEntities() {
		// Get the map of all properties
		EList<Entry<String, EList<VizObject>>> map = model.getEntities();

		// Combine the lists from all the map's categories
		EList<VizObject> entities = new BasicEList<VizObject>();
		for (Entry<String, EList<VizObject>> entry : map) {
			entities.addAll(entry.getValue());
		}

		// Return the combined list.
		return entities;
	}

	/**
	 * Returns all the part's child entities of the given category
	 * 
	 * @category The category of entities to get.
	 * @generated NOT
	 */
	public EList<VizObject> getEntitiesByCategory(String category) {
		return model.getEntitiesByCategory(category);
	}

	/**
	 * Gets the last transformation fully applied to this part.
	 * 
	 * @generated NOT
	 */
	public Transformation getPreviousTransformation() {
		return view.getPreviousTransformation();
	}

	/**
	 * Get the specified property's value.
	 * 
	 * @generated NOT
	 * 
	 * @property The property to get.
	 */
	public String getProperty(String property) {
		return model.getProperty(property);
	}

	/**
	 * Get the part's representation as an object specific to the application
	 * rendering it.
	 * 
	 * @generated NOT
	 */
	public Object getRepresentation() {
		return view.getRepresentation();
	}

	/**
	 * Get the part's rotation in the x, y, and z directions
	 * 
	 * @generated NOT
	 */
	public EList<Double> getRotation() {
		return view.getTransformation().getRotation();
	}

	/**
	 * Get the part's scale in the x, y, and z directions.
	 * 
	 * @generated NOT
	 */
	public EList<Double> getScale() {
		return view.getTransformation().getScale();
	}

	/**
	 * Get the part's size.
	 * 
	 * @generated NOT
	 */
	public double getSize() {
		return view.getTransformation().getSize();
	}

	/**
	 * Get the part's skew in the x, y, and z directions
	 * 
	 * @generated NOT
	 */
	public EList<Double> getSkew() {
		return view.getTransformation().getSkew();
	}

	/**
	 * Get the part's transformation.
	 * 
	 * @generated NOT
	 */
	public Transformation getTransformation() {
		return view.getTransformation();
	}

	/**
	 * Get the part's translation in the x, y, and z directions
	 * 
	 * @generated NOT
	 */
	public EList<Double> getTranslation() {
		return view.getTransformation().getTranslation();
	}

	/**
	 * Remove an entity from the part's child entities.
	 * 
	 * @generated NOT
	 * 
	 * @entity The entity to be removed
	 */
	public void removeEntity(VizObject entity) {
		model.removeEntity(entity);
	}

	/**
	 * Set the given property to a new value
	 * 
	 * @generated NOT
	 * 
	 * @property The property to modify
	 * @value The property's new value
	 */
	public void setProperty(String property, String value) {
		model.setProperty(property, value);
	}

	/**
	 * Set the part's rotation in the x, y, and x directions.
	 * 
	 * @generated NOT
	 * 
	 * @x The amount of x rotation to apply
	 * @y The amount of y rotation to apply
	 * @z The amount of z rotation to apply
	 */
	public void setRotation(double x, double y, double z) {
		view.getTransformation().setRotation(x, y, z);
	}

	/**
	 * Set the part's scale in the x, y, and x directions.
	 * 
	 * @generated NOT
	 * 
	 * @x The part's x scale
	 * @y The part's y scale
	 * @z The part's z scale
	 */
	public void setScale(double x, double y, double z) {
		view.getTransformation().setScale(x, y, z);
	}

	/**
	 * Set the part's size
	 * 
	 * @generated NOT
	 * 
	 * @newSize The new multiplier for the part's size
	 */
	public void setSize(double newSize) {
		view.getTransformation().setSize(newSize);
	}

	/**
	 * Set the part's skew in the x, y, and x directions.
	 * 
	 * @generated NOT
	 * 
	 * @x The amount of x skew to apply
	 * @y The amount of y skew to apply
	 * @z The amount of z skew to apply
	 */
	public void setSkew(double x, double y, double z) {
		view.getTransformation().setSkew(x, y, z);
	}

	/**
	 * Set the part's transformation
	 * 
	 * @generated NOT
	 * 
	 * @newTransformation The transformation to apply to the part.
	 */
	public void setTransformation(Transformation newTransformation) {
		view.setTransformation(newTransformation);
	}

	/**
	 * Set the part's translation in the x, y, and x directions.
	 * 
	 * @generated NOT
	 * 
	 * @x The amount of x translation to apply
	 * @y The amount of y translation to apply
	 * @z The amount of z translation to apply
	 */
	public void setTranslation(double x, double y, double z) {
		view.getTransformation().setTranslation(x, y, z);
	}

	/**
	 * Add an entity to the part under the given category.
	 * 
	 * @generated NOT
	 * 
	 * @param newEntity
	 *            The child entity to be added to this part
	 * @param category
	 *            The category under which to add the new child entity
	 */
	public void addEntityByCategory(VizObject newEntity, String category) {
		model.addEntityByCategory(newEntity, category);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Prototype5Package.ABSTRACT_CONTROLLER__DISPOSED:
				return getDisposed();
			case Prototype5Package.ABSTRACT_CONTROLLER__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case Prototype5Package.ABSTRACT_CONTROLLER__VIEW:
				if (resolve) return getView();
				return basicGetView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Prototype5Package.ABSTRACT_CONTROLLER__DISPOSED:
				setDisposed((AtomicBoolean)newValue);
				return;
			case Prototype5Package.ABSTRACT_CONTROLLER__MODEL:
				setModel((AbstractMeshComponent)newValue);
				return;
			case Prototype5Package.ABSTRACT_CONTROLLER__VIEW:
				setView((AbstractView)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Prototype5Package.ABSTRACT_CONTROLLER__DISPOSED:
				setDisposed(DISPOSED_EDEFAULT);
				return;
			case Prototype5Package.ABSTRACT_CONTROLLER__MODEL:
				setModel((AbstractMeshComponent)null);
				return;
			case Prototype5Package.ABSTRACT_CONTROLLER__VIEW:
				setView((AbstractView)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Prototype5Package.ABSTRACT_CONTROLLER__DISPOSED:
				return DISPOSED_EDEFAULT == null ? disposed != null : !DISPOSED_EDEFAULT.equals(disposed);
			case Prototype5Package.ABSTRACT_CONTROLLER__MODEL:
				return model != null;
			case Prototype5Package.ABSTRACT_CONTROLLER__VIEW:
				return view != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Prototype5Package.ABSTRACT_CONTROLLER___ADD_ENTITY__VIZOBJECT:
				addEntity((VizObject)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___DISPOSE:
				dispose();
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_ENTITIES:
				return getEntities();
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_ENTITIES_BY_CATEGORY__STRING:
				return getEntitiesByCategory((String)arguments.get(0));
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_PREVIOUS_TRANSFORMATION:
				return getPreviousTransformation();
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_PROPERTY__STRING:
				return getProperty((String)arguments.get(0));
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_REPRESENTATION:
				return getRepresentation();
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_ROTATION:
				return getRotation();
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_SCALE:
				return getScale();
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_SIZE:
				return getSize();
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_SKEW:
				return getSkew();
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_TRANSFORMATION:
				return getTransformation();
			case Prototype5Package.ABSTRACT_CONTROLLER___GET_TRANSLATION:
				return getTranslation();
			case Prototype5Package.ABSTRACT_CONTROLLER___REMOVE_ENTITY__VIZOBJECT:
				removeEntity((VizObject)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___SET_PROPERTY__STRING_STRING:
				setProperty((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE:
				setRotation((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___SET_SCALE__DOUBLE_DOUBLE_DOUBLE:
				setScale((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___SET_SIZE__DOUBLE:
				setSize((Double)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___SET_SKEW__DOUBLE_DOUBLE_DOUBLE:
				setSkew((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___SET_TRANSFORMATION__TRANSFORMATION:
				setTransformation((Transformation)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE:
				setTranslation((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING:
				addEntityByCategory((VizObject)arguments.get(0), (String)arguments.get(1));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___MODEL_UPDATE__NOTIFICATION:
				modelUpdate((Notification)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___VIEW_UPDATE__NOTIFICATION:
				viewUpdate((Notification)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___REFRESH:
				refresh();
				return null;
			case Prototype5Package.ABSTRACT_CONTROLLER___SYNCHED:
				synched();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (disposed: ");
		result.append(disposed);
		result.append(')');
		return result.toString();
	}

} // AbstractControllerImpl
