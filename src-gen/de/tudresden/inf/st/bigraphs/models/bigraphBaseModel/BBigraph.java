/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BBigraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph#getBRoots <em>BRoots</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph#getBEdges <em>BEdges</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph#getBInnerNames <em>BInner Names</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph#getBOuterNames <em>BOuter Names</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface BBigraph extends CDOObject {
	/**
	 * Returns the value of the '<em><b>BRoots</b></em>' containment reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BRoots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BRoots</em>' containment reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph_BRoots()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot#getBBigraph
	 * @model opposite="bBigraph" containment="true"
	 * @generated
	 */
	EList<BRoot> getBRoots();

	/**
	 * Returns the value of the '<em><b>BEdges</b></em>' containment reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BEdge}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BEdge#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BEdges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BEdges</em>' containment reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph_BEdges()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BEdge#getBBigraph
	 * @model opposite="bBigraph" containment="true"
	 * @generated
	 */
	EList<BEdge> getBEdges();

	/**
	 * Returns the value of the '<em><b>BInner Names</b></em>' containment reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BInner Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BInner Names</em>' containment reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph_BInnerNames()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName#getBBigraph
	 * @model opposite="bBigraph" containment="true"
	 * @generated
	 */
	EList<BInnerName> getBInnerNames();

	/**
	 * Returns the value of the '<em><b>BOuter Names</b></em>' containment reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BOuterName}.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BOuterName#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BOuter Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BOuter Names</em>' containment reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph_BOuterNames()
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BOuterName#getBBigraph
	 * @model opposite="bBigraph" containment="true"
	 * @generated
	 */
	EList<BOuterName> getBOuterNames();

} // BBigraph
