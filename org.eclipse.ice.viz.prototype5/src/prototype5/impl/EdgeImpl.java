/**
 */
package prototype5.impl;

import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import prototype5.Edge;
import prototype5.Prototype5Package;
import prototype5.Vertex;
import prototype5.VizObject;

/**
 * A mesh component representing a line between two Vertices.
 * 
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link prototype5.impl.EdgeImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends AbstractMeshComponentImpl implements Edge {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The edge's length.
	 * 
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EdgeImpl() {
		super();
	}

	/**
	 * The default constructor. It creates an edge between the two specified
	 * vertices.
	 * 
	 * @param start
	 * @param end
	 */
	public EdgeImpl(Vertex start, Vertex end) {
		super();

		// Add the vertices to the list of entities.
		addEntity(start);
		addEntity(end);

		// Add a reference to this to the vertices
		start.addEntity(this);
		end.addEntity(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Dummied out function that needs to exist to stop ECore from regenerating
	 * it.
	 * 
	 * TODO Remove this function once done with EMF.
	 * 
	 * @generated NOT
	 */
	public void setLength(double newLength) {
		// Do nothing
	}

	/**
	 * Adds a new entity to the edge. Caps the edge at a maximum of two
	 * vertices, and recalculates the edge's length when a second vertex is
	 * added.
	 * 
	 * @param newEntity
	 *            The vertex to add to the edge.
	 */
	@Override
	public void addEntity(VizObject newEntity) {

		// When a vertex is added, take action to ensure the edge maintain's its
		// proper state
		if (newEntity instanceof Vertex) {

			// The number of vertices
			int verticesNum = 0;

			// Count the number of vertices
			if (newEntity instanceof Vertex) {
				for (Entry<String, EList<VizObject>> category : entities) {
					if (category.getKey() == "Vertices") {
						verticesNum = category.getValue().size();
					}
				}
			}

			// If the object is a vertex and the edge already has both vertices,
			// fail silently.
			if (verticesNum >= 2) {
				return;
			}

			// Add the entity
			super.addEntity(newEntity);

			// If this was the second vertex, calculate the edge's new length.
			if (verticesNum == 1) {
				EList<Double> startPoint = ((Vertex) entities.get(0).getValue()
						.get(0)).getLocation();
				EList<Double> endPoint = ((Vertex) entities.get(0).getValue()
						.get(1)).getLocation();
				length = Math
						.sqrt(Math.pow(startPoint.get(0) + endPoint.get(0), 2)
								+ Math.pow(startPoint.get(1) + endPoint.get(1),
										2)
						+ Math.pow(startPoint.get(2) + endPoint.get(2), 2));
			}

			// For other entities, add them normally
		} else {
			super.addEntity(newEntity);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * prototype5.impl.AbstractMeshComponentImpl#addEntityByCategory(prototype5.
	 * VizObject, java.lang.String)
	 */
	@Override
	public void addEntityByCategory(VizObject newEntity, String category) {

		// If the category is not vertices, add the entity as normal
		if (category != "Vertices") {
			super.addEntityByCategory(newEntity, category);
		}

		// Allow the addEntity() function to properly handle adding a vertex
		else {
			addEntity(newEntity);
		}
	}

	@Override
	public void removeEntity(VizObject entity) {
		// Check each Entry the given entity
		for (Entry<String, EList<VizObject>> category : entities) {
			if (!category.getValue().contains(entity)) {
				continue;
			}

			// If removing one of the two vertices, set the length to 0
			if (category.getKey().equals("Vertices")) {
				length = 0;
			}

			// Remove the entity from the list and unregister from it.
			category.getValue().remove(entity);
			unregister(entity);

			// Send notification that entities have been changed
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						Prototype5Package.ABSTRACT_MESH_COMPONENT__ENTITIES,
						entity, ""));
			return;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Prototype5Package.EDGE__LENGTH:
			return getLength();
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
		case Prototype5Package.EDGE__LENGTH:
			setLength((Double) newValue);
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
		case Prototype5Package.EDGE__LENGTH:
			setLength(LENGTH_EDEFAULT);
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
		case Prototype5Package.EDGE__LENGTH:
			return length != LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} // EdgeImpl
