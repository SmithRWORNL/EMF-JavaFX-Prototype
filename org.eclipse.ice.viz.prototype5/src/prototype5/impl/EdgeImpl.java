/**
 */
package prototype5.impl;

import java.util.Map.Entry;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import prototype5.Edge;
import prototype5.Prototype5Package;
import prototype5.Vertex;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Edge</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prototype5.impl.EdgeImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends AbstractMeshComponentImpl implements Edge {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
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
		
		//Add a reference to this to the vertices
		start.addEntity(this);
		end.addEntity(this);

		// Set the initial length
		EList<Double> startPoint = start.getLocation();
		EList<Double> endPoint = end.getLocation();
		length = Math.sqrt(Math.pow(startPoint.get(0) + endPoint.get(0), 2)
				+ Math.pow(startPoint.get(1) + endPoint.get(1), 2) + Math.pow(startPoint.get(2) + endPoint.get(2), 2));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Dummied out function that needs to exist to stop ECore from regenerating it. 
	 * 
	 * TODO Remove this function once done with EMF.
	 * 
	 * @generated NOT
	 */
	public void setLength(double newLength) {
		//Do nothing
	}
	

	/**
	 * Adds a new entity to the edge. Caps the edge at a maximum of two vertices, and recalculates the edge's length when a second vertex is added.
	 * 
	 * @param newEntity The vertex to add to the edge.
	 */
	@Override
	public void addEntity(VizObject newEntity){
		//The number of vertices
		int verticesNum = 0;
		
		//Count the number of vertices
		if (newEntity instanceof Vertex){
			for (Entry<String, EList<VizObject>> category : entities){
				for (VizObject entity : category.getValue()){
					if (entity instanceof Vertex){
						verticesNum++;
					}
				}
			}
		}

		//If the object is a vertex and the edge already has both vertices, fail silently.
		if (verticesNum >= 2){
			return;
		}

		//Add the entity
		super.addEntity(newEntity);
		
		//If this was the second vertex, calculate the edge's new length.
		if (verticesNum == 1){			
			EList<Double> startPoint = ((Vertex) entities.get(0).getValue().get(0)).getLocation();
			EList<Double> endPoint = ((Vertex) entities.get(0).getValue().get(1)).getLocation();
			length = Math.sqrt(Math.pow(startPoint.get(0) + endPoint.get(0), 2)
					+ Math.pow(startPoint.get(1) + endPoint.get(1), 2) + Math.pow(startPoint.get(2) + endPoint.get(2), 2));
		}
		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Prototype5Package.EDGE__LENGTH:
				setLength((Double)newValue);
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
			case Prototype5Package.EDGE__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
			case Prototype5Package.EDGE__LENGTH:
				return length != LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} // EdgeImpl
