/**
 */
package prototype5;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see prototype5.Prototype5Package
 * @generated
 */
public interface Prototype5Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Prototype5Factory eINSTANCE = prototype5.impl.Prototype5FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Face</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Face</em>'.
	 * @generated
	 */
	Face createFace();

	/**
	 * Returns a new object of class '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape</em>'.
	 * @generated
	 */
	Shape createShape();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertex</em>'.
	 * @generated
	 */
	Vertex createVertex();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Viz Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viz Object</em>'.
	 * @generated
	 */
	VizObject createVizObject();

	/**
	 * Returns a new object of class '<em>Abstract View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract View</em>'.
	 * @generated
	 */
	AbstractView createAbstractView();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Abstract Mesh Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Mesh Component</em>'.
	 * @generated
	 */
	AbstractMeshComponent createAbstractMeshComponent();

	/**
	 * Returns a new object of class '<em>Abstract Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Controller</em>'.
	 * @generated
	 */
	AbstractController createAbstractController();

	/**
	 * Returns a new object of class '<em>Java FX View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java FX View</em>'.
	 * @generated
	 */
	JavaFXView createJavaFXView();

	/**
	 * Returns a new object of class '<em>Java FX Mesh Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java FX Mesh Component</em>'.
	 * @generated
	 */
	JavaFXMeshComponent createJavaFXMeshComponent();

	/**
	 * Returns a new object of class '<em>Java FX Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java FX Controller</em>'.
	 * @generated
	 */
	JavaFXController createJavaFXController();

	/**
	 * Returns a new object of class '<em>Java FX Controller Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java FX Controller Factory</em>'.
	 * @generated
	 */
	JavaFXControllerFactory createJavaFXControllerFactory();

	/**
	 * Returns a new object of class '<em>Edge And Vertex Face</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge And Vertex Face</em>'.
	 * @generated
	 */
	EdgeAndVertexFace createEdgeAndVertexFace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Prototype5Package getPrototype5Package();

} //Prototype5Factory
