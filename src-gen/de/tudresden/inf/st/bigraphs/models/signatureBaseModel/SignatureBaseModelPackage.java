/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelFactory
 * @model kind="package"
 * @generated
 */
public interface SignatureBaseModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "signatureBaseModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tudresden.inf.st.bigraphs.signature";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "signatureBaseModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SignatureBaseModelPackage eINSTANCE = de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BSignatureImpl <em>BSignature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BSignatureImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBSignature()
	 * @generated
	 */
	int BSIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>BControls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIGNATURE__BCONTROLS = 0;

	/**
	 * The number of structural features of the '<em>BSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIGNATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BSignature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BControlImpl <em>BControl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BControlImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBControl()
	 * @generated
	 */
	int BCONTROL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL__ARITY = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL__STATUS = 2;

	/**
	 * The number of structural features of the '<em>BControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus <em>BControl Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBControlStatus()
	 * @generated
	 */
	int BCONTROL_STATUS = 2;


	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSignature <em>BSignature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSignature</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSignature
	 * @generated
	 */
	EClass getBSignature();

	/**
	 * Returns the meta object for the reference list '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSignature#getBControls <em>BControls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BControls</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSignature#getBControls()
	 * @see #getBSignature()
	 * @generated
	 */
	EReference getBSignature_BControls();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl <em>BControl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BControl</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl
	 * @generated
	 */
	EClass getBControl();

	/**
	 * Returns the meta object for the attribute '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getName()
	 * @see #getBControl()
	 * @generated
	 */
	EAttribute getBControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getArity <em>Arity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arity</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getArity()
	 * @see #getBControl()
	 * @generated
	 */
	EAttribute getBControl_Arity();

	/**
	 * Returns the meta object for the attribute '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getStatus()
	 * @see #getBControl()
	 * @generated
	 */
	EAttribute getBControl_Status();

	/**
	 * Returns the meta object for enum '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus <em>BControl Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BControl Status</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus
	 * @generated
	 */
	EEnum getBControlStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SignatureBaseModelFactory getSignatureBaseModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BSignatureImpl <em>BSignature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BSignatureImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBSignature()
		 * @generated
		 */
		EClass BSIGNATURE = eINSTANCE.getBSignature();

		/**
		 * The meta object literal for the '<em><b>BControls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSIGNATURE__BCONTROLS = eINSTANCE.getBSignature_BControls();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BControlImpl <em>BControl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BControlImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBControl()
		 * @generated
		 */
		EClass BCONTROL = eINSTANCE.getBControl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONTROL__NAME = eINSTANCE.getBControl_Name();

		/**
		 * The meta object literal for the '<em><b>Arity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONTROL__ARITY = eINSTANCE.getBControl_Arity();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONTROL__STATUS = eINSTANCE.getBControl_Status();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus <em>BControl Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBControlStatus()
		 * @generated
		 */
		EEnum BCONTROL_STATUS = eINSTANCE.getBControlStatus();

	}

} //SignatureBaseModelPackage
