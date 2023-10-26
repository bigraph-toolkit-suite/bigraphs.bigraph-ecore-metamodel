/**
 */
package org.bigraphs.model.bigraphBaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOuter Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.BOuterName#getBBigraph <em>BBigraph</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBOuterName()
 * @model
 * @generated
 */
public interface BOuterName extends BLink {
	/**
	 * Returns the value of the '<em><b>BBigraph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBOuterNames <em>BOuter Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BBigraph</em>' container reference.
	 * @see #setBBigraph(BBigraph)
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getBOuterName_BBigraph()
	 * @see org.bigraphs.model.bigraphBaseModel.BBigraph#getBOuterNames
	 * @model opposite="bOuterNames" required="true" transient="false"
	 * @generated
	 */
	BBigraph getBBigraph();

	/**
	 * Sets the value of the '{@link org.bigraphs.model.bigraphBaseModel.BOuterName#getBBigraph <em>BBigraph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BBigraph</em>' container reference.
	 * @see #getBBigraph()
	 * @generated
	 */
	void setBBigraph(BBigraph value);

} // BOuterName
