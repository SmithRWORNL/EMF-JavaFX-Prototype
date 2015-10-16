/**
 */
package prototype5.impl;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import prototype5.Edge;
import prototype5.EdgeAndVertexFace;
import prototype5.Prototype5Package;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Edge And Vertex Face</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class EdgeAndVertexFaceImpl extends FaceImpl implements EdgeAndVertexFace {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeAndVertexFaceImpl() {
		super();
	}

	/**
	 * An implementation of addEntity that adds both the Edge and its Vertices.
	 * This function assumes newEntity will be an Edge.
	 * 
	 */
	@Override
	public void addEntity(VizObject newEntity) {

		// If the new entity is not an edge, fail silently.
		if (newEntity instanceof Edge) {

			// Add the edge under the Edges category
			Edge edge = (Edge) newEntity;
			addEntityByCategory(newEntity, "Edges");

			// Add each of its vertices under the "Vertices" category
			for (VizObject vertex : edge.getEntitiesByCategory("Default")) {
				
				//Track whether the Vertices entry was found.
				boolean found = false;
				
				//Find the Vertices entry
				for (Entry<String, EList<VizObject>> entry : entities) {
					if (entry.getKey() == "Vertices") {
						found = true;
						
						//If the vertex isn't already inside, add it
						if (!(entry.getValue().contains(vertex))) {
							addEntityByCategory(vertex, "Vertices");
						}
					}
				}
				
				//If there was no Vertices category, create it and add the vertex.
				if (!found){
					addEntityByCategory(vertex, "Vertices");
				}
			}
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.EDGE_AND_VERTEX_FACE;
	}

} // EdgeAndVertexFaceImpl
