/**
 */
package prototype5.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import java.util.Map.Entry;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import prototype5.AbstractMeshComponent;
import prototype5.MeshType;
import prototype5.Prototype5Package;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Abstract Mesh Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prototype5.impl.AbstractMeshComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link prototype5.impl.AbstractMeshComponentImpl#getUpdateLock <em>Update Lock</em>}</li>
 *   <li>{@link prototype5.impl.AbstractMeshComponentImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link prototype5.impl.AbstractMeshComponentImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link prototype5.impl.AbstractMeshComponentImpl#getAdapter <em>Adapter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractMeshComponentImpl extends VizObjectImpl implements AbstractMeshComponent {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MeshType TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MeshType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateLock() <em>Update Lock</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUpdateLock()
	 * @generated
	 * @ordered
	 */
	protected static final AtomicBoolean UPDATE_LOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateLock() <em>Update Lock</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUpdateLock()
	 * @generated
	 * @ordered
	 */
	protected AtomicBoolean updateLock = UPDATE_LOCK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, EList<VizObject>>> entities;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, String>> properties;

	/**
	 * The default value of the '{@link #getAdapter() <em>Adapter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final EContentAdapter ADAPTER_EDEFAULT = null;

	protected EContentAdapter adapter;

	/**
	 * The default constructor
	 * 
	 * @generated NOT
	 */
	protected AbstractMeshComponentImpl() {
		super();

		// Instantiate the class variables
		entities = new BasicEList<Entry<String, EList<VizObject>>>();
		properties = new BasicEList<Entry<String, String>>();

		// Create an adapter set to run the update() method when a change is
		// fired.
		adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				update(notification);
			}
		};

	}

	/**
	 * A constructor allowing the user to specify the mesh's type.
	 * 
	 * @param type
	 *            The type of mesh this component models.
	 */
	public AbstractMeshComponentImpl(MeshType type) {
		super();

		// Instantiate the class variables
		entities = new BasicEList<Entry<String, EList<VizObject>>>();
		properties = new BasicEList<Entry<String, String>>();
		this.type = type;

		// Create an adapter set to run the update() method when a change is
		// fired.
		adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				update(notification);
			}
		};
	}

	/**
	 * A constructor which provides a set of child entities for the
	 * MeshComponent.
	 * 
	 * @param entities
	 *            The list of initial entities.
	 */
	public AbstractMeshComponentImpl(List<VizObject> entities) {
		super();

		// Create a list of entities
		this.entities = new BasicEList<Entry<String, EList<VizObject>>>();

		// Convert the input into an Entry and add it to the map
		BasicEList<VizObject> tempList = new BasicEList<VizObject>(entities);
		Entry<String, EList<VizObject>> entry = new AbstractMap.SimpleEntry<String, EList<VizObject>>("Default",
				tempList);
		this.entities.add(entry);

		// Instantiate the class variables
		properties = new BasicEList<Entry<String, String>>();

		// Create an adapter set to run the update() method when a change is
		// fired.
		adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				update(notification);
			}
		};
	}

	/**
	 * A constructor which provides a set of child entities and a mesh type
	 * 
	 * @param entities
	 *            The list of initial entities
	 * @param type
	 *            The mesh's type
	 */
	public AbstractMeshComponentImpl(List<VizObject> entities, MeshType type) {
		super();

		// Create a list of entities
		this.entities = new BasicEList<Entry<String, EList<VizObject>>>();

		// Convert the input into an Entry and add it to the map
		BasicEList<VizObject> tempList = new BasicEList<VizObject>(entities);
		Entry<String, EList<VizObject>> entry = new AbstractMap.SimpleEntry<String, EList<VizObject>>("Default",
				tempList);
		this.entities.add(entry);

		// Instantiate the class variables
		properties = new BasicEList<Entry<String, String>>();
		this.type = type;

		// Create an adapter set to run the update() method when a change is
		// fired.
		adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				update(notification);
			}
		};
	}

	/**
	 * A constructor taking a map of input to initialize the MeshComponent. If
	 * the type is custom part, then the constructor will take a map of initial
	 * properties in the form of a Map<String, String> keyed on property names.
	 * Otherwise, it will take a map of initial entities in the form of a
	 * Map<String, EList<VizObject>> keyed on category names.
	 * 
	 * @param input
	 *            The map representing the child entities and their categories
	 *            or properties, according to the component's type.
	 * @param type
	 *            The type of component the mesh represents.
	 */
	public AbstractMeshComponentImpl(Map<String, Object> input, MeshType type) {
		super();

		// Instantiate the class variables
		entities = new BasicEList<Entry<String, EList<VizObject>>>();
		properties = new BasicEList<Entry<String, String>>();
		this.type = type;

		// If the type is a custom part, the input should be a properties map
		if (type == MeshType.CUSTOM_PART) {

			// For each property, create an entry and add it to the list
			for (String property : input.keySet()) {
				properties.add(new AbstractMap.SimpleEntry<String, String>(property, (String) input.get(property)));
			}
		}

		// Otherwise the input is a list of entities
		else {

			// For each category, create an entry and add it to the map
			for (String category : input.keySet()) {
				BasicEList<VizObject> tempList = new BasicEList<VizObject>((List<VizObject>) input.get(category));
				Entry<String, EList<VizObject>> entry = new AbstractMap.SimpleEntry<String, EList<VizObject>>(category,
						tempList);
				this.entities.add(entry);
			}
		}

		// Create an adapter set to run the update() method when a change is
		// fired.
		adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				update(notification);
			}
		};

	}

	/**
	 * The method called whenever a registered entity in this object's map sends
	 * a notification of a change. 
	 * 
	 * This function does nothing by default, and is intended to be overridden
	 * by subclasses.
	 * 
	 * @param notification
	 */
	public void update(Notification notification) {
		// Nothing to do
	}

	/**
	 * Register this object as a listener to the given entity.
	 * 
	 * @param entity
	 *            The entity to which this object will listen.
	 */
	public void register(VizObject entity) {
		entity.eAdapters().add(adapter);
	}

	/**
	 * Unregister this object as a listener to the given entity
	 * 
	 * @param entity
	 *            The entity to which this object should no longer listen.
	 */
	public void unregister(VizObject entity) {
		entity.eAdapters().remove(adapter);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.ABSTRACT_MESH_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeshType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MeshType newType) {
		MeshType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.ABSTRACT_MESH_COMPONENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicBoolean getUpdateLock() {
		return updateLock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateLock(AtomicBoolean newUpdateLock) {
		AtomicBoolean oldUpdateLock = updateLock;
		updateLock = newUpdateLock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.ABSTRACT_MESH_COMPONENT__UPDATE_LOCK, oldUpdateLock, updateLock));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map.Entry<String, EList<VizObject>>> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<Map.Entry<String, EList<VizObject>>>(Entry.class, this, Prototype5Package.ABSTRACT_MESH_COMPONENT__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map.Entry<String, String>> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<Map.Entry<String, String>>(Entry.class, this, Prototype5Package.ABSTRACT_MESH_COMPONENT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EContentAdapter getAdapter() {
		return adapter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapter(EContentAdapter newAdapter) {
		EContentAdapter oldAdapter = adapter;
		adapter = newAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.ABSTRACT_MESH_COMPONENT__ADAPTER, oldAdapter, adapter));
	}

	/**
	 * Return all of the part's children entities of a given category.
	 * 
	 * @generated NOT
	 * 
	 * @category The category of entities to return
	 */
	public EList<VizObject> getEntitiesByCategory(String category) {

		// Check each Entry for the one with the given category
		for (Entry<String, EList<VizObject>> entity : entities) {
			if (!(entity.getKey() == category)) {
				continue;
			}
			return entity.getValue();
		}

		// If the category was not found, return an empty list
		return new BasicEList<VizObject>();
	}

	/**
	 * Return the value of the given property
	 * 
	 * @generated NOT
	 * 
	 * @property The property to return
	 */
	public String getProperty(String property) {
		// Check each Entry for the one with the given category
		for (Entry<String, String> tempProperty : properties) {
			if (!(tempProperty.getKey() == property)) {
				continue;
			}
			return tempProperty.getValue();
		}

		// If the category was not found, return null
		return null;
	}

	/**
	 * Set the given property, creating it in the map if it is not already
	 * present.
	 * 
	 * @generated NOT
	 * 
	 * @property The property to set
	 * @value The property's new value
	 */
	public void setProperty(String property, String value) {
		// The property's previous value
		String prevValue = "";

		// Check each Entry for the one with the given property
		for (Entry<String, String> tempProperty : properties) {
			if (!(tempProperty.getKey() == property)) {
				continue;
			}

			prevValue = tempProperty.getValue();

			// Set the property
			tempProperty.setValue(value);

			// Send notification that properties have been changed
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						Prototype5Package.ABSTRACT_MESH_COMPONENT__PROPERTIES, prevValue, value));

			return;
		}

		// If the property wasn't found in the map, add it
		properties.add(new AbstractMap.SimpleEntry<String, String>(property, value));

		// Send notification that properties have been changed
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.ABSTRACT_MESH_COMPONENT__PROPERTIES,
					prevValue, value));
	}

	/**
	 * Add a new entity to the part. A convenience method which allows for the
	 * specification of a default behavior for new entities when no category is
	 * specified.
	 * 
	 * @generated NOT
	 * 
	 * @newEntity The child entity to add to the part.
	 */
	public void addEntity(VizObject newEntity) {
		addEntityByCategory(newEntity, "Default");

	}

	/**
	 * Removes the given entity from the part's children
	 *
	 * @generated NOT
	 * 
	 * @entity The entity to be removed
	 */
	public void removeEntity(VizObject entity) {
		// Check each Entry the given entity
		for (Entry<String, EList<VizObject>> category : entities) {
			if (!category.getValue().contains(entity)) {
				continue;
			}

			// Remove the entity from the list and unregister from it.
			category.getValue().remove(entity);
			unregister(entity);

			// Send notification that entities have been changed
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						Prototype5Package.ABSTRACT_MESH_COMPONENT__ENTITIES, entity, ""));
			return;
		}
	}

	/**
	 * Adds a new child entity under the given category.
	 *
	 * @generated NOT
	 * 
	 * @param newEntity
	 *            The new child entity to be added
	 * @param category
	 *            The new entity's category
	 */
	public void addEntityByCategory(VizObject newEntity, String category) {
		// Check each Entry for the one with the given category
		for (Entry<String, EList<VizObject>> tempCategory : entities) {
			if (!(tempCategory.getKey() == category)) {
				continue;
			}

			// Add the new entitiy to the list
			tempCategory.getValue().add(newEntity);

			// Send notification that entities have been changed
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						Prototype5Package.ABSTRACT_MESH_COMPONENT__ENTITIES, "", newEntity));

			return;
		}

		// If the category is empty, create it and put the new entity inside.
		EList<VizObject> list = new BasicEList<VizObject>();
		list.add(newEntity);
		Entry<String, EList<VizObject>> entry = new AbstractMap.SimpleEntry<String, EList<VizObject>>(category, list);
		entities.add(entry);

		// Register with the entity
		register(newEntity);

		// Send notification that entities have been changed
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.ABSTRACT_MESH_COMPONENT__ENTITIES,
					null, newEntity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__TYPE:
				return getType();
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__UPDATE_LOCK:
				return getUpdateLock();
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__ENTITIES:
				return getEntities();
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__PROPERTIES:
				return getProperties();
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__ADAPTER:
				return getAdapter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__TYPE:
				setType((MeshType)newValue);
				return;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__UPDATE_LOCK:
				setUpdateLock((AtomicBoolean)newValue);
				return;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Map.Entry<String, EList<VizObject>>>)newValue);
				return;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Map.Entry<String, String>>)newValue);
				return;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__ADAPTER:
				setAdapter((EContentAdapter)newValue);
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
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__UPDATE_LOCK:
				setUpdateLock(UPDATE_LOCK_EDEFAULT);
				return;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__ENTITIES:
				getEntities().clear();
				return;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__PROPERTIES:
				getProperties().clear();
				return;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__ADAPTER:
				setAdapter(ADAPTER_EDEFAULT);
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
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__TYPE:
				return type != TYPE_EDEFAULT;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__UPDATE_LOCK:
				return UPDATE_LOCK_EDEFAULT == null ? updateLock != null : !UPDATE_LOCK_EDEFAULT.equals(updateLock);
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__ENTITIES:
				return entities != null && !entities.isEmpty();
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case Prototype5Package.ABSTRACT_MESH_COMPONENT__ADAPTER:
				return ADAPTER_EDEFAULT == null ? adapter != null : !ADAPTER_EDEFAULT.equals(adapter);
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
			case Prototype5Package.ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING:
				return getEntitiesByCategory((String)arguments.get(0));
			case Prototype5Package.ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING:
				return getProperty((String)arguments.get(0));
			case Prototype5Package.ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING:
				setProperty((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT:
				addEntity((VizObject)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT:
				removeEntity((VizObject)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING:
				addEntityByCategory((VizObject)arguments.get(0), (String)arguments.get(1));
				return null;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION:
				update((Notification)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT:
				register((VizObject)arguments.get(0));
				return null;
			case Prototype5Package.ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT:
				unregister((VizObject)arguments.get(0));
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
		result.append(" (type: ");
		result.append(type);
		result.append(", updateLock: ");
		result.append(updateLock);
		result.append(", adapter: ");
		result.append(adapter);
		result.append(')');
		return result.toString();
	}

} // AbstractMeshComponentImpl
