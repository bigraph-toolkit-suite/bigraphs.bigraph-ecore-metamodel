/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDynamic Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BDynamicSignature#getBControls <em>BControls</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBDynamicSignature()
 * @model
 * @generated
 */
public interface BDynamicSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>BControls</b></em>' reference list.
	 * The list contents are of type {@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BControls</em>' reference list.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBDynamicSignature_BControls()
	 * @model keys="name"
	 * @generated
	 */
	EList<BControl> getBControls();

} // BDynamicSignature
