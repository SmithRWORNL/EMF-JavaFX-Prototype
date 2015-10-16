/**
 */
package prototype5.impl;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import javafx.scene.shape.MeshView;
import javafx.scene.shape.Sphere;
import javafx.scene.shape.TriangleMesh;
import prototype5.AbstractMeshComponent;
import prototype5.Face;
import prototype5.JavaFXMeshComponent;
import prototype5.JavaFXView;
import prototype5.MeshType;
import prototype5.Prototype5Package;
import prototype5.Vertex;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Java FX View</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class JavaFXViewImpl extends AbstractViewImpl implements JavaFXView {
	/**
	 * The triangular mesh which displays a volumetric part's model in JavaFX.
	 */
	MeshView mesh;

	/**
	 * The sphere which displays a custom part's model in JavaFX.
	 */
	Sphere sphere;

	/**
	 * The type of mesh, and thus the type of object representation, of the
	 * associated model.
	 */
	MeshType type;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaFXViewImpl() {
		super();
	}

	public JavaFXViewImpl(JavaFXMeshComponent model) {
		super();

		// Get the model's mesh type.
		type = model.getType();

		// Create a triangle mesh for a custom type mesh
		if (type == MeshType.VOLUMETRIC) {

			// The list of Edges in the model
			EList<VizObject> originalFaces = model.getEntitiesByCategory("Faces");

			// The list of Vertex objects from the model
			ArrayList<Vertex> originalVertices = new ArrayList<Vertex>();

			// A description of faces as indices into the vertices array
			ArrayList<Integer> entities = new ArrayList<Integer>();

			// Check the vertices of each face, creating a representation of
			// each face as indices into the array of vertices with the ends of
			// arrays being represented by the value -1
			for (VizObject face : originalFaces) {
				Face castFace = (Face) face;
				for (VizObject vertex : castFace.getEntitiesByCategory("Vertices")) {
					Vertex castVertex = (Vertex) vertex;

					// Add the vertex to the list if it is not already there
					if (!originalVertices.contains(castVertex)) {
						originalVertices.add(castVertex);
					}

					// Add the vertex's index into the entity description
					entities.add(originalVertices.indexOf(castVertex));
				}

				// Mark the end of this face's description in the array
				entities.add(-1);
			}

			// An array of vertices represented as three-tuples of coordinates.
			ArrayList<Float> vertices = new ArrayList<Float>();

			// Convert the vertices into tuples of floats
			for (Vertex currentVertex : originalVertices) {
				Object[] doubleCoordinates = currentVertex.getLocation().toArray();
				float[] currentCoordinates = new float[3];
				for (int i = 0; i < 3; i++) {
					currentCoordinates[i] = ((Double) doubleCoordinates[i]).floatValue();
				}

				for (float coordinate : currentCoordinates) {
					vertices.add(coordinate);
				}
			}

			// Assume all entities are specified as convex polygons. Create a
			// triangle from vertex 0 for each other pair of adjacent vertices.
			// TODO Switch to ear clipping algorithm to allow for all simple
			// polygons.

			// Start is the first vertex of the current polygon
			int start = 0;

			// The array of polygons as indices into the vertex array
			ArrayList<Integer> polygons = new ArrayList<Integer>();

			// All polygons are complete when start has passed the last one
			while (start < entities.size()) {

				// j is the current vertex of the polygon.
				int j;

				// The polygon is complete when j reaches the special value -1,
				// demarcating the boundary between polygons.
				for (j = start + 2; entities.get(j) != -1; j++) {

					// Draw a triangle between vertex i, vertex j, and the
					// vertex prior to j. Since j starts at the third vertex,
					// this will cover the polygon's area with triangles.
					polygons.add(entities.get(start));
					polygons.add(0);
					polygons.add(entities.get(j - 1));
					polygons.add(0);
					polygons.add(entities.get(j));
					polygons.add(0);
				}

				// The next polygon starts after the -1 was found.
				start = j + 1;
			}

			TriangleMesh tMesh = new TriangleMesh();

			// Convert vertices into an array and add them to the mesh.
			float[] points = new float[vertices.size()];
			for (int i = 0; i < vertices.size(); i++) {
				points[i] = vertices.get(i);
			}
			tMesh.getPoints().addAll(points);

			// Do not apply a texture, instead add a single dummy coordinate.
			float[] texCoords = { 0, 0 };
			tMesh.getTexCoords().addAll(texCoords);

			// Convert entities into an array and add them to the mesh.
			int[] faces = new int[polygons.size()];
			for (int i = 0; i < polygons.size(); i++) {
				faces[i] = polygons.get(i);
			}
			tMesh.getFaces().addAll(faces);

			mesh = new MeshView(tMesh);

			// For spheres, create a sphere, getting the radius from the mesh
		} else if (type == MeshType.CUSTOM_PART) {
			sphere = new Sphere(Double.parseDouble(model.getProperty("radius")));
		}
	}

	/**
	 * Return the appropriate object holding the JavaFX representation, based on
	 * the component's type.
	 */
	@Override
	public Object getRepresentation() {
		if (type == MeshType.VOLUMETRIC) {
			return mesh;
		} else if (type == MeshType.CUSTOM_PART) {
			return sphere;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.JAVA_FX_VIEW;
	}

	@Override
	public void synched() {

		super.synched();
	}

	@Override
	public void refresh(AbstractMeshComponent model) {
		if (type == MeshType.CUSTOM_PART) {
			sphere.setRadius(Double.parseDouble(model.getProperty("radius")));
		}
	}

} // JavaFXViewImpl
