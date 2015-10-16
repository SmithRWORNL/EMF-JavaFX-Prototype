/**
 */
package prototype5.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import prototype5.Prototype5Package;
import prototype5.Transformation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Transformation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prototype5.impl.TransformationImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link prototype5.impl.TransformationImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link prototype5.impl.TransformationImpl#getSize <em>Size</em>}</li>
 *   <li>{@link prototype5.impl.TransformationImpl#getSkew <em>Skew</em>}</li>
 *   <li>{@link prototype5.impl.TransformationImpl#getTranslation <em>Translation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> rotation;
	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> scale;
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected double size = SIZE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSkew() <em>Skew</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSkew()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> skew;
	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> translation;

	/**
	 * The default constructor. It initializes the transformation to represent
	 * the part's default appearance, size, and orientation at the origin point.
	 * 
	 * @generated NOT
	 */
	protected TransformationImpl() {
		super();
		
		//Set rotation to 0
		rotation = new BasicEList<Double>();
		rotation.add(0d);
		rotation.add(0d);
		rotation.add(0d);

		//Set scale and size to 1
		scale = new BasicEList<Double>();
		scale.add(1d);
		scale.add(1d);
		scale.add(1d);

		size = 1d;

		//Set skew to 0
		skew = new BasicEList<Double>();
		skew.add(0d);
		skew.add(0d);
		skew.add(0d);

		//Set translation to 0
		translation = new BasicEList<Double>();
		translation.add(0d);
		translation.add(0d);
		translation.add(0d);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getRotation() {
		if (rotation == null) {
			rotation = new EDataTypeUniqueEList<Double>(Double.class, this, Prototype5Package.TRANSFORMATION__ROTATION);
		}
		return rotation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getScale() {
		if (scale == null) {
			scale = new EDataTypeUniqueEList<Double>(Double.class, this, Prototype5Package.TRANSFORMATION__SCALE);
		}
		return scale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(double newSize) {
		double oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.TRANSFORMATION__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getSkew() {
		if (skew == null) {
			skew = new EDataTypeUniqueEList<Double>(Double.class, this, Prototype5Package.TRANSFORMATION__SKEW);
		}
		return skew;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getTranslation() {
		if (translation == null) {
			translation = new EDataTypeUniqueEList<Double>(Double.class, this, Prototype5Package.TRANSFORMATION__TRANSLATION);
		}
		return translation;
	}

	/**
	 * Set the transformation's rotation.
	 *
	 * @generated NOT
	 * 
	 * @param x
	 *            X rotation
	 * @param y
	 *            Y rotation
	 * @param z
	 *            Z rotation
	 */
	public void setRotation(double x, double y, double z) {
		// Save the old rotation values
		EList<Double> prevRotation = new BasicEList<Double>(rotation);

		// Set rotation
		rotation.set(0, x);
		rotation.set(1, y);
		rotation.set(2, z);

		// Notify listeners of the change in rotation
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.TRANSFORMATION__ROTATION,
					prevRotation, rotation));
	}

	/**
	 * Set the transformation's scale.
	 *
	 * @generated NOT
	 * 
	 * @param x
	 *            X scale
	 * @param y
	 *            Y scale
	 * @param z
	 *            Z scale
	 */
	public void setScale(double x, double y, double z) {
		// Save the old scale values
		EList<Double> prevScale = new BasicEList<Double>(scale);

		// Set scale
		scale.set(0, x);
		scale.set(1, y);
		scale.set(2, z);

		// Notify listeners of the change in scale
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.TRANSFORMATION__SCALE, prevScale,
					scale));
	}

	/**
	 * Set the transformation's skew.
	 *
	 * @generated NOT
	 * 
	 * @param x
	 *            X skew
	 * @param y
	 *            Y skew
	 * @param z
	 *            Z skew
	 */
	public void setSkew(double x, double y, double z) {
		// Save the old skew values
		EList<Double> prevSkew = new BasicEList<Double>(skew);

		// Set skew
		skew.set(0, x);
		skew.set(1, y);
		skew.set(2, z);

		// Notify listeners of the change in scale
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.TRANSFORMATION__SKEW, prevSkew,
					skew));
	}

	/**
	 * Set the transformation's translation.
	 *
	 * @generated NOT
	 * 
	 * @param x
	 *            X translation
	 * @param y
	 *            Y translation
	 * @param z
	 *            Z translation
	 */
	public void setTranslation(double x, double y, double z) {
		// Save the old translation values
		EList<Double> prevTranslation = new BasicEList<Double>(translation);

		// Set translation
		translation.set(0, x);
		translation.set(1, y);
		translation.set(2, z);

		// Notify listeners of the change in scale
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Prototype5Package.TRANSFORMATION__TRANSLATION,
					prevTranslation, translation));
	}

	/**
	 * Creates a new Transformation which is a copy of this one.
	 * 
	 * @generated NOT
	 */
	public EObject clone() {
		//Create a new transformation and make it a copy of this one.
		Transformation clone = new TransformationImpl();
		clone.copy(this);
		
		return clone;
	}

	/**
	 * Replaces this object with a deep copy of the given transformation
	 * 
	 * @generated NOT
	 * 
	 * @param otherObject The object to copy into this one.
	 */
	public void copy(Object otherObject) {
		if (otherObject instanceof Transformation){
			Transformation otherTransformation = (Transformation) otherObject;
			rotation = new BasicEList<Double>(otherTransformation.getRotation());
			scale = new BasicEList<Double>(otherTransformation.getScale());
			size = otherTransformation.getSize();
			skew = new BasicEList<Double>(otherTransformation.getSkew());
			translation = new BasicEList<Double>(otherTransformation.getTranslation());
		}
	}

	/**
	 * Tests whether this object is equal to another.
	 * 
	 * @generated NOT
	 * 
	 * @param otherObject The object to test for equality
	 */
	public boolean equals(Object otherObject) {
		
		//If the references are the same, they are equal
		if (this == otherObject){
			return true;
		}
		
		//Check that the other object is a transformation
		if (otherObject instanceof Transformation){
			Transformation otherTransformation = (Transformation) otherObject;
			
			//Check each transformation's rotation
			EList<Double> otherRotation = otherTransformation.getRotation();
			for(int i = 0; i < rotation.size(); i++){
				if(Double.compare(rotation.get(i), otherRotation.get(i)) != 0){
					return false;
				}
			}
			
			//Check each transformation's scale
			EList<Double> otherScale = otherTransformation.getScale();
			for(int i = 0; i < scale.size(); i++){
				if(Double.compare(scale.get(i), otherScale.get(i)) != 0){
					return false;
				}
			}
			
			//Check each transformation's size
			if(Double.compare(size, otherTransformation.getSize()) != 0){
				return false;
			}
			
			//Check each transformation's skew
			EList<Double> otherSkew = otherTransformation.getSkew();
			for(int i = 0; i < skew.size(); i++){
				if(Double.compare(skew.get(i), otherSkew.get(i)) != 0){
					return false;
				}
			}
			
			//Check each transformation's translation
			EList<Double> otherTranslation = otherTransformation.getTranslation();
			for(int i = 0; i < translation.size(); i++){
				if(Double.compare(translation.get(i), otherTranslation.get(i)) != 0){
					return false;
				}
			}
			
			//If all the checks passed, they are equal.
			return true;
		}
		
		//The other object isn't a transformation, return false;
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Prototype5Package.TRANSFORMATION__ROTATION:
				return getRotation();
			case Prototype5Package.TRANSFORMATION__SCALE:
				return getScale();
			case Prototype5Package.TRANSFORMATION__SIZE:
				return getSize();
			case Prototype5Package.TRANSFORMATION__SKEW:
				return getSkew();
			case Prototype5Package.TRANSFORMATION__TRANSLATION:
				return getTranslation();
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
			case Prototype5Package.TRANSFORMATION__ROTATION:
				getRotation().clear();
				getRotation().addAll((Collection<? extends Double>)newValue);
				return;
			case Prototype5Package.TRANSFORMATION__SCALE:
				getScale().clear();
				getScale().addAll((Collection<? extends Double>)newValue);
				return;
			case Prototype5Package.TRANSFORMATION__SIZE:
				setSize((Double)newValue);
				return;
			case Prototype5Package.TRANSFORMATION__SKEW:
				getSkew().clear();
				getSkew().addAll((Collection<? extends Double>)newValue);
				return;
			case Prototype5Package.TRANSFORMATION__TRANSLATION:
				getTranslation().clear();
				getTranslation().addAll((Collection<? extends Double>)newValue);
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
			case Prototype5Package.TRANSFORMATION__ROTATION:
				getRotation().clear();
				return;
			case Prototype5Package.TRANSFORMATION__SCALE:
				getScale().clear();
				return;
			case Prototype5Package.TRANSFORMATION__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Prototype5Package.TRANSFORMATION__SKEW:
				getSkew().clear();
				return;
			case Prototype5Package.TRANSFORMATION__TRANSLATION:
				getTranslation().clear();
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
			case Prototype5Package.TRANSFORMATION__ROTATION:
				return rotation != null && !rotation.isEmpty();
			case Prototype5Package.TRANSFORMATION__SCALE:
				return scale != null && !scale.isEmpty();
			case Prototype5Package.TRANSFORMATION__SIZE:
				return size != SIZE_EDEFAULT;
			case Prototype5Package.TRANSFORMATION__SKEW:
				return skew != null && !skew.isEmpty();
			case Prototype5Package.TRANSFORMATION__TRANSLATION:
				return translation != null && !translation.isEmpty();
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
			case Prototype5Package.TRANSFORMATION___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE:
				setRotation((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case Prototype5Package.TRANSFORMATION___SET_SCALE__DOUBLE_DOUBLE_DOUBLE:
				setScale((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case Prototype5Package.TRANSFORMATION___SET_SKEW__DOUBLE_DOUBLE_DOUBLE:
				setSkew((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case Prototype5Package.TRANSFORMATION___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE:
				setTranslation((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case Prototype5Package.TRANSFORMATION___CLONE:
				return clone();
			case Prototype5Package.TRANSFORMATION___COPY__OBJECT:
				copy(arguments.get(0));
				return null;
			case Prototype5Package.TRANSFORMATION___EQUALS__OBJECT:
				return equals(arguments.get(0));
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
		result.append(" (rotation: ");
		result.append(rotation);
		result.append(", scale: ");
		result.append(scale);
		result.append(", size: ");
		result.append(size);
		result.append(", skew: ");
		result.append(skew);
		result.append(", translation: ");
		result.append(translation);
		result.append(')');
		return result.toString();
	}

} // TransformationImpl
