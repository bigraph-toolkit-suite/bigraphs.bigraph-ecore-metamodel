/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage
 * @generated
 */
public interface SignatureBaseModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SignatureBaseModelFactory eINSTANCE = de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BDynamic Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BDynamic Signature</em>'.
	 * @generated
	 */
	BDynamicSignature createBDynamicSignature();

	/**
	 * Returns a new object of class '<em>BKind Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BKind Signature</em>'.
	 * @generated
	 */
	BKindSignature createBKindSignature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SignatureBaseModelPackage getSignatureBaseModelPackage();

} //SignatureBaseModelFactory
