/**
 */
package prototype5.util;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import prototype5.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see prototype5.Prototype5Package
 * @generated
 */
public class Prototype5Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Prototype5Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prototype5Switch() {
		if (modelPackage == null) {
			modelPackage = Prototype5Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Prototype5Package.FACE: {
				Face face = (Face)theEObject;
				T result = caseFace(face);
				if (result == null) result = caseAbstractMeshComponent(face);
				if (result == null) result = caseVizObject(face);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = caseAbstractMeshComponent(shape);
				if (result == null) result = caseVizObject(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseAbstractMeshComponent(element);
				if (result == null) result = caseVizObject(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				T result = caseVertex(vertex);
				if (result == null) result = casePoint(vertex);
				if (result == null) result = caseAbstractMeshComponent(vertex);
				if (result == null) result = caseVizObject(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseAbstractMeshComponent(edge);
				if (result == null) result = caseVizObject(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.VIZ_OBJECT: {
				VizObject vizObject = (VizObject)theEObject;
				T result = caseVizObject(vizObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.ABSTRACT_VIEW: {
				AbstractView abstractView = (AbstractView)theEObject;
				T result = caseAbstractView(abstractView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.ICONTROLLER_FACTORY: {
				IControllerFactory iControllerFactory = (IControllerFactory)theEObject;
				T result = caseIControllerFactory(iControllerFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.ESTRING_TO_ESTRING_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> eStringToEStringMap = (Map.Entry<String, String>)theEObject;
				T result = caseEStringToEStringMap(eStringToEStringMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.ESTRING_TO_VIZ_OBJECT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EList<VizObject>> eStringToVizObjectMap = (Map.Entry<String, EList<VizObject>>)theEObject;
				T result = caseEStringToVizObjectMap(eStringToVizObjectMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = caseAbstractMeshComponent(point);
				if (result == null) result = caseVizObject(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.ABSTRACT_MESH_COMPONENT: {
				AbstractMeshComponent abstractMeshComponent = (AbstractMeshComponent)theEObject;
				T result = caseAbstractMeshComponent(abstractMeshComponent);
				if (result == null) result = caseVizObject(abstractMeshComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.ABSTRACT_CONTROLLER: {
				AbstractController abstractController = (AbstractController)theEObject;
				T result = caseAbstractController(abstractController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.JAVA_FX_VIEW: {
				JavaFXView javaFXView = (JavaFXView)theEObject;
				T result = caseJavaFXView(javaFXView);
				if (result == null) result = caseAbstractView(javaFXView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.JAVA_FX_MESH_COMPONENT: {
				JavaFXMeshComponent javaFXMeshComponent = (JavaFXMeshComponent)theEObject;
				T result = caseJavaFXMeshComponent(javaFXMeshComponent);
				if (result == null) result = caseAbstractMeshComponent(javaFXMeshComponent);
				if (result == null) result = caseVizObject(javaFXMeshComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.JAVA_FX_CONTROLLER: {
				JavaFXController javaFXController = (JavaFXController)theEObject;
				T result = caseJavaFXController(javaFXController);
				if (result == null) result = caseAbstractController(javaFXController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.JAVA_FX_CONTROLLER_FACTORY: {
				JavaFXControllerFactory javaFXControllerFactory = (JavaFXControllerFactory)theEObject;
				T result = caseJavaFXControllerFactory(javaFXControllerFactory);
				if (result == null) result = caseIControllerFactory(javaFXControllerFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Prototype5Package.EDGE_AND_VERTEX_FACE: {
				EdgeAndVertexFace edgeAndVertexFace = (EdgeAndVertexFace)theEObject;
				T result = caseEdgeAndVertexFace(edgeAndVertexFace);
				if (result == null) result = caseFace(edgeAndVertexFace);
				if (result == null) result = caseAbstractMeshComponent(edgeAndVertexFace);
				if (result == null) result = caseVizObject(edgeAndVertexFace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Face</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Face</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFace(Face object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viz Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viz Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVizObject(VizObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractView(AbstractView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IController Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IController Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIControllerFactory(IControllerFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To EString Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To EString Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToEStringMap(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To Viz Object Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To Viz Object Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToVizObjectMap(Map.Entry<String, EList<VizObject>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mesh Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mesh Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMeshComponent(AbstractMeshComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractController(AbstractController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java FX View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java FX View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaFXView(JavaFXView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java FX Mesh Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java FX Mesh Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaFXMeshComponent(JavaFXMeshComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java FX Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java FX Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaFXController(JavaFXController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java FX Controller Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java FX Controller Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaFXControllerFactory(JavaFXControllerFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge And Vertex Face</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge And Vertex Face</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeAndVertexFace(EdgeAndVertexFace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Prototype5Switch
