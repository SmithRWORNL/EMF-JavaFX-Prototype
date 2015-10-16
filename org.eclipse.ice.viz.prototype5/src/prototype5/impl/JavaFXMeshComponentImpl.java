/**
 */
package prototype5.impl;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EContentAdapter;

import prototype5.Face;
import prototype5.JavaFXMeshComponent;
import prototype5.MeshType;
import prototype5.Prototype5Package;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java FX Mesh Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JavaFXMeshComponentImpl extends AbstractMeshComponentImpl implements JavaFXMeshComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaFXMeshComponentImpl() {
		super();
	}
	
	public JavaFXMeshComponentImpl(Map<String, Object> input, MeshType type) {
		super(input, type);
	}
	
	/**
	 * A constructor which provides a set of child entities for the
	 * MeshComponent.
	 * 
	 * @param entities
	 *            The list of initial entities.
	 */
	public JavaFXMeshComponentImpl(List<VizObject> entities) {
		super();

		// Create a list of entities
		this.entities = new BasicEList<Entry<String, EList<VizObject>>>();

		// Convert the input into an Entry and add it to the map
		BasicEList<VizObject> tempList = new BasicEList<VizObject>(entities);
		Entry<String, EList<VizObject>> entry = new AbstractMap.SimpleEntry<String, EList<VizObject>>("Faces",
				tempList);
		this.entities.add(entry);
		
		//For each polygon, add all vertices to the entities map under their own category
		for(VizObject face : entities){
			Face castFace = (Face) face;
			
			//For each vertex, find the vertices category entry
			for(VizObject vertex : castFace.getEntitiesByCategory("Vertices")){
				for(Entry<String, EList<VizObject>> vertexEntry : this.entities){
					if(vertexEntry.getKey() == "Vertices"){
						
						//If the entry does not already contain the vertex, add it.
						if(!vertexEntry.getValue().contains(vertex)){
							vertexEntry.getValue().add(vertex);
						}
					}
				}
			}
		}

		// Instantiate the class variables
		properties = new BasicEList<Entry<String, String>>();
		type = MeshType.VOLUMETRIC;

		// Create an adapter set to run the update() method when a change is
		// fired.
		adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				update(notification);
			}
		};
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.JAVA_FX_MESH_COMPONENT;
	}

} //JavaFXMeshComponentImpl
