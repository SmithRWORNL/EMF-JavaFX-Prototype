/**
 */
package prototype5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stores the information needed to generate a 4D affine transformation matrix given certain transformation variables. The matrix transformations are applied in the following order: skew, size, scale, rotation, and translation
 * @author Jay Jay Billings
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prototype5.Transformation#getRotation <em>Rotation</em>}</li>
 *   <li>{@link prototype5.Transformation#getScale <em>Scale</em>}</li>
 *   <li>{@link prototype5.Transformation#getSize <em>Size</em>}</li>
 *   <li>{@link prototype5.Transformation#getSkew <em>Skew</em>}</li>
 *   <li>{@link prototype5.Transformation#getTranslation <em>Translation</em>}</li>
 * </ul>
 *
 * @see prototype5.Prototype5Package#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the rotation in radians along the x, y, and z axes passing through the origin
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute list.
	 * @see prototype5.Prototype5Package#getTransformation_Rotation()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Double> getRotation();

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the scaling factors in each of the three dimensions: x, y, and z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' attribute list.
	 * @see prototype5.Prototype5Package#getTransformation_Scale()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Double> getScale();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the amount of uniform scale for all three dimensions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see prototype5.Prototype5Package#getTransformation_Size()
	 * @model
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link prototype5.Transformation#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Skew</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skew</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of skew for each of the three axes: x, y, and z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skew</em>' attribute list.
	 * @see prototype5.Prototype5Package#getTransformation_Skew()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Double> getSkew();

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the translation along each of the three dimensions: x, y, and z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation</em>' attribute list.
	 * @see prototype5.Prototype5Package#getTransformation_Translation()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Double> getTranslation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the rotation values to the three given parameters
	 * 
	 * @param x The amount of x rotation
	 * @param y The amount of y rotation
	 * @param z The amount of z rotation
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setRotation(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the scale values to the three given parameters
	 * 
	 * @param x The x axis scale
	 * @param y The y axis scale
	 * @param z The z axis scale
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setScale(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the skew values to the three given parameters
	 * 
	 * @param x Skew in the x direction
	 * @param y Skew in the y direction
	 * @param z Skew in the z direction
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setSkew(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the translation values to the three given parameters
	 * 
	 * @param x Location along the x axis
	 * @param y Location along the y axis
	 * @param z Location along the z axis
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setTranslation(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a new object which is a copy of this one. 
	 * 
	 * @return The cloned object.
	 * <!-- end-model-doc -->
	 * @model dataType="prototype5.Object"
	 * @generated
	 */
	Object clone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deep copy the given object's data into the receiver. 
	 * 
	 * @param otherObject The object which will be copied into this one.
	 * <!-- end-model-doc -->
	 * @model otherObjectDataType="prototype5.Object"
	 * @generated
	 */
	void copy(Object otherObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checks the equality between this object and the given transformation.
	 * 
	 * @param otherObject The object with which to check equality.
	 * @return Whether or not the objects are equal
	 * <!-- end-model-doc -->
	 * @model otherObjectDataType="prototype5.Object"
	 * @generated
	 */
	boolean equals(Object otherObject);
} // Transformation
