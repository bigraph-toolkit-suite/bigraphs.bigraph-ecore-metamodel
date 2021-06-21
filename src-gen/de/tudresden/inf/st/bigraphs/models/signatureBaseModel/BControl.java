/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BControl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getName <em>Name</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getArity <em>Arity</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getBSig <em>BSig</em>}</li>
 * </ul>
 *
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBControl()
 * @model abstract="true"
 * @generated
 */
public interface BControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBControl_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arity</em>' attribute.
	 * @see #setArity(int)
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBControl_Arity()
	 * @model
	 * @generated
	 */
	int getArity();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getArity <em>Arity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arity</em>' attribute.
	 * @see #getArity()
	 * @generated
	 */
	void setArity(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"ACTIVE"</code>.
	 * The literals are from the enumeration {@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus
	 * @see #setStatus(BControlStatus)
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBControl_Status()
	 * @model default="ACTIVE" required="true" ordered="false"
	 * @generated
	 */
	BControlStatus getStatus();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(BControlStatus value);

	/**
	 * Returns the value of the '<em><b>BSig</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSorting#getBControls <em>BControls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BSig</em>' container reference.
	 * @see #setBSig(BSorting)
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#getBControl_BSig()
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSorting#getBControls
	 * @model opposite="bControls" required="true" transient="false"
	 * @generated
	 */
	BSorting getBSig();

	/**
	 * Sets the value of the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getBSig <em>BSig</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BSig</em>' container reference.
	 * @see #getBSig()
	 * @generated
	 */
	void setBSig(BSorting value);

} // BControl
