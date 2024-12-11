/**
 */
package org.bigraphs.model.bigraphBaseModel;

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
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBRoots <em>BRoots</em>}</li>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBEdges <em>BEdges</em>}</li>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBInnerNames <em>BInner Names</em>}</li>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBOuterNames <em>BOuter Names</em>}</li>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBSites <em>BSites</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface BBigraph extends CDOObject {
	/**
	 * Returns the value of the '<em><b>BRoots</b></em>' containment reference list.
	 * The list contents are of type {@link org.bigraphs.model.bigraphBaseModel.BRoot}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BRoot#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BRoots</em>' containment reference list.
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph_BRoots()
	 * @see org.bigraphs.model.bigraphBaseModel.BRoot#getBBigraph
	 * @model opposite="bBigraph" containment="true"
	 * @generated
	 */
	EList<BRoot> getBRoots();

	/**
	 * Returns the value of the '<em><b>BEdges</b></em>' containment reference list.
	 * The list contents are of type {@link org.bigraphs.model.bigraphBaseModel.BEdge}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BEdge#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BEdges</em>' containment reference list.
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph_BEdges()
	 * @see org.bigraphs.model.bigraphBaseModel.BEdge#getBBigraph
	 * @model opposite="bBigraph" containment="true"
	 * @generated
	 */
	EList<BEdge> getBEdges();

	/**
	 * Returns the value of the '<em><b>BInner Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.bigraphs.model.bigraphBaseModel.BInnerName}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BInnerName#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BInner Names</em>' containment reference list.
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph_BInnerNames()
	 * @see org.bigraphs.model.bigraphBaseModel.BInnerName#getBBigraph
	 * @model opposite="bBigraph" containment="true"
	 * @generated
	 */
	EList<BInnerName> getBInnerNames();

	/**
	 * Returns the value of the '<em><b>BOuter Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.bigraphs.model.bigraphBaseModel.BOuterName}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BOuterName#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BOuter Names</em>' containment reference list.
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph_BOuterNames()
	 * @see org.bigraphs.model.bigraphBaseModel.BOuterName#getBBigraph
	 * @model opposite="bBigraph" containment="true"
	 * @generated
	 */
	EList<BOuterName> getBOuterNames();

	/**
	 * Returns the value of the '<em><b>BSites</b></em>' containment reference list.
	 * The list contents are of type {@link org.bigraphs.model.bigraphBaseModel.BSite}.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BSite#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BSites</em>' containment reference list.
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBBigraph_BSites()
	 * @see org.bigraphs.model.bigraphBaseModel.BSite#getBBigraph
	 * @model opposite="bBigraph" containment="true"
	 * @generated
	 */
	EList<BSite> getBSites();

} // BBigraph
