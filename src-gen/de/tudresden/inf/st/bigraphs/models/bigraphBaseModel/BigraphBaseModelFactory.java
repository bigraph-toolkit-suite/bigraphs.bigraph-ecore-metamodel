/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage
 * @generated
 */
public interface BigraphBaseModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BigraphBaseModelFactory eINSTANCE = de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>BRoot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BRoot</em>'.
	 * @generated
	 */
	BRoot createBRoot();

	/**
	 * Returns a new object of class '<em>BNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BNode</em>'.
	 * @generated
	 */
	BNode createBNode();

	/**
	 * Returns a new object of class '<em>BSite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BSite</em>'.
	 * @generated
	 */
	BSite createBSite();

	/**
	 * Returns a new object of class '<em>BPort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPort</em>'.
	 * @generated
	 */
	BPort createBPort();

	/**
	 * Returns a new object of class '<em>BInner Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BInner Name</em>'.
	 * @generated
	 */
	BInnerName createBInnerName();

	/**
	 * Returns a new object of class '<em>BEdge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BEdge</em>'.
	 * @generated
	 */
	BEdge createBEdge();

	/**
	 * Returns a new object of class '<em>BOuter Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOuter Name</em>'.
	 * @generated
	 */
	BOuterName createBOuterName();

	/**
	 * Returns a new object of class '<em>BBigraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BBigraph</em>'.
	 * @generated
	 */
	BBigraph createBBigraph();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BigraphBaseModelPackage getBigraphBaseModelPackage();

} //BigraphBaseModelFactory
