/**
 */
package prototype5.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import prototype5.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see prototype5.Prototype5Package
 * @generated
 */
public class Prototype5AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Prototype5Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prototype5AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Prototype5Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Prototype5Switch<Adapter> modelSwitch =
		new Prototype5Switch<Adapter>() {
			@Override
			public Adapter caseFace(Face object) {
				return createFaceAdapter();
			}
			@Override
			public Adapter caseShape(Shape object) {
				return createShapeAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseVertex(Vertex object) {
				return createVertexAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseVizObject(VizObject object) {
				return createVizObjectAdapter();
			}
			@Override
			public Adapter caseAbstractView(AbstractView object) {
				return createAbstractViewAdapter();
			}
			@Override
			public Adapter caseIControllerFactory(IControllerFactory object) {
				return createIControllerFactoryAdapter();
			}
			@Override
			public Adapter caseEStringToEStringMap(Map.Entry<String, String> object) {
				return createEStringToEStringMapAdapter();
			}
			@Override
			public Adapter caseEStringToVizObjectMap(Map.Entry<String, EList<VizObject>> object) {
				return createEStringToVizObjectMapAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter caseAbstractMeshComponent(AbstractMeshComponent object) {
				return createAbstractMeshComponentAdapter();
			}
			@Override
			public Adapter caseAbstractController(AbstractController object) {
				return createAbstractControllerAdapter();
			}
			@Override
			public Adapter caseJavaFXView(JavaFXView object) {
				return createJavaFXViewAdapter();
			}
			@Override
			public Adapter caseJavaFXMeshComponent(JavaFXMeshComponent object) {
				return createJavaFXMeshComponentAdapter();
			}
			@Override
			public Adapter caseJavaFXController(JavaFXController object) {
				return createJavaFXControllerAdapter();
			}
			@Override
			public Adapter caseJavaFXControllerFactory(JavaFXControllerFactory object) {
				return createJavaFXControllerFactoryAdapter();
			}
			@Override
			public Adapter caseEdgeAndVertexFace(EdgeAndVertexFace object) {
				return createEdgeAndVertexFaceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link prototype5.Face <em>Face</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.Face
	 * @generated
	 */
	public Adapter createFaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.VizObject <em>Viz Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.VizObject
	 * @generated
	 */
	public Adapter createVizObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.AbstractView
	 * @generated
	 */
	public Adapter createAbstractViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.IControllerFactory <em>IController Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.IControllerFactory
	 * @generated
	 */
	public Adapter createIControllerFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To EString Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToEStringMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To Viz Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToVizObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.AbstractMeshComponent <em>Abstract Mesh Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.AbstractMeshComponent
	 * @generated
	 */
	public Adapter createAbstractMeshComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.AbstractController <em>Abstract Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.AbstractController
	 * @generated
	 */
	public Adapter createAbstractControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.JavaFXView <em>Java FX View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.JavaFXView
	 * @generated
	 */
	public Adapter createJavaFXViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.JavaFXMeshComponent <em>Java FX Mesh Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.JavaFXMeshComponent
	 * @generated
	 */
	public Adapter createJavaFXMeshComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.JavaFXController <em>Java FX Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.JavaFXController
	 * @generated
	 */
	public Adapter createJavaFXControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.JavaFXControllerFactory <em>Java FX Controller Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.JavaFXControllerFactory
	 * @generated
	 */
	public Adapter createJavaFXControllerFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prototype5.EdgeAndVertexFace <em>Edge And Vertex Face</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prototype5.EdgeAndVertexFace
	 * @generated
	 */
	public Adapter createEdgeAndVertexFaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Prototype5AdapterFactory
