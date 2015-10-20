/**
 */
package prototype5;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class which is responsible for user interactions with the underlying data structures which represent a part in a model. An AbstractController is associated with an AbstractMeshComponent, which is the internal representation of the part and any associated data, and an AbstractView, which holds the graphical representation of the object in the native data types of the rendering engine. 
 * 
 * The AbstractController is meant to completely encapsulate the functionality of the part. All client interactions with a part should take place through function calls to the part's AbstractController, without regard as to whether they are internally delegated to the model, the view, or both. The controller should not expose the model or view, or their implementation details, to the client. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prototype5.AbstractController#getDisposed <em>Disposed</em>}</li>
 *   <li>{@link prototype5.AbstractController#getModel <em>Model</em>}</li>
 *   <li>{@link prototype5.AbstractController#getView <em>View</em>}</li>
 * </ul>
 *
 * @see prototype5.Prototype5Package#getAbstractController()
 * @model
 * @generated
 */
public interface AbstractController extends EObject {
	/**
	 * Returns the value of the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disposed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the AbstractController and its data have been disposed. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposed</em>' attribute.
	 * @see #setDisposed(AtomicBoolean)
	 * @see prototype5.Prototype5Package#getAbstractController_Disposed()
	 * @model dataType="prototype5.AtomicBoolean"
	 * @generated
	 */
	AtomicBoolean getDisposed();

	/**
	 * Sets the value of the '{@link prototype5.AbstractController#getDisposed <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposed</em>' attribute.
	 * @see #getDisposed()
	 * @generated
	 */
	void setDisposed(AtomicBoolean value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(AbstractMeshComponent)
	 * @see prototype5.Prototype5Package#getAbstractController_Model()
	 * @model
	 * @generated
	 */
	AbstractMeshComponent getModel();

	/**
	 * Sets the value of the '{@link prototype5.AbstractController#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(AbstractMeshComponent value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(AbstractView)
	 * @see prototype5.Prototype5Package#getAbstractController_View()
	 * @model
	 * @generated
	 */
	AbstractView getView();

	/**
	 * Sets the value of the '{@link prototype5.AbstractController#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(AbstractView value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds a child entity to the part.
	 * 
	 * @param newEntity The entity to add as a child.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void addEntity(VizObject newEntity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signals the AbstractController to dispose of any resources it or its data members or their children possess. 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return a list of all this part's child entities. 
	 * 
	 * @return A list of all the part's child entities.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<VizObject> getEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get a list of all this part's children entities of a given category.
	 * 
	 * @param category The category of entities to get.
	 * @return A list of all entities belonging to the category
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<VizObject> getEntitiesByCategory(String category);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the transformation currently applied to this part in the graphical engine, ignoring all changes which have occurred since the last time the graphics engine refreshed it.
	 * 
	 * @return The last transformation which was applied in the rendering engine.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Transformation getPreviousTransformation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the value of the given property.
	 * 
	 * @param property The property whose value will be returned.
	 * @return The property's value
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	String getProperty(String property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the part's graphical representation, in a data type which is apprioriate to the rendering program used by this controller. 
	 * 
	 * @return The part's graphical representation.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="prototype5.Object"
	 * @generated
	 */
	Object getRepresentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get a list representing the part's rotation in the x, y, and z directions.
	 * 
	 * @return A list of part's three directional rotation amounts.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Double> getRotation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get a list representing the part's scale in the x, y, and z directions.
	 * 
	 * @return The part's three directional scales
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Double> getScale();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the part's size, representing its basic scale in all directions.
	 * 
	 * @return The part's size.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getSize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get a list representing the part's skew in the x, y, and z directions.
	 * 
	 * @return The part's three directional skew amounts
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Double> getSkew();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the transformation representing this part's current state.
	 * 
	 * Note that this transformation is not neccesarily up to date with the part's graphical representation. Rather, it includes all changes which have been applied to the part, regardless of whether these updates have been pushed to the graphics engine. 
	 * 
	 * @return The part's current transformation.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get a list representing the part's translation in the x, y, and z directions. 
	 * 
	 * @return The part's three directional translations
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Double> getTranslation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remove the given entity from this part's list of children.
	 * 
	 * @param entity The child entity to be removed.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void removeEntity(VizObject entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the specified property to the given new value.
	 * 
	 * @param property The property to set
	 * @param value The new contents of the property
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setProperty(String property, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the part's rotation in the x, y, and z directions.
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
	 * Set the part's scale in the x, y, and z directions.
	 * 
	 * @param x Scale along the x axis
	 * @param y Scale along the y axis
	 * @param z Scale along the z axis
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setScale(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the part's size, which controls its base scale in all directions.
	 * 
	 * @param newSize The part's new base size
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setSize(double newSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the part's skew in the x, y, and z directions.
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
	 * Set the part's transformation
	 * 
	 * @param newTransformation The new transformation
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setTransformation(Transformation newTransformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the part's translation in the x, y, and z directions
	 * 
	 * @param x Location along the x axis
	 * @param y Location along the y axis
	 * @patam z Location along the z axis
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setTranslation(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add a new child entity under the specified category.
	 * 
	 * @param newEntity The entity to add as a child of this part.
	 * @param category The category under which to add the new entity.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void addEntityByCategory(VizObject newEntity, String category);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function called whenever the controller receives an update from the model.
	 * 
	 * @param notification The message received from the model.
	 * <!-- end-model-doc -->
	 * @model notificationDataType="prototype5.Notification"
	 * @generated
	 */
	void modelUpdate(Notification notification);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function called whenever the controlelr receives an update from the view.
	 * 
	 * @param notification The message received from the view.
	 * <!-- end-model-doc -->
	 * @model notificationDataType="prototype5.Notification"
	 * @generated
	 */
	void viewUpdate(Notification notification);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Redraws the graphical representation based on the part's current state.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signals to the part that the graphical engine has finished rendering it. The part's current transformation should be applied before this function is called, so that the previous transformation can be reset.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void synched();

} // AbstractController
