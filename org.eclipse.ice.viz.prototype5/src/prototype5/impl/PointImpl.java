/**
 */
package prototype5.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import prototype5.Point;
import prototype5.Prototype5Package;

/**
 * A mesh component representing a point in three dimensional space.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prototype5.impl.PointImpl#getX <em>X</em>}</li>
 *   <li>{@link prototype5.impl.PointImpl#getY <em>Y</em>}</li>
 *   <li>{@link prototype5.impl.PointImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointImpl extends AbstractMeshComponentImpl implements Point {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The point's x axis location.
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The point's y axis location.
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final double Z_EDEFAULT = 0.0;

	/**
	 * The point's z axis location.
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected double z = Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointImpl() {
		super();
	}
	
	/**
	 * The basic constructor, initializing the point's location.
	 * 
	 * @param x The point's location along the x axis
	 * @param y The point's location along the y axis
	 * @param z The point's location along the z axis
	 */
	public PointImpl(double x, double y, double z){
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.POINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.POINT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.POINT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(double newZ) {
		double oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.POINT__Z, oldZ, z));
	}

	/**
	 * Returns a vector describing the point's location in three dimensional space
	 * @generated NOT
	 */
	public EList<Double> getLocation() {
		
		//Create a list of the x, y, and z coordinates.
		EList<Double> location = new BasicEList<Double>(); 
		location.add(x);
		location.add(y);
		location.add(z);
		return location;
	}

	/**
	 * Set the point's location. This a convenience method for setting the x, y, and z coordinates with a single function.
	 * 
	 * @generated NOT
	 * 
	 * @param x The new x coordinate
	 * @param y The new y coordinate
	 * @param z The new z coordinate
	 */
	public void updateLocation(double x, double y, double z) {
		setX(x);
		setY(y);
		setZ(z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Prototype5Package.POINT__X:
				return getX();
			case Prototype5Package.POINT__Y:
				return getY();
			case Prototype5Package.POINT__Z:
				return getZ();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Prototype5Package.POINT__X:
				setX((Double)newValue);
				return;
			case Prototype5Package.POINT__Y:
				setY((Double)newValue);
				return;
			case Prototype5Package.POINT__Z:
				setZ((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Prototype5Package.POINT__X:
				setX(X_EDEFAULT);
				return;
			case Prototype5Package.POINT__Y:
				setY(Y_EDEFAULT);
				return;
			case Prototype5Package.POINT__Z:
				setZ(Z_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Prototype5Package.POINT__X:
				return x != X_EDEFAULT;
			case Prototype5Package.POINT__Y:
				return y != Y_EDEFAULT;
			case Prototype5Package.POINT__Z:
				return z != Z_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Prototype5Package.POINT___GET_LOCATION:
				return getLocation();
			case Prototype5Package.POINT___UPDATE_LOCATION__DOUBLE_DOUBLE_DOUBLE:
				updateLocation((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(')');
		return result.toString();
	}

} //PointImpl
