/**
 */
package prototype5;

import java.util.Map;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Mesh Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prototype5.AbstractMeshComponent#getType <em>Type</em>}</li>
 *   <li>{@link prototype5.AbstractMeshComponent#getUpdateLock <em>Update Lock</em>}</li>
 *   <li>{@link prototype5.AbstractMeshComponent#getEntities <em>Entities</em>}</li>
 *   <li>{@link prototype5.AbstractMeshComponent#getProperties <em>Properties</em>}</li>
 *   <li>{@link prototype5.AbstractMeshComponent#getAdapter <em>Adapter</em>}</li>
 * </ul>
 *
 * @see prototype5.Prototype5Package#getAbstractMeshComponent()
 * @model
 * @generated
 */
public interface AbstractMeshComponent extends VizObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link prototype5.MeshType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see prototype5.MeshType
	 * @see #setType(MeshType)
	 * @see prototype5.Prototype5Package#getAbstractMeshComponent_Type()
	 * @model
	 * @generated
	 */
	MeshType getType();

	/**
	 * Sets the value of the '{@link prototype5.AbstractMeshComponent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see prototype5.MeshType
	 * @see #getType()
	 * @generated
	 */
	void setType(MeshType value);

	/**
	 * Returns the value of the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Lock</em>' attribute.
	 * @see #setUpdateLock(AtomicBoolean)
	 * @see prototype5.Prototype5Package#getAbstractMeshComponent_UpdateLock()
	 * @model dataType="prototype5.AtomicBoolean"
	 * @generated
	 */
	AtomicBoolean getUpdateLock();

	/**
	 * Sets the value of the '{@link prototype5.AbstractMeshComponent#getUpdateLock <em>Update Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Lock</em>' attribute.
	 * @see #getUpdateLock()
	 * @generated
	 */
	void setUpdateLock(AtomicBoolean value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}&lt;java.lang.String, org.eclipse.emf.common.util.EList&lt;prototype5.VizObject>>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see prototype5.Prototype5Package#getAbstractMeshComponent_Entities()
	 * @model mapType="prototype5.EStringToVizObjectMap<org.eclipse.emf.ecore.EString, prototype5.VizObject>"
	 * @generated
	 */
	EList<Map.Entry<String, EList<VizObject>>> getEntities();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}&lt;java.lang.String, java.lang.String>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see prototype5.Prototype5Package#getAbstractMeshComponent_Properties()
	 * @model mapType="prototype5.EStringToEStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EList<Map.Entry<String, String>> getProperties();

	/**
	 * Returns the value of the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter</em>' attribute.
	 * @see #setAdapter(EContentAdapter)
	 * @see prototype5.Prototype5Package#getAbstractMeshComponent_Adapter()
	 * @model dataType="prototype5.EContentAdapter"
	 * @generated
	 */
	EContentAdapter getAdapter();

	/**
	 * Sets the value of the '{@link prototype5.AbstractMeshComponent#getAdapter <em>Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter</em>' attribute.
	 * @see #getAdapter()
	 * @generated
	 */
	void setAdapter(EContentAdapter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<VizObject> getEntitiesByCategory(String category);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getProperty(String property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setProperty(String property, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addEntity(VizObject newEntity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeEntity(VizObject entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addEntityByCategory(VizObject newEntity, String category);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model notificationDataType="prototype5.Notification"
	 * @generated
	 */
	void update(Notification notification);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void register(VizObject entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unregister(VizObject entity);

} // AbstractMeshComponent
